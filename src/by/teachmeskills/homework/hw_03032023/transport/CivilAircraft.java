package by.teachmeskills.homework.hw_03032023.transport;

public class CivilAircraft extends AirTransport {
    int passengerNum;
    boolean businessClass;
    public CivilAircraft(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int minLengthOfRunwayStrip,
                         int passengerNum, boolean businessClass) {
        super(horsePower, maxSpeed, weight, model, wingSpan, minLengthOfRunwayStrip);
        this.passengerNum = passengerNum;
        this.businessClass = businessClass;
    }

    public void getInfo() {
        System.out.println("The weight of the civil aircraft: " + this.weight);
        System.out.println("The power of the civil aircraft: " + this.horsePower);
        System.out.println("The maximum speed of the civil aircraft:" + this.maxSpeed);
        System.out.println("The model of the civil aircraft: " + this.model);
        System.out.println("The wing-span of the civil aircraft: " + this.wingSpan);
        System.out.println("The minimal length of the runway strip: " + this.minLengthOfRunwayStrip);
        System.out.println("The number of passengers in the civil aircraft: " + this.passengerNum);
        System.out.println("The business-class available : " + this.businessClass);
        System.out.println("The kilowatts power of the civil aircraft: " + this.kilowattePower());
    }

    public void passengersLoadingCapacity(int num) {
        if (num <= this.passengerNum) {
            System.out.println("The plane is loaded.");
        } else {
            System.out.println("Sorry, but you need a bigger plane.");
        }
    }

}
