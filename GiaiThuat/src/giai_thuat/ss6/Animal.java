package giai_thuat.ss6;

public abstract class Animal {
    private String nameAnimal;
    private String color;
    private String kilogam;

    public Animal(String nameAnimal, String color, String kilogam) {
        this.nameAnimal = nameAnimal;
        this.color = color;
        this.kilogam = kilogam;
    }
    abstract void goToAnmal();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKilogam() {
        return kilogam;
    }

    public void setKilogam(String kilogam) {
        this.kilogam = kilogam;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", color='" + color + '\'' +
                ", kilogam='" + kilogam + '\'' +
                '}';
    }
}
