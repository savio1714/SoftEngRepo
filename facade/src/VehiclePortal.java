public class VehiclePortal {



    private  Vehicle bike,car;

    public VehiclePortal(){
        bike = new bike();
        car = new car();
    }

    public void changeBikeTires(){
        bike.changeTires();
    }

    public void changeCarTires(){
        car.changeTires();
    }

    public Vehicle getBike() {
        return bike;
    }

    public void setBike(Vehicle bike) {
        this.bike = bike;
    }

}
