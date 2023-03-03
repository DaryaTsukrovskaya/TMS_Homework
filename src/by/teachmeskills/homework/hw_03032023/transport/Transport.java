package by.teachmeskills.homework.hw_03032023.transport;

public abstract class Transport {
    int horsePower;
    int maxSpeed;
    int weight;
    String model;

    public Transport(int horsePower, int maxSpeed, int weight, String model) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public double kilowattePower() {
        int i = 74;
        double kilPow = this.horsePower/i;
        return kilPow;
    }

}
