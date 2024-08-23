public class Human implements Swimmable, Flyable{
    String name;
    String type;

    public Human(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void swim() {
        System.out.println(type + " плавает брасом");
    }

    @Override
    public void fly() {
        System.out.println(type + " летает на самолете");
    }
}
