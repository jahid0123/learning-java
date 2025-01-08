package classTest.shapHierarchy;

public class Rectangle extends Shape{
    protected double height;
    protected double width;

    public Rectangle(double height, double width) throws NegativeNumberNotSupported{

        if (height <0 || width<0)
            throw new NegativeNumberNotSupported("Negative number not supported");
        this.height = height;
        this.width = width;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width*height;
    }
}
