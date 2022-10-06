public class CircleService {
    // Exercise 7
    // private final double PI = 3.14159;
    private final static double PI = 3.14159;

    public static double getArea(double radius) {
        return (PI * radius * radius);
    }

    public static double getDiameter(double radius) {
        return (2 * radius);
    }

    public static double getPerimeter(double radius) {
        return (2 * PI * radius);
    }

    public static void main(String[] args) {
        double r = 2.0;
        double area = CircleService.getArea(r);
        double diameter = CircleService.getDiameter(r);
        double perimeter = CircleService.getPerimeter(r);
        System.out.println("Area: " + area);
        System.out.println("Diameter: " + diameter);
        System.out.println("Perimeter: " + perimeter);
    }
}
