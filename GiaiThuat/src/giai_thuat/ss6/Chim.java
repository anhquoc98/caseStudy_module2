package giai_thuat.ss6;

public class Chim extends Animal{
    public Chim(String nameAnimal, String color, String kilogam) {
        super(nameAnimal, color, kilogam);
    }

    @Override
    void goToAnmal() {
        System.out.println("Bay nhưng không biết chạy");
    }

    @Override
    public String toString() {
        return "Chim:"+getNameAnimal()+getColor()+getColor();
    }
}
