package by.teachmeskills.homework.hw_03032023.transport;

public class PassengerCar extends Terrestrial {
    String carBodyType;
    int passengerNum;

    public PassengerCar(int horsePower, int maxSpeed, int weight, String model, int wheelsNum, int fuelConsumption,
                        String carBodyType, int passengerNum) {
        super(horsePower, maxSpeed, weight, model, wheelsNum, fuelConsumption);
        this.carBodyType = carBodyType;
        this.fuelConsumption = fuelConsumption;
    }

    public void getInfo() {
        System.out.println("The weight of the car: " + this.weight);
        System.out.println("The power of the car: " + this.horsePower);
        System.out.println("The maximum speed of the car:" + this.maxSpeed);
        System.out.println("The model of the car: " + this.model);
        System.out.println("The number of wheels in the car: " + this.wheelsNum);
        System.out.println("The fuel consumption of the car: " + this.fuelConsumption);
        System.out.println("The number of passengers: " + this.passengerNum);
        System.out.println("The car body type: " + this.carBodyType);
        System.out.println("The kilowatts power of the car: " + this.kilowattePower());
    }

    private double spentFuel(double distance) {
        double sFuel = this.fuelConsumption * distance / 100;
        return sFuel;
    }

    public void distanceToDrive(double t) {
        double distance = t * this.maxSpeed;
        System.out.println("During " + t + " hours " + this.model + " moving at a maximum speed of " + this.maxSpeed + " km/h " +
                "will pass " + distance + " km and spend " + spentFuel(distance) + " liters of fuel.");

    }
}
