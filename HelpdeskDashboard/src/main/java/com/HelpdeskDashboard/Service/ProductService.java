package com.HelpdeskDashboard.Service;

import com.HelpdeskDashboard.Business.ProductDAO;
import com.HelpdeskDashboard.Business.ProductDAOFakeImplementation;
import com.HelpdeskDashboard.Entitie.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    @Qualifier("Mysql")
    @Autowired
    private ProductDAO productDAO;

    public Collection<Product> getAllProducts(){
        return this.productDAO.getAllProducts();
    }
    public Product getProductById(int id){
        return this.productDAO.getProductById(id);
    }

    public String deleteProductById(int id) {
        return this.productDAO.deleteProductById(id);
    }

    public String updateProduct(Product product) {
        return this.productDAO.updateProduct(product);
    }

    public String insertProduct(Product product) {
        return this.productDAO.insertProduct(product);
    }
}
