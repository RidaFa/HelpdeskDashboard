package com.HelpdeskDashboard.Business;

import com.HelpdeskDashboard.Entitie.Product;

import java.util.Collection;

public interface ProductDAO {
    Collection<Product> getAllProducts();

    Product getProductById(int id);

    String deleteProductById(int id);

    String updateProduct(Product product);

    String insertProduct(Product product);
}
