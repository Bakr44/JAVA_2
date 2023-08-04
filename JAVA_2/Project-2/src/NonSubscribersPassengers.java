public class NonSubscribersPassengers extends Passenger{

    private boolean hasDiscountCoupon;


    public NonSubscribersPassengers(String name, int ID,boolean hasDiscountCoupon) {
        super(name, ID);
        this.hasDiscountCoupon=hasDiscountCoupon;
    }

    @Override
    public void reservedCar(Car car) {

        if (car.getMaximumCapacityOfPassengersPerTrip()==0){
            throw new IllegalArgumentException("Car has maximum capacity");
        }
        setReservedCar(car);
        if (hasDiscountCoupon){
            setTripCost(car.getFixedRoute().getTripPrice()-(car.getFixedRoute().getTripPrice()*0.1));
        }else{
            setTripCost(car.getFixedRoute().getTripPrice());
        }
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
