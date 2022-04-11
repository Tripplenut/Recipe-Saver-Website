package triplenut.recipesaver.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import triplenut.recipesaver.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
