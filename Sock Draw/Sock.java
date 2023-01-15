public class Sock {
    /* DO NOT MODIFY THE SOCK CLASS! */

    private String colour;
    private int length;
    private String material;

    public Sock(String colour, int length, String material) {
        this.setColour(colour);
        this.setLength(length);
        this.setMaterial(material);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public boolean isPair(Sock other) {
        if (this.getColour().equals(other.getColour())
                && this.getLength() == other.getLength()
                && this.getMaterial().equals(other.getMaterial())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "A " + this.getColour() + " sock made of " + this.getMaterial() + " that is " + this.getLength()
                + "cm long";
    }
}