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

    public double getX(String coordinate)
    {
        int x = Integer.parseInt(coordinate.substring(1,coordinate.indexOf(",")));
        return x;
    }
    public double getY(String coordinate)
    {
        int y = Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 2,coordinate.indexOf(")")));
        return y;
    }

    public void getCoords()
    {
        System.out.print("Enter in the first coordinates(like this: (x, y)");
        String coord1 = scan.nextLine();
        double x1 = getX(coord1);
        double y1 = getY(coord1);

        System.out.print("Enter in the second coordinates(like this: (x, y)");
        String coord2 = scan.nextLine();
        double x2 = getX(coord2);
        double y2 = getY(coord2);

        lnEqtn = new LinearEquation(x1,y1,x2,y2);

    }

    public double calcSlope(double x1, double y1, double x2, double y2)
    {
        double slope = (y2-y1)/(x2-x1);

        return slope;
    }

    public double calcYIntercept(double slope, double x1, double y1)
    {
        double yIntercept = y1 - slope * x1;
        return yIntercept;
    }

    public double calcDistance(double x1,double y1, double x2, double y2)
    {
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }

    public String equation(double slope, double yIntercept)
    {
        return "y = " + slope + "x" + "+" + yIntercept;
    }
    public String lineInfo()
    {
        return null;
    }
}
