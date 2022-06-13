package animals;

public class Cat extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        this.name = "default cat";
    }

    public void talk(){
        System.out.println("Miau, Miau");
    }
}
