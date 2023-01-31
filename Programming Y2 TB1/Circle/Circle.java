public class Circle {
    private double radius;
    private double x;
    private double y;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateCircumference() {
        return (this.radius * 2) * Math.PI;
    }

    public double calculateSurfaceArea() {
        return Math.pow((Math.PI * this.radius), 2);
    }

    private double ResolveRadius(double r) {
        if (r < 0) return 1.0; else return r;
    }

    public Circle() {
        this(1.0, 1.0, 1.0);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = ResolveRadius(radius);
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.x = 1.0;
        this.y = 1.0;
        this.radius = ResolveRadius(radius);
    }
}