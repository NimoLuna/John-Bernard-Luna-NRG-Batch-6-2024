public class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0);  // length and width are not used in Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
