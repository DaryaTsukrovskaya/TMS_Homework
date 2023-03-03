package by.teachmeskills.homework.hw_03032023.transport;

public class WarPlane extends AirTransport {
    boolean surrenderSystem;
    int rocketNum;

    public WarPlane(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int minLengthOfRunwayStrip,
                    boolean surrenderSystem, int rocketNum) {
        super(horsePower, maxSpeed, weight, model, wingSpan, minLengthOfRunwayStrip);
        this.surrenderSystem = surrenderSystem;
        this.rocketNum =rocketNum;
    }

    public void getInfo() {
        System.out.println("The weight of the war-plane: " + this.weight);
        System.out.println("The power of the war-plane: " + this.horsePower);
        System.out.println("The maximum speed of the war-plane:" + this.maxSpeed);
        System.out.println("The model of the war-plane: " + this.model);
        System.out.println("The wing-span of the war-plane: " + this.wingSpan);
        System.out.println("The minimal length of the runway strip: " + this.minLengthOfRunwayStrip);
        System.out.println("The surrender system available: " + this.surrenderSystem);
        System.out.println("The number of rockets: " + this.rocketNum);
        System.out.println("The kilowatts power of the war-plane: " + this.kilowattePower());
    }

    public void shot() {
        if (this.rocketNum != 0) {
            System.out.println("The rocket is launched");
        } else {
            System.out.println("Ammo missing");
        }

    }
    public void ejection(){
        if(this.surrenderSystem){
            System.out.println("Ejection was successful.");
        }else{
            System.out.println("Ejection failed, you dont have such a system.");
        }
    }
}
