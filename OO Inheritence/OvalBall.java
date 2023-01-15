public class OvalBall extends Ball {
    private double secondDiameter;

    public double getSecondDiameter() {
        return secondDiameter;
    }

    public void setSecondDiameter(double secondDiameter) {
        this.secondDiameter = secondDiameter;
    }

    public double bounce() {
        if (Math.random() > 0.5) return this.getDiameter();
        return this.getSecondDiameter();
    }

    public void roll() {
        System.out.println("bobble");
    }
}
