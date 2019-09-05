
public class Fat_milk implements Milk {
    public double milk(double milk) {
        System.out.println("\nThis fat milk will done cow's milk with specified scale from farmer");
        milk = milk*0.2;
        System.out.println("\n"+milk + " lt added for fat milk");
        System.out.println(".\n.\n It's doing \n.\n.");
        double m = milk - 1;
        System.out.println("Fat milk done with total " + m + " lt milk \n");
        return milk;
    }
}
