package Case_study.framework.Model;

public class Motor extends Vehicle {
    private int capacity;
    public Motor(){}
    public Motor(int capacity){
        this.capacity= capacity;
    }
    public Motor(String licensePlate, String nameOwner, int yearOfManufacture, String brand, int capacity) {
        super(licensePlate, nameOwner, yearOfManufacture, brand);
        this.capacity = capacity;
    }

    public Motor(int i, String ádsasad, String aaa, int i1) {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motor{" +
                super.toString()+"\n"+
                "Dung tích: " + capacity +
                '}';
    }
}
