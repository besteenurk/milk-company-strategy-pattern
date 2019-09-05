
public class Artificial_food_habits implements Food_habits{

    public Double eat(double food, double water) {
        System.out.println("\nArtificial food taste good but not much as natural food..");
        System.out.println("We eat " + food + " gr artificial food and we drink " + water + " lt water with this food.\n");
        System.out.print("!!! Artificial food bring us milk as lt => ");
        double milk_and_food_ratio;

        if (food <= 50 && water <=15) {
            milk_and_food_ratio = food*0.9 + water*1.25;
            System.out.println(milk_and_food_ratio);
        } else {
            milk_and_food_ratio = food*1.70 + water*1.5;
            System.out.println(milk_and_food_ratio);
        }

        return milk_and_food_ratio;
    }


}
