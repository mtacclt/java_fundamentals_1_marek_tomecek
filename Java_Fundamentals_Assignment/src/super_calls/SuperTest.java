package super_calls;

public class SuperTest {
    public static void main(String[] args) {
        Car toyota = new Toyota(2015,867502123,"Toyota Hilux");
        toyota.startCar();
        System.out.print(toyota.toString());

    }

}
