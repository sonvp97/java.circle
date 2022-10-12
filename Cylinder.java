public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color,double height){
        setColor(color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * getRadius() * getRadius() *height;
    }
    public String toString(){
        return "Height = " + height + " Volume Cylinder = " + getVolume() + super.toString();
    }
}
