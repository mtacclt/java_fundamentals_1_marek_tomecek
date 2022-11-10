package super_calls;

public class Car {
    public Car() {
        this.manufactureYear = 1997;
        this.vinNumber = 123456789;
        this.carName = "undefined car";
    }
    public Car(int manufactureYear, int vinNumber, String carName) {
        this.manufactureYear = this.manufactureYear;
        this.vinNumber = this.vinNumber;
        this.carName = this.carName;
    }

    int manufactureYear = 1997;
    int vinNumber = 123456789;

    String carName= "undefined car";

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void startCar(){
        System.out.println("Starting Car...");
    }
}
