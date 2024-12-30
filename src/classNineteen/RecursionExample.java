package classNineteen;

public class RecursionExample {

    public static void main(String[] args) {

        int x = multiplyNumber(5);
        System.out.println(x);

    }

    public static int multiplyNumber(int n){
        if (n>1){
            return multiplyNumber(n-1)*n;
        }
        return n;
    }
}
