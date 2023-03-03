package by.teachmeskills.homework.hw_03032023.transport;

public class Truck extends Terrestrial {
    int bearingCapacity;

    public Truck(int horsePower, int maxSpeed, int weight, String model, int wheelsNum, int fuelConsumption, int bearingCapacity) {
        super(horsePower, maxSpeed, weight, model, wheelsNum, fuelConsumption);
        this.bearingCapacity = bearingCapacity;
    }

    public void getInfo() {
        System.out.println("The weight of the truck: " + this.weight);
        System.out.println("The power of the truck: " + this.horsePower);
        System.out.println("The maximum speed of the truck:" + this.maxSpeed);
        System.out.println("The model of the truck: " + this.model);
        System.out.println("The number of wheels in the truck: " + this.wheelsNum);
        System.out.println("The fuel consumption of the truck: " + this.fuelConsumption);
        System.out.println("The bearing capacity of the truck: " + this.bearingCapacity);
        System.out.println("The kilowatts power of the truck: " + this.kilowattePower());
    }

    public void loadingCapacity(int weight) {
        if (weight <= this.bearingCapacity) {
            System.out.println("The truck is loaded.");
        } else {
            System.out.println("Sorry, but you need a bigger truck.");
        }
    }
}
