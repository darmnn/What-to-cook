package by.company.whattocook.controllers;

import by.company.whattocook.ProductInfo;
import models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repos.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.HashAttributeSet;
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

        Iterable<Products> products = productsRepository.findAll();
        model.addAttribute("products", products);
        return "home";
    }

}
