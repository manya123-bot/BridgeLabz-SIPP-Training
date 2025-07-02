public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy", 4);
        Animal a2 = new Cat("Kitty", 3);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}