import java.util.Scanner;

public class ex {
    public static void main(String[]args) {

        Scanner scanner = new Scanner (System.in);
        String cat;

        System.out.print("Enter the molar mass of the gas in Kilograms: ");
        double mMass = scanner.nextDouble();

        System.out.print("Enter the temperature of the gas in Kelvin: ");
        double temp = scanner.nextDouble();

        float vP = calculateMspeed(mMass, temp);
        double rounded = Math.round(vP * 100.0)/100.0;

        if((vP>=0) && (vP<=500)) {
            cat = "Slow";
        } else if((vP>=501) && (vP<=1000)) {
            cat = "Medium";
        } else if(vP >=1001) {
            cat = "Fast";
        } else {
            cat = "Not Specified";
        }

        System.out.println("Root mean square speed of a gas molecule: " + vP);
        System.out.println("Rounded answer: " + rounded);
        System.out.println("Category: " + cat);
        scanner.close();
    }

    //CalculateMspeed method
    public static float calculateMspeed(double mMass, double temp) {
        double R = 8.314;
        double vP = Math.sqrt((3*R*temp)/mMass);
        return (float) vP;
    }
}

