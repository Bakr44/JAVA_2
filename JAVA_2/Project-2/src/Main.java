public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("addres1", "adress2", 50.0);
        Route r2 = new Route("labn", "munasyah", 100.5);

        Car c1 = new Car("a100", r1, 1);
        Car c2 = new Car("a200", r2, 0);

        Passenger[] passengers = new Passenger[2];

        passengers[0] = new SubscribersPassengers("Bakr", 1107);
        passengers[1] = new NonSubscribersPassengers("Salem", 100,false);

        try {
            passengers[0].reservedCar(c1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erorr: "+e.getMessage()+'\n');
        }

        try {
            passengers[1].reservedCar(c2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + '\n');
        }

        for (Passenger passenger : passengers) {
            passenger.displayInfo();
            System.out.println();
        }
    }
}
