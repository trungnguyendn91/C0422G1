package ss7_abtraction_interface.thuc_hanh.animal_va_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck-cluck ";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
