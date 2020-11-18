package by.company.whattocook.controllers;

import by.company.whattocook.models.Products;
import by.company.whattocook.models.Recipes;
import by.company.whattocook.repos.ProductsRepository;
import by.company.whattocook.repos.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@Controller
public class MainController {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private RecipesRepository recipesRepository;

    private ArrayList<String> productsForSearch;

    @GetMapping("/")
    public String home(Model model)
    {
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

        Iterable<Recipes> allRecipes = recipesRepository.findAll();
        ArrayList<Recipes> recipesInfo = new ArrayList<Recipes>();

        for(Recipes recipe : allRecipes)
        {
            ArrayList<String> productList = new ArrayList<String>();
            String[] recipesArr = recipe.getProductList().split(",");

            for(int i = 0; i < recipesArr.length; i++)
                productList.add(recipesArr[i]);

            if(productsForSearch != null)
            {
                Collections.sort(productList);
                Collections.sort(productsForSearch);

                if (productList.equals(productsForSearch)) recipesInfo.add(recipe);
            }
        }


        model.addAttribute("recipes", recipesInfo);

        return "home";
    }


    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String search(Model model, @RequestParam(defaultValue = "false") ArrayList<String> selectedItems)
    {
        productsForSearch = new ArrayList<String>();

        for(String el : selectedItems)
            productsForSearch.add(el);

        model.addAttribute("selected", selectedItems);
        return "redirect:/";
    }
}
