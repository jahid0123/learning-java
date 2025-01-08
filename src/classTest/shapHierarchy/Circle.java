package classTest.shapHierarchy;

public class Circle extends Shape{

   private double radius;

    public Circle(double radius) throws NegativeNumberNotSupported {
        this.radius = radius;

        if (radius<0)
            throw new NegativeNumberNotSupported("Negative number not supported.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (Math.PI*radius*radius);
    }

}
