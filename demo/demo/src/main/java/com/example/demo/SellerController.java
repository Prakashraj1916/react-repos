package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerRepository sellrepo;

    @PostMapping("/sellpost")
    public void createPosting(@RequestBody Seller sell)
    {
        sellrepo.save(sell);
    }
    @GetMapping("/sellget")
    public List<Seller> createGetting() {
        return sellrepo.findAll();
    }
}
