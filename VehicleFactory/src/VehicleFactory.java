public class VehicleFactory {

    private VehicleFactory(){

    }

    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType=="car"){
            return new Car();
        }
        else if (vehicleType == "bike"){
            return new Bike();
        }
        else if (vehicleType =="tracks"){
            return new Tracks();
        }
        return null;
    }

}
