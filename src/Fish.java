public class Fish implements Swimmable, Flyable{
    String name;
    String type;

    public Fish(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void swim() {
        System.out.println(type + " плавает под водой");
    }

    @Override
    public void fly() {
        System.out.println(type + " не летает");
    }
}
