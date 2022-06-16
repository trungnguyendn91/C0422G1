package ss6_inheritance_polymorphism.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    public Square (){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, double side,  boolean filled){
        super(color,filled,side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side: " + getSide()+
                " ,which is a subclass of " + super.toString();
    }
}
