import java.util.Scanner;

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
        int y = Integer.parseInt(coordinate.substring(coordinate.indexOf(",") + 2));
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
    }

}
