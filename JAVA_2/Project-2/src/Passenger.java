public abstract class Passenger {

    private String name;
    private int ID;
    private Car  reservedCar;
    private double tripCost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public Passenger(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void reservedCar(Car car);

    public abstract void displayInfo();


}
