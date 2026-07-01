package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //to connect the backend
@RequestMapping("/product") //It is an path it will differ through this product keyword
@CrossOrigin(origins = "*")
public class ProductContoller {
    @Autowired
    private ProductRepository repo;
    @PostMapping("/store")
    public void storeproduct(@RequestBody Product p)
    {
         repo.save(p);
    }

    @GetMapping("/get")
    public List<Product> getproduct(){
        return repo.findAll();
    }
    @GetMapping("/getproduct/{id}")
    public Product getproduct(@PathVariable  int id){
        return repo.findById(id).orElse(null);
    }
    @GetMapping("/products/{name}")
    public List<Product> getProducts(@PathVariable String name){
        return repo.findByProductName(name);
    }
}

