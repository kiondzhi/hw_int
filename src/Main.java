//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Human human = new Human("Вася", "Человек");
    Bird bird = new Bird("Утка", "Птица");
    Fish fish = new Fish("Форель", "Рыба");
    human.fly();
    human.swim();
    System.out.println("---------------------------------");
    bird.fly();
    bird.swim();
    System.out.println("---------------------------------");
    fish.fly();
    fish.swim();

    }
}