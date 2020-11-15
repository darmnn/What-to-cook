package by.company.whattocook;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductInfo
{
    private ArrayList<String> productCategories;
    private HashMap<String, ArrayList<String>> products;

    public ProductInfo()
    {
        productCategories = new ArrayList<String>();
        productCategories.add("Молочные продукты");
        productCategories.add("Овощи");
        productCategories.add("Фрукты");
        productCategories.add("Бакалея");
        productCategories.add("Подсластители");
        productCategories.add("Специи");
        productCategories.add("Мясо");
        productCategories.add("Морепродукты");
        productCategories.add("Соусы");
        productCategories.add("Орехи");

        products = new HashMap<String, ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaaa");
        list.add("www");
        list.add("ooooooooooo");

        for(String category : productCategories)
        {
            products.put(category, list);
        }

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("молоко");
        list1.add("сыр");
        list1.add("сметана");
        products.put("Молочные продукты", list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("курица");
        list2.add("говядина");
        list2.add("свинина");
        products.put("Мясо", list2);
    }

    public HashMap<String, ArrayList<String>> getProducts()
    {
        return products;
    }
}
