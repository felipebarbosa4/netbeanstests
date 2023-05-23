package AbstractClasses2;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        Fish fish = new Fish("Goldfish", "small", 5)
        dog.makeNoise();
        fish.makeNoise();
        doAnimalStuff(dog);
        doAnimalStuff(fish);
    }
    
    private static void doAnimalStuff(Animal animal) {
        
        animal.makeNoise();
        animal.move("slow");
    }

}