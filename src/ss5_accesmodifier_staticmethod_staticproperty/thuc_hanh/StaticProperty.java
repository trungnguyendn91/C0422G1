package ss5_accesmodifier_staticmethod_staticproperty.thuc_hanh;

public class StaticProperty {
    public static class Car{
        private String name;
        private String engine;

        public static int numberOfCar;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCar++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }
    }
    public static class TestingStaticProperty{
        public static void main(String[] args) {
            Car car1 = new Car("Mazda 3", "Skyactiv 3");
            System.out.println(Car.numberOfCar);
            Car car2 = new Car("Mazda 6", "Skyactiv 6");
            System.out.println(Car.numberOfCar);
            System.out.println(car1.name + car1.engine);
        }
    }
}
