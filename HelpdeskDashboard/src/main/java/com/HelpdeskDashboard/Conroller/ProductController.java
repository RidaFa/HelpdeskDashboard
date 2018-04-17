package com.HelpdeskDashboard.Conroller;

import com.HelpdeskDashboard.Entitie.Product;
import com.HelpdeskDashboard.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method= RequestMethod.GET)
    public Collection<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Product getProductById(@PathVariable("id") int id){
        return this.productService.getProductById(id);
    }
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteProductById(@PathVariable("id") int id){
        return this.productService.deleteProductById(id);
    }
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertProduct(@RequestBody Product product){
        return this.productService.insertProduct(product);
    }
}
