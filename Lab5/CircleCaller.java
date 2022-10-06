public class CircleCaller {
    // Exercise 2
    public static void main(String[] args) {
        // Exercise 3
        Circle c1 = new Circle();
        // Exercise 4
        c1.setRadius(2.5);
        // System.out.println(c1.setRadius(2.5));
        // System.out.println(c1.getRadius());
        // System.out.println(c1.getArea());
        // System.out.println(c1.getPerimeter());

        // Exercise 6
        System.out.println("---After the first Circle created---");
        System.out.println(c1.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c1.countCircleObject);
        System.out.println(Circle.countCircleObject);

        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.println("---After the second Circle created---");
        System.out.println(c2.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c2.countCircleObject);
        System.out.println(Circle.countCircleObject);

        Circle c3 = new Circle();
        System.out.println("---After the third Circle created---");
        System.out.println(c3.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c3.countCircleObject);
        System.out.println(Circle.countCircleObject);
    }
}
