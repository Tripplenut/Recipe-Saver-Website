package triplenut.recipesaver.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import triplenut.recipesaver.service.RecipeService;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    //Handles Recipe List request and returns to view
    @GetMapping("/recipe")
    public String listRecipes(Model model){
        model.addAttribute("recipes",recipeService.getAllRecipes());
        return "recipes";
    }


}
