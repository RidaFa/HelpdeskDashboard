package com.HelpdeskDashboard.Business;

import com.HelpdeskDashboard.Entitie.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("Fake")
public class ProductDAOFakeImplementation implements ProductDAO {
    private static Map<Integer, Product> Products;
    static{
        Products = new HashMap<Integer, Product>(){
            {
                put(1, new Product(1,"VGA","VGA 2m",2,0,1, 1,3,"01/08/2018"));
                put(2, new Product(2,"HDMI","HDMI 2m",2,0,1, 1,3,"01/08/2018"));
            }
        };
    }
    @Override
    public Collection<Product> getAllProducts(){
        return this.Products.values();
    }
    @Override
    public Product getProductById(int id){
        return this.Products.get(id);
    }

    @Override
    public String deleteProductById(int id) {
        this.Products.remove(id);
        return "Successfully deleted !";
    }

    @Override
    public String updateProduct(Product product) {
        Product p = Products.get(product.getProductID());
        p.setProductName(product.getProductName());
        p.setProductDesc(product.getProductDesc());
        p.setStartingInventory(product.getStartingInventory());
        p.setInventoryReceived(product.getInventoryReceived());
        p.setInventoryUsed(product.getInventoryUsed());
        p.setInventoryOnHand(product.getInventoryOnHand());
        p.setMinimumRequired(product.getMinimumRequired());
        p.setDateLastUpdate(product.getDateLastUpdate());
        this.Products.put(product.getProductID(),product);
        return "Successfully updated !";
    }

    @Override
    public String insertProduct(Product product) {
        this.Products.put(product.getProductID(), product);
        return "Successfully updated !";
    }
}
