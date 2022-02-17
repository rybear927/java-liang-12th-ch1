package Chapter04;
//(Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
//Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure
//in Section 4.1 to compute the estimated area enclosed by these four cities.
//(Hint: Use the formula in Programming Exercise 4.2 to compute the distance
//between two cities. Divide the polygon into two triangles and use the formula in
//Programming Exercise 2.19 to compute the area of a triangle.)

public class exercise03 {
    public static void main(String[] args) {

        //triangle 1
        double charlotteToSavannah = getDistance(35.2270869, 280.8431267, 32.0835407, 281.0998342);
        double savannahToOrlando = getDistance(32.0835407, 281.0998342, 28.5383355, 281.3792365);
        double orlandoToCharlotte = getDistance(28.5383355, 281.3792365, 35.2270869, 280.8431267);
        double s = (charlotteToSavannah + savannahToOrlando + orlandoToCharlotte) / 2;
        double areaTriangle1 = Math.sqrt((s * (s - charlotteToSavannah) * (s - savannahToOrlando) * (s - orlandoToCharlotte)));


        //triangle 2
        double orlandoToAtlanta = getDistance(28.5383355, 281.3792365, 33.7489954, 284.3879824);
        double atlantaToCharlotte = getDistance(33.7489954, 284.3879824, 35.2270869, 280.8431267);
        //orlandoToCharlott already exists so no need to compute again
        s = (orlandoToAtlanta + atlantaToCharlotte + orlandoToCharlotte) / 2;
        double areaTriangle2 = Math.sqrt((s * (s - orlandoToAtlanta) * (s - atlantaToCharlotte) * (s - orlandoToCharlotte)));

        double totalArea = areaTriangle2 + areaTriangle1;

        System.out.println("The total area between these four cities is " + totalArea + " square kilometers");




    }

    public static double getDistance(double point1X, double point1Y, double point2X, double point2Y) {
        point1X = Math.toRadians(point1X);
        point1Y = Math.toRadians(point1Y);
        point2X = Math.toRadians(point2X);
        point2Y = Math.toRadians(point2Y);

        return 6371.01 * Math.acos(Math.sin(point1X) * Math.sin(point2X) + Math.cos(point1X)
                * Math.cos(point2X) * Math.cos(point1Y - point2Y));
    }
}
