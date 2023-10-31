public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1,int y1,int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getFirstCoord(){
        return "(" + x1 + "," + y1 + ")";
    }
    public String getSecondCoord(){
        return "(" + x2 + "," + y2 + ")";
    }
    public double calcSlope()
    {
        double slope = ((double) y2-y1)/(x2-x1);
        return slope;
    }

    public double calcYIntercept()
    {
        double yIntercept = y1 - calcSlope() * x1;
        return yIntercept;
    }

    public double calcDistance()
    {
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }

    public String equation()
    {
        if(y1 == y2){
            return "y = " + calcYIntercept();
        }
        return "y = " + calcSlope() + "x" + "+" + calcYIntercept();
    }
    public String coordinateForX(double xValue){
        double calcY = calcSlope() * xValue + calcYIntercept();
        return "The point on the line is: " + "(" + xValue + "," + calcY + ")";
    }

    public String lineInfo()
    {
        return "The two points are "+ getFirstCoord() + " and " + getSecondCoord() + "\n" + "The equation of the line is: " + equation() + "\n" + "The slope of the line is: " + calcSlope() + "\n" + "The y-intercept of the line is: " + calcYIntercept() + "\n" +"The distance between the two points is: " +  calcDistance();
    }
}
