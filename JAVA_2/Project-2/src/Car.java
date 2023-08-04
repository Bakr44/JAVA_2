public class Car {

    private String code;
    private Route fixedRoute;
    private int maximumCapacityOfPassengersPerTrip;

    public Car(String code, Route fixedRoute, int maximumCapacityOfPassengersPerTrip) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximumCapacityOfPassengersPerTrip = maximumCapacityOfPassengersPerTrip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMaximumCapacityOfPassengersPerTrip() {
        return maximumCapacityOfPassengersPerTrip;
    }

    public void setMaximumCapacityOfPassengersPerTrip(int maximumCapacityOfPassengersPerTrip) {
        this.maximumCapacityOfPassengersPerTrip = maximumCapacityOfPassengersPerTrip;
    }
}
