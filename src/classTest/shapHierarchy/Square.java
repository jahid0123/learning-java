package classTest.shapHierarchy;

public class Square extends Rectangle{



    public Square(double size) throws NegativeNumberNotSupported {
        super(size, size);
        if (size<0)
            throw new NegativeNumberNotSupported("Negative number not supported.");

    }

}

