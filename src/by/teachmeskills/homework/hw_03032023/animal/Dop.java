package by.teachmeskills.homework.hw_03032023.animal;
import java.util.Scanner;
public class Dop {
    public static Animal[] animal = new Animal[20];
    static int animalNumberInMass = 0;
    public static void changeFeature(String p) {
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].picture.equals(p)) {
                System.out.println("What feature do you want to change:");
                System.out.print("1 - picture, 2- food, 3 - hunger, 4- boundaries, 5- location");
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                switch (num) {
                    case '1':
                        System.out.println("Enter picture");
                        String picChange = in.nextLine();
                        animal[i].picture = picChange;
                        break;
                    case '2':
                        System.out.println("Enter food");
                        String foodChange = in.nextLine();
                        animal[i].food = foodChange;
                        break;
                    case '3':
                        System.out.println("Enter food");
                        int hungerChange = in.nextInt();
                        animal[i].hunger = hungerChange;
                        break;
                    case '4':
                        System.out.println("Enter boundaries");
                        int boundChange = in.nextInt();
                        animal[i].boundaries = new Animal.Boundaries(boundChange, boundChange);
                        break;
                    case '5':
                        System.out.println("Enter location");
                        int locationChange = in.nextInt();
                        animal[i].location = new Animal.Location(locationChange, locationChange);
                        break;
                }
            }
        }
    }

    public static void deleteAnimal(String p) {
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].picture.equals(p)) {
                animal[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Select a menu item(1-5):");
            System.out.println("Enter 1, if you want to add animal");
            System.out.println("Enter 2, if you want to get information about certain animal");
            System.out.println("Enter 3, if you want to change information about certain animal");
            System.out.println("Enter 4, if you want to delete information about certain animal");
            System.out.println("Enter 5, if you want to exit");
            System.out.print("Select a menu item(1-5): ");
            if (animalNumberInMass >= animal.length) {
                animalNumberInMass = 0;
            }
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            switch (n) {
                case '1':
                    System.out.println("Enter animal picture");
                    String p = scan.nextLine();
                    System.out.println("Enter animal food");
                    String f = scan.nextLine();
                    System.out.println("Enter animal hunger");
                    int h = scan.nextInt();
                    System.out.println("Enter animal first boundary");
                    int x = scan.nextInt();
                    System.out.println("Enter animal second boundary");
                    int y = scan.nextInt();
                    System.out.println("Enter animal first location");
                    int z = scan.nextInt();
                    System.out.println("Enter animal second location");
                    int q = scan.nextInt();
                    System.out.println("Choose what type of animal you want to create");
                    System.out.print("1 - dog, 2- cat, 3 - lion, 4- tiger, 5- hippo, 6- wolf: ");
                    int type = scan.nextInt();
                    switch (type) {
                        case '1':
                            Animal uDog = new Dog(p, f, h, new Animal.Boundaries(x, y), new Animal.Location(z, q));
                            animal[animalNumberInMass] = uDog;
                            animalNumberInMass++;
                            break;
                        case '2':
                            System.out.println("Enter a picture of the animal, whose information you would like to see:");
                            String infoPic = scan.nextLine();
                            Animal.getInfo(infoPic);
                            break;
                        case '3':
                            System.out.println("Enter a picture of the animal, whose information you would like to change:");
                            String chPic = scan.nextLine();
                            changeFeature(chPic);
                            break;
                        case '4':
                            System.out.println("Enter a picture of the animal, whose information you would like to delete:");
                            String delPic = scan.nextLine();
                            deleteAnimal(delPic);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + type);
                    }
                    if (n == 5) return;
            }
        }
    }
}