package giai_thuat.ss6;

public class Cat extends Animal{
    public Cat(String nameAnimal, String color, String kilogam) {
        super(nameAnimal, color, kilogam);
    }

    @Override
    void goToAnmal() {
        System.out.println("Chạy đươc nhưng không biết bay");
    }

    @Override
    public String toString() {
        return "Cat "+getNameAnimal()+
                getNameAnimal()+
                getKilogam();
    }
}
