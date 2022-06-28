package ss12_collection_frame.bai_tap.production.model;

public class Product {
    private int Id;
    private String Name;
    private int Cost;

    public Product() {
    }
    public Product(int id, String name, int cost) {
        Id = id;
        Name = name;
        Cost = cost;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Cost=" + Cost +
                '}';
    }
}
