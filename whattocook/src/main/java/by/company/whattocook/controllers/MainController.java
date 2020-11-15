package by.company.whattocook.controllers;

import by.company.whattocook.models.Products;
import by.company.whattocook.repos.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MainController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("/")
    public String home(Model model)
    {
        /*ProductInfo productInfo = new ProductInfo();
        HashMap<String, ArrayList<String>> products = new HashMap<String, ArrayList<String>>();
        products = productInfo.getProducts();

        model.addAttribute("products", products);
        return "home";*/

        Iterable<Products> productInfo = productsRepository.findAll();
        HashMap<String, ArrayList<String>> products = new HashMap<String, ArrayList<String>>();

        for(Products product : productInfo)
        {
            String[] productArr = product.getProducts().split(",");
            ArrayList<String> productList = new ArrayList<String>();

            for(int i = 0; i < productArr.length; i++)
                productList.add(productArr[i]);

            products.put(product.getCategory(), productList);
        }

        model.addAttribute("products", products);
        return "home";
    }

}
