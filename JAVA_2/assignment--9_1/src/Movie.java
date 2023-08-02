public class Movie extends Product{

    private String director;

    public Movie(){

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return 50;
    }

    @Override
    public String toString() {
        return "Movie{" +"Movie name: "+getName()+ " director " + director +" price="+getPrice() +
                " and the discount:"+getDiscount()+'%'+" price after discount="+(getPrice()-(getPrice()*getDiscount()/100));
    }
}
