

public class Fat_free_milk implements Milk {
    public double milk(double milk) {
        System.out.println("\nThis fat-free milk will done cow's milk with specified scale from farmer  ");
        milk = milk*0.1;
        System.out.println("\n"+milk + " added for fat free milk");
        System.out.println(".\n.\n It's doing \n.\n.");
        double m = milk - 2;
        System.out.println("Fat-free milk done with total " + m + " lt milk \n");
        System.out.println("\n___________________________________________________________________________");
        return milk;
    }
}
