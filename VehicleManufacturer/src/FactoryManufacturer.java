public class FactoryManufacturer {
    public static abstractVehicleFactory createVehicleFactory(Boolean SmartFactory){
        if(SmartFactory){
            return new SmartVehicleFactory();
        }
        return new VehicleFactory();
    }
}


