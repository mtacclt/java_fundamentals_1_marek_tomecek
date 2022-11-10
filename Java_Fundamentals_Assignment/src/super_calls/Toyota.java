package super_calls;

public class Toyota extends Car{

    // this constructor takes advantage of the super call by utilizing the parent classes variables
    public Toyota(int manufactureYear, int vinNumber, String carName) {
        super(manufactureYear, vinNumber, carName);
        manufactureYear = super.manufactureYear;
        vinNumber = super.vinNumber;
        carName = super.carName;
        System.out.println("We have created a Toyota, but it takes after its parent");
    }

    //here the super call uses the parent method for the startCar method
    public void startCar(){
        super.startCar();
        System.out.println("except its the toyota subclass...");
    }

    // this method utilizes once again the parent variables to run via the super call.
    @Override
    public String toString() {
        return "Toyota{" +
                "manufactureYear=" + super.manufactureYear +
                ", vinNumber=" + super.vinNumber +
                ", carName='" + super.carName +" utilizing the supers of Car"+'\'' +
                '}';
    }
}
