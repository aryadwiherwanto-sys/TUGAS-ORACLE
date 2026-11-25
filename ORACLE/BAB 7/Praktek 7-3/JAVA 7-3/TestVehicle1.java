package vehicles;

public class TestVehicle1 {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        vehicle2.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}
