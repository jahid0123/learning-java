package classTest.shapHierarchy;

public class Main {
    public static void main(String[] args) {

        try {

            Circle circle =  new Circle(5);
            System.out.println(circle.calculateArea());
            double iqram = circle.calculateArea();



            Rectangle rectangle =  new Rectangle(5, 6);
            Square square = new Square(5);

            System.out.println(circle.calculateArea());
            System.out.println(rectangle.calculateArea());
            System.out.println(square.calculateArea());
        }catch (NegativeNumberNotSupported e){

            System.out.println(e.getMessage());
        }

    }
}
