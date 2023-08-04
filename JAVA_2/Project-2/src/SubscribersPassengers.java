public class SubscribersPassengers extends Passenger {


    public SubscribersPassengers(String name, int ID) {
        super(name, ID);
    }


    @Override
    public void reservedCar(Car car) {
        if (car.getMaximumCapacityOfPassengersPerTrip()==0){
            throw new IllegalArgumentException("Car has maximum capacity");
        }
        setReservedCar(car);
        setTripCost(car.getFixedRoute().getTripPrice()*0.5);
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Name: " + getName());
        System.out.println("Passenger ID: " + getID());
        if (getReservedCar() != null) {
            System.out.println("Car Code: " + getReservedCar().getCode());
            System.out.println("Route Price: " + getReservedCar().getFixedRoute().getTripPrice());
        } else {
            System.out.println("Car not reserved.");
        }
        System.out.println("Trip Cost: " + getTripCost());

    }
}
