package src;


public class MAIN {
    public static void main(String[] args) {
        System.out.println("Happy new year!");
        SimpleService service = new SimpleService();
        service.printMessage();
        System.out.println("Happy new year !!!!");
        System.out.println(service.getMessage());
    }
}