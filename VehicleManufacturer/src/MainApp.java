public class MainApp {
    public static void main(String args[]){

     abstractVehicleFactory f1=FactoryManufacturer.createVehicleFactory(false);
     Vehicle v1=f1.createVehicle("car");
     Vehicle v2=f1.createVehicle("bike");
     v1.ChangeTires();
     v2.ChangeTires();

        abstractVehicleFactory f2=FactoryManufacturer.createVehicleFactory(true);
        Vehicle v3=f2.createVehicle("car");
        Vehicle v4=f2.createVehicle("bike");
        v3.ChangeTires();
        v4.ChangeTires();

    }
}
