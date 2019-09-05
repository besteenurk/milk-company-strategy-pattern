
public class Cheese implements Milk {
    public double milk(double milk) {
        milk = milk*0.4;
        System.out.println("\n"+milk + " lt added for cheese");
        System.out.println(".\n.\n It's doing \n.\n.");
        double cheese = milk - 5.60;
        System.out.println("Cheese done with total " + cheese  + " lt \n");
        System.out.println("\n___________________________________________________________________________");
        return milk;
    }
}
