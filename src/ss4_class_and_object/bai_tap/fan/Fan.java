package ss4_class_and_object.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";
    public void setMaxSpeed(){
        speed = FAST;
    }
    public void setMediumSpeed(){
        speed = MEDIUM;
    }
    public void setSlowSpeed(){
        speed = SLOW;
    }
    public boolean getOn(){
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
       return this.on? String.format("Speed: %d, Color: %s, Radius: %.1f. Fan is On"
               ,speed,color,radius):String.format("Color: %s, Radius: %.1f. Fan is Off"
               ,color,radius);
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setOn(true);
        f1.setMaxSpeed();
        f1.setRadius(10);
        f1.setColor("Red");
        System.out.println("Fan1: " + f1);
        Fan f2 = new Fan();
        f2.setOn(false);
        f2.setColor("Yellow");
        f2.setMediumSpeed();
        f2.setRadius(7);
        System.out.printf("Fan2: " + f2);
    }

}

