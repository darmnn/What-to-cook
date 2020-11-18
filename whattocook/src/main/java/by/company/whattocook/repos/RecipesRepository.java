package by.company.whattocook.repos;

import by.company.whattocook.models.Recipes;
import org.springframework.data.repository.CrudRepository;

public interface RecipesRepository extends CrudRepository<Recipes, Integer> {
}
