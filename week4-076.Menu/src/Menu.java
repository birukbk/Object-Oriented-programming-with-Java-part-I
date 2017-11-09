
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }

}
