package by.company.whattocook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
