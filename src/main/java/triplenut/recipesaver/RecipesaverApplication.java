package triplenut.recipesaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import triplenut.recipesaver.entity.Recipe;
import triplenut.recipesaver.repository.RecipeRepository;

@SpringBootApplication
public class RecipesaverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecipesaverApplication.class, args);
	}

	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public void run(String... args) throws Exception {
		/* Test to see if everything works
		Recipe recipe1 = new Recipe("Chocolate Chip Cookies","Make the cookies and eat while hot but not so hot that " +
				"you burn your tongue. Then it is too hot", "Chocolate chips, Cookie Dough, some love");
		recipeRepository.save(recipe1);
		 */
	}
}
