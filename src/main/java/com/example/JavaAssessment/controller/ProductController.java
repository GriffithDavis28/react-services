package com.example.JavaAssessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.JavaAssessment.models.Product;
import com.example.JavaAssessment.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product prod)
    {
        return productService.createProd(prod);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id)
    {
        return productService.getProdById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product)
    {

        return productService.updateProd(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id)
    {
        Product prod = productService.delProd(id);
        if(prod!=null){
            return "Product deleted successfully";
        }
        else
        {
            return null;
        }
    }

    @PostMapping("/upload")
    public Product uploadProducts(@RequestParam("file") MultipartFile file ) {        
        try {
            return productService.uploadFile(file);
        } catch (Exception e) {
            return null;
        }
    }
    

}
