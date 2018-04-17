package com.HelpdeskDashboard.Business;

import com.HelpdeskDashboard.Entitie.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository("Mysql")
@Qualifier("Mysql")
public class ProductDAOMysqlImplementation implements ProductDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    private static class ProductRowMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet resultSet, int i) throws SQLException {
            Product product = new Product();
            product.setProductID(resultSet.getInt("ProductID"));
            product.setProductName(resultSet.getString("ProductName"));
            product.setProductDesc(resultSet.getString("ProductDesc"));
            product.setStartingInventory(resultSet.getInt("StartingInventory"));
            product.setInventoryReceived(resultSet.getInt("InventoryReceived"));
            product.setInventoryUsed(resultSet.getInt("InventoryUsed"));
            product.setInventoryOnHand(resultSet.getInt("InventoryOnHand"));
            product.setMinimumRequired(resultSet.getInt("MinimumRequired"));
            product.setDateLastUpdate(resultSet.getString("DateLastUpdate"));
            return product;
        }
    }
    @Override
    public Collection<Product> getAllProducts() {
        final String sql = "Select * from tProduct";
        List<Product> Products = jdbctemplate.query(sql, new ProductRowMapper());
        return Products;
    }

    @Override
    public Product getProductById(int id) {
        final String sql = "Select * from tProduct where ProductID = ?";
        Product product = jdbctemplate.queryForObject(sql, new ProductRowMapper(), id);
        return product;
    }

    @Override
    public String deleteProductById(int id) {
        final String sql = "delete from tProduct where ProductID = ?";
        jdbctemplate.update(sql, id);
        return "Successfully Deleted !";
    }

    @Override
    public String updateProduct(Product product)
    {
        final String sql = "Update tProduct set ProductName = ? , ProductDesc = ? " +
                ", StartingInventory = ? , InventoryReceived = ? " +
                ", InventoryUsed = ? , InventoryOnHand = ? " +
                ", MinimumRequired = ? , DateLastUpdate = ? " +
                "where  ProductID = ?";
        int id = product.getProductID();
        final String prname = product.getProductName();
        final String prdesc = product.getProductDesc();
        final int prstartinginv = product.getStartingInventory();
        final int prinvreceived = product.getInventoryReceived();
        final int prinvused = product.getInventoryUsed();
        final int prinvonhand = product.getInventoryOnHand();
        final int prminimumrequired = product.getMinimumRequired();
        final String prdatelast = product.getDateLastUpdate();

        jdbctemplate.update(sql, new Object[] {prname,prdesc,prstartinginv,prinvreceived,prinvused,prinvonhand,prminimumrequired,prdatelast,id });
        return "Successfully Updated !";
    }

    @Override
    public String insertProduct(Product product)
    {
        final String sql = "Insert into tProduct (ProductName , ProductDesc, StartingInventory, InventoryReceived, InventoryUsed , InventoryOnHand, MinimumRequired, DateLastUpdate) Values (?,?,?,?,?,?,?,?)";
        final String prname = product.getProductName();
        final String prdesc = product.getProductDesc();
        final int prstartinginv = product.getStartingInventory();
        final int prinvreceived = product.getInventoryReceived();
        final int prinvused = product.getInventoryUsed();
        final int prinvonhand = product.getInventoryOnHand();
        final int prminimumrequired = product.getMinimumRequired();
        final String prdatelast = product.getDateLastUpdate();

        jdbctemplate.update(sql, new Object[] {prname,prdesc,prstartinginv,prinvreceived,prinvused,prinvonhand,prminimumrequired,prdatelast});
        return "Successfully Inserted !";
    }
}
