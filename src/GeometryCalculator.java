import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args){
        //declarations
        Scanner geomObj = new Scanner(System.in);
        Scanner optionObj = new Scanner(System.in);
        double radius;
        double height;
        double baseArea;
        double lengthA;
        double lengthB;
        double lengthC;
        double pi = Math.PI;
        boolean isTrue = true;
        int userInput;

        //displays a menu for the user to select options
        while(isTrue) {
            System.out.println("Menu");
            System.out.println("1. Calculate the volume and surface area of a sphere");
            System.out.println("2. Calculate the volume and surface area of a right cylinder");
            System.out.println("3. Calculate the volume and surface area of a right circular cone");
            System.out.println("4. Calculate the volume and surface area of a triangular prism");
            System.out.println("5. Exit\n");

            //get user input
            System.out.print("Please select an option in the menu: ");
            userInput = optionObj.nextInt();

            switch (userInput) {
                case 1:
                    //get user input for sphere
                    System.out.print("Enter the radius: ");
                    radius = geomObj.nextDouble();

                    //output
                    sphereCalculate(radius, pi);
                    System.out.print("\n");
                    continue;
                case 2:
                    //get user inputs for right cylinder
                    System.out.print("Enter the radius: ");
                    radius = geomObj.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObj.nextDouble();

                    //output
                    rightCylinderCalc(radius, pi, height);
                    System.out.print("\n");
                    continue;
                case 3:
                    //get user inputs for right circular cone
                    System.out.print("Enter the radius: ");
                    radius = geomObj.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObj.nextDouble();

                    //output
                    rightCircConeCalc(radius, pi, height);
                    System.out.print("\n");
                    continue;
                case 4:
                    //get user inputs for triangular prism
                    System.out.print("Enter the area of the triangle's base: ");
                    baseArea = geomObj.nextDouble();
                    System.out.print("Enter side length a: ");
                    lengthA = geomObj.nextDouble();
                    System.out.print("Enter side length b: ");
                    lengthB = geomObj.nextDouble();
                    System.out.print("Enter side length c: ");
                    lengthC = geomObj.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObj.nextDouble();

                    //output
                    triangPrismCalc(baseArea,lengthA, lengthB, lengthC, height);
                    System.out.print("\n");
                    continue;
                case 5:
                    System.out.println("Exited");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Input, Try Again");

            }
        }

    }

    public static double[] sphereCalculate(double radiusPar, double piPar) {
        //declarations
        double[] sphereCalc = new double[2];
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = (4.0) * piPar * Math.pow(radiusPar, 2.0);
        volume = (4.0 / 3.0) * piPar * Math.pow(radiusPar, 3.0);

        sphereCalc[0] = surfaceArea;
        sphereCalc[1] = volume;
        System.out.printf("Surface Area: %.2f%n", sphereCalc[0]);
        System.out.printf("Volume: %.2f%n", sphereCalc[1]);

        return sphereCalc;
    }

    public static double[] rightCylinderCalc(double radiusPar, double piPar, double heightPar) {
        //declarations
        double[] rightCylCalc = new double[2];
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = ((2.0) * piPar * radiusPar * heightPar) + ((2.0) * piPar * Math.pow(radiusPar, 2.0));
        volume = piPar * Math.pow(radiusPar, 2.0) * heightPar;

        rightCylCalc[0] = surfaceArea;
        rightCylCalc[1] = volume;
        System.out.printf("Surface Area: %.2f%n", rightCylCalc[0]);
        System.out.printf("Volume: %.2f%n", rightCylCalc[1]);

        return rightCylCalc;
    }

    public static double[] rightCircConeCalc(double radiusPar, double piPar, double heightPar) {
        //declarations
        double[] rightCirConeCalc = new double[2];
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = (piPar * radiusPar) * (radiusPar + Math.sqrt(Math.pow(heightPar, 2.0)
                + Math.pow(radiusPar,2.0)));
        volume = piPar * Math.pow(radiusPar, 2.0) * (heightPar / 3.0);

        rightCirConeCalc[0] = surfaceArea;
        rightCirConeCalc[1] = volume;
        System.out.printf("Surface Area: %.2f%n", rightCirConeCalc[0]);
        System.out.printf("Volume: %.2f%n", rightCirConeCalc[1]);

        return rightCirConeCalc;
    }

    public static double[] triangPrismCalc(double baseAreaPar, double lengthAPar,
                                           double lengthBPar, double lengthCPar, double heightPar) {
        //declarations
        double[] trianPriCalc = new double[2];
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = (2.0 * baseAreaPar) + (lengthAPar + lengthBPar + lengthCPar) * heightPar;
        volume = ((1.0 / 4.0) * heightPar) * Math.sqrt(-Math.pow(lengthAPar, 4.0) + 2.0 *
                Math.pow((lengthAPar * lengthBPar), 2.0) + 2.0 * Math.pow((lengthAPar * lengthCPar), 2.0) -
                Math.pow(lengthBPar, 4.0) + 2.0 * Math.pow(lengthBPar * lengthCPar, 2.0)
                - Math.pow(lengthCPar, 4.0));

        trianPriCalc[0] = surfaceArea;
        trianPriCalc[1] = volume;
        System.out.printf("Surface Area: %.2f%n", trianPriCalc[0]);
        System.out.printf("Volume: %.2f%n", trianPriCalc[1]);

        return trianPriCalc;
    }

}
