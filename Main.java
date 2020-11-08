public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.say();
        dog.say();
        cat.eat();
        dog.run();
        dog.bark();
        if (cat instanceof BarkAbility) {
            ((BarkAbility) cat).bark();
        }
        if (dog instanceof BarkAbility) {
            ((BarkAbility) dog).bark();
        }
        String name = "hello";
        int age1 = 3;


    }
}


