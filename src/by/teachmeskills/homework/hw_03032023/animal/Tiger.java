package by.teachmeskills.homework.hw_03032023.animal;

import static by.teachmeskills.homework.hw_03032023.animal.Dop.animal;

public class Tiger extends Feline {
    public Tiger(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("The tiger is making noise: RRRRRRR");
    }

    @Override
    protected void eat() {
        System.out.println("The tiger is eating meat");
    }

    @Override
    protected void roam() {
        System.out.println("The tiger is roaming alone");
    }
    static void getInfo(String pic) {
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].picture.equals(pic)) {
                System.out.println(animal[i].food + animal[i].hunger + animal[i].boundaries + animal[i].location);
            }
        }
    }
}
