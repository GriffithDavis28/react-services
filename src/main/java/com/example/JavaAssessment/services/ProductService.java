package com.example.JavaAssessment.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.JavaAssessment.models.Product;
import com.example.JavaAssessment.repos.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository prodRepo;

    public Product createProd(Product prod) {
        return prodRepo.save(prod);
    }

    public List<Product> getProducts() {
        return prodRepo.findAll();
    }

    public Product getProdById(String id) {
        return prodRepo.findById(id).get();
    }

    public Product updateProd(String id, Product existingProd) {
        Optional<Product> orignalProd = prodRepo.findById(id);
        Product updateProduct = orignalProd.get();
        if (orignalProd.isPresent()) {
            updateProduct.setName(existingProd.getName());
            updateProduct.setDescription(existingProd.getDescription());
            updateProduct.setPrice(existingProd.getPrice());
            return prodRepo.save(updateProduct);
        } else {
            return new Product();
        }
    }

    public Product delProd(String id) {
        Product prod = prodRepo.findById(id).orElse(null);
        if (prod != null) {
            prodRepo.deleteById(id);
            return prod;
        }
        else
        {
            return null;
        }
    }

    public Product uploadFile(MultipartFile file) {

        List<Product> newProductList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()));
            String line;
            boolean isHeader=true;
            while ((line = br.readLine())!= null) {
                if(isHeader){
                    isHeader=false;
                    continue;
                }
                String[] products = line.split(",");

                Product prod = new Product();
                // prod.setId(products[0]);
                prod.setName(products[1]);
                prod.setPrice(Double.parseDouble(products[2]));
                prod.setDescription(products[3]);

                newProductList.add(prodRepo.save(prod));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return null;
    }
}
