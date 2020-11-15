package by.company.whattocook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Products
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String category;
    private String productList;

    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getProducts() {
        return productList;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProducts(String products) {
        this.productList = products;
    }
}

