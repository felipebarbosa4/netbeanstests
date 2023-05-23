package Abstractclasses2;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.println(type + " Lazily Swimming"); 
        }
        else {
            System.out.println(type + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.print("Swish! ");
        } else {
            System.out.print("Splash! ");
        }
    }
}
