package classThirteen;

public class TestRecord {
    public static void main(String[] args) {

        ActualRecord ar = new ActualRecord("admin", "password");
        String name=ar.userName();
        String pass=ar.password();

        System.out.println("Username: "+name+"\n"+"Password: "+pass);
    }
}
