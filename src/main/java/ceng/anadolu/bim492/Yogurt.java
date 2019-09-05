

public class Yogurt implements Milk{
    public double milk(double milk) {
        milk = milk*0.3;
        System.out.println("\n"+milk + " lt added for yogurt");
        System.out.println(".\n.\n It's doing \n.\n.");
        double yogurt = milk - 4.50;
        System.out.println("Yogurt done with total " + yogurt + " lt \n");
        System.out.println("\n___________________________________________________________________________");
        return milk;
    }
}
