public class MainApp {
    public static void main(String args[]){
        Vehicle v1= VehicleFactory.createVehicle("car");
        Vehicle v2=VehicleFactory.createVehicle("bike");
        Vehicle v3=VehicleFactory.createVehicle("tracks");

        v1.ChangeTires();
        v2.ChangeTires();
        v3.ChangeTires();
    }
}
