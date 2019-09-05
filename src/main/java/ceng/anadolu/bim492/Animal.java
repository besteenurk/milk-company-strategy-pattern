
public abstract class Animal {

    Milk yogurt, fat_milk, fat_free_milk, cheese;
    Food_habits natural_food_habits, artificial_food_habits;

    public Animal() {

    }

    public void natural_food_habit(Food_habits food_habits) {
        natural_food_habits = food_habits;
    }
    public void artificial_food_habit(Food_habits food_habits) {
        artificial_food_habits = food_habits;
    }
    public void milk_to_yogurt(Double milk) {
        yogurt.milk(milk);
    }
    public void milk_to_fat_milk(Double milk) {
        fat_milk.milk(milk);
    }
    public void milk_to_fat_free_milk(Double milk) {
        fat_free_milk.milk(milk);
    }
    public void milk_to_cheese(Double milk) {
        cheese.milk(milk);
    }


}
