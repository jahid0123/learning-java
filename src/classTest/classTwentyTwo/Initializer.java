package classTest.classTwentyTwo;

public class Initializer {

    static int initialValue;

    static {
        initialValue = 1000;
        //System.out.println("Static block executed");
    }


    public static void main(String[] args) {

        System.out.println("Print before initialize instance: "+ initialValue);

        Initializer hemel =  new Initializer();

        int x = hemel.initialValue;

        System.out.println("Print after initialize instance: "+x);

    }
}
