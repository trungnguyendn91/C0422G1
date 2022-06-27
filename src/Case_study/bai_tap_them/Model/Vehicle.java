package Case_study.framework.Model;

public class  Vehicle {
    private String licensePlate;
    private String nameOwner;
    private int yearOfManufacture;
    private String brand;
    public Vehicle(){
    }
    public Vehicle(String licensePlate, String nameOwner, int yearOfManufacture, String brand) {
        this.licensePlate = licensePlate;
        this.nameOwner = nameOwner;
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle have " +
                "Biển số xe: '" + licensePlate + '\'' + " "+
                "Chủ xe: '" + nameOwner + '\'' +" "+
                "Năm sản xuất : " + yearOfManufacture +" "+
                "Nhãn hiệu: '" + brand + '\'' +
                '}';
    }
}
