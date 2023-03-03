package by.teachmeskills.homework.hw_03032023.transport;

public class TransportTestingClass {
    public static void main(String[] args) {
        PassengerCar car= new PassengerCar(500,300,600,"BMW",4,500,
                "Universal",5);
        car.getInfo();
        car.distanceToDrive(3);
        System.out.println();
        WarPlane wplane = new WarPlane(700,2000,8000,"Plane", 300,5000,
                true, 0);
        wplane.shot();
        System.out.println();
        wplane.ejection();
    }
}
