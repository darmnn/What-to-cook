package by.company.whattocook.repos;

import by.company.whattocook.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
}