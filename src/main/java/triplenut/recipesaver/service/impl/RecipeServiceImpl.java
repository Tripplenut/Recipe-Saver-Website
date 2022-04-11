package triplenut.recipesaver.service.impl;
import org.springframework.stereotype.Service;
import triplenut.recipesaver.entity.Recipe;
import triplenut.recipesaver.repository.RecipeRepository;
import triplenut.recipesaver.service.RecipeService;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

}
