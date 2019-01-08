public class Elevator {
    int currentFloor;

    public Elevator(){
        currentFloor=0;
    }
    public void moveTo(int floor){

        if (floor ==currentFloor){
            System.out.println("You Already reached ");
        }
        else{
            if(currentFloor<floor) {
                System.out.println("..........................................");
                System.out.println("Now You Are  at " + currentFloor+ "Floor");
                System.out.println("..........................................");
                System.out.println("Moving Up");
                for (int i = currentFloor+1; i <= floor; i++) {

                    System.out.println("floor   " + i);
                    currentFloor = i;
                }
                System.out.println("..........................................");
                System.out.println("You reached at" + currentFloor   + "Floor");
                System.out.println("..........................................");
            }else if(currentFloor>floor){
                System.out.println("..........................................");
                System.out.println("Now You Are at " + currentFloor+ "Floor");
                System.out.println("..........................................");
                System.out.println("Moving Down");
                for (int i = currentFloor-1; i >= floor; i--) {

                    System.out.println("floor   " + i);
                    currentFloor = i;
                }
                System.out.println("..........................................");
                System.out.println("You reached at" + currentFloor  + "Floor");
                System.out.println("..........................................");
            }
        }
    }

}
