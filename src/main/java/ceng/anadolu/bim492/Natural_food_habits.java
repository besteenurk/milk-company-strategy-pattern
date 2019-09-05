

public class Natural_food_habits implements Food_habits {


    public Double eat(double food, double water) {
        System.out.println("We love natural foods.");
        System.out.println("We eat " + food + " gr natural foods and we drink " + water + " lt water with this food.\n");
        System.out.print("!!! Natural food bring us milk as lt =>  ");

        double milk_and_food_ratio;

        if (food <= 50 && water <=15) {
            milk_and_food_ratio = food*1.5 + water*1.25;
            System.out.println(milk_and_food_ratio);
        } else {
            milk_and_food_ratio = food*2.50 + water*2.0;
            System.out.println(milk_and_food_ratio);
        }
        return milk_and_food_ratio;
    }

}
