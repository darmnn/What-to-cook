package by.company.whattocook.models;

import javax.persistence.*;

@Entity
public class Recipes
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;
    String productList;
    String annotation;

    @Column(columnDefinition = "TEXT")
    String recipe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
