public class Main {
    public static void main(String[] args) {
        OvalBall rugbyBall = new OvalBall();
        rugbyBall.setDiameter(27);
        rugbyBall.setSecondDiameter(19);
        System.out.println("Our rugby ball bounces " + rugbyBall.bounce() + " high");
    }
}
