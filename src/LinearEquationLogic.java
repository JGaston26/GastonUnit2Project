import java.util.Scanner;
import java.lang.Math;

public class LinearEquationLogic {

    private LinearEquation lnEqtn;
    private Scanner scan;
    public LinearEquationLogic()
    {
        lnEqtn = null;
        scan = new Scanner(System.in);
    }

    public void start(){
        getCoords();
    }

    public int getX(String coordinate)
    {
        return Integer.parseInt(coordinate.substring(1,coordinate.indexOf(",")));
    }
    public int getY(String coordinate)
    {
        return Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 1,coordinate.indexOf(")")));
    }

    public void getCoords()
    {
        String initiate = "y";

        while (initiate.equals("y"))
        {
            System.out.print("Enter in the first coordinates(like this: (x, y) ");
            String coord1 = scan.nextLine();
            int x1 = getX(coord1);
            int y1 = getY(coord1);

            System.out.print("Enter in the second coordinates(like this: (x, y) ");
            String coord2 = scan.nextLine();
            int x2 = getX(coord2);
            int y2 = getY(coord2);

            lnEqtn = new LinearEquation(x1,y1,x2,y2);
            System.out.println(lnEqtn.lineInfo());

            System.out.println(" ");
            System.out.print("Enter in an x value: ");
            double xValue = scan.nextDouble();
            scan.nextLine();
            System.out.println(lnEqtn.coordinateForX(xValue));

            System.out.println(" ");
            System.out.print("Would you like to enter another pair of coordinates(y/n)? : ");
            String ask = scan.nextLine();
            if(ask.equals("y")){
                initiate = "y";
            }else{
                initiate = "n";
                System.out.println("Goodbye!");
            }
        }

    }



}
