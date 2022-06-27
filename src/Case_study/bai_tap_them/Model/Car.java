package Case_study.framework.Model;

public class Car extends Vehicle {
    private int seat;
    private String carType;
    public Car(){

    }
    public Car (int seat){
        this.seat = seat;
    }

    public Car(String licensePlate, String nameOwner, int yearOfManufacture, String brand, int seat , String carType) {
        super(licensePlate, nameOwner, yearOfManufacture, brand);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    public String getCarType(){
        return carType;
    }
    public void setCarType (String carType){
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+"\n"+
                "Seat: " + seat +"\n"+
                "Car type: " + carType+
                '}';
    }
}
