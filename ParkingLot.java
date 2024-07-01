import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ParkingLot {

    private Queue<Vechile> carsToPark;
    private Stack<Vechile> carsForArragement;

    public ParkingLot(){
        carsToPark = new LinkedList<Vechile>();
        carsForArragement = new Stack<Vechile>();
    }

    public void enterLot(Vechile car) {
        if (carsForArragement.size() < 5) { 
            carsForArragement.push(car);
            System.out.println("Car parked: " + car);
        } else {
            carsToPark.add(car);
            System.out.println("Parking full. Car added to waiting line: " + car);
        }
    }

    public void exitLot() {
        if (!carsForArragement.isEmpty()) {
            Vechile car = carsForArragement.pop();
            System.out.println("Car exited: " + car);
            if (!carsToPark.isEmpty()) {
                Vechile waitingCar = carsToPark.poll();
                carsForArragement.push(waitingCar);
                System.out.println("Car from waiting line parked: " + waitingCar);
            }
        } else {
            System.out.println("No cars in the parking lot.");
        }
    }
    
}
