public class Bird implements Swimmable, Flyable{
    String name;
    String type;

    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void swim() {
        System.out.println(name + " не на долго ныряет");
    }

    @Override
    public void fly() {
        System.out.println(type + " летает в небе с помощью крыльев");
    }
}
