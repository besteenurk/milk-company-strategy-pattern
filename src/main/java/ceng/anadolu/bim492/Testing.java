

public class Testing {

    public static void main(String[] args) {


        Animal animal_milk_lt = new Cow();
        Animal animal_sheep = new Sheep();

        Natural_food_habits natural_food_habits = new Natural_food_habits();
        Double a = natural_food_habits.eat(80.0, 40);
        Artificial_food_habits artificial_food_habits = new Artificial_food_habits();
        Double b = artificial_food_habits.eat(60,40);
        double milk_lt = a + b;
        System.out.println("\n____________________________\n\nToday total milk lt is " +milk_lt +"\n____________________________\n\n_____" +
                "______________________________________________________________________\n");

        System.out.println("--> Total milk split 4 pieces as yogurt, fat milk, fat-free milk and cheese\n_____" +
                "______________________________________________________________________\n");
        System.out.println("Processes are starting..\n");
        // use them at the end
        System.out.println("\nThis yogurt will done sheep's milk with specified scale from farmer ");
        animal_sheep.milk_to_yogurt(milk_lt*0.3);
        System.out.println("\nThis yogurt will done cows's milk with specified scale from farmer");
        animal_milk_lt.milk_to_yogurt(milk_lt*0.70);
        System.out.println("\nThis cheese will done sheep's milk with specified scale from farmer");
        animal_sheep.milk_to_cheese(milk_lt*0.6);
        System.out.println("\nThis cheese will done cow's milk with specified scale from farmer  ");
        animal_milk_lt.milk_to_cheese(milk_lt*0.4);
        animal_milk_lt.milk_to_fat_free_milk(milk_lt);
        animal_milk_lt.milk_to_fat_milk(milk_lt);


    }
}
