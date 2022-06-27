package Case_study.framework.Model;

public class Truck extends Vehicle {
    int weight;
    public Truck(){
    }
    public Truck(int weight){
        this.weight = weight;
    }

    public Truck(String licensePlate, String nameOwner, int yearOfManufacture, String brand, int weight) {
        super(licensePlate, nameOwner, yearOfManufacture, brand);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck have {" +
                super.toString()+ "\n"+
                "weight=" + weight +
                '}';
    }
}
