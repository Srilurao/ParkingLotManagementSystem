public class Main {

    public static void main(String args[]){
        ParkingLot lot = new ParkingLot();

        lot.enterLot(new Vechile("Car", "156"));
        lot.enterLot(new Vechile("Car", "111"));

        lot.exitLot();
    }
    
}
