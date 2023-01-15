public class Ball {
    private double diameter;
    private String colour;

    public Ball() {
        this.setDiameter(5);
        this.setColour("white");
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double bounce() {
        double height = this.diameter * 2;
        return height;
    }

    public void roll() {
        System.out.println("wheeee");
    }
}