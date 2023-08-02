public class Book extends Product{
    private String author;

    public  Book(){

    }

    public Book(String name,double price,String author) {
        super(name,price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return 60;
    }

    @Override
    public String toString() {
        return "Book{" +"name book: "+getName()+ " author " + author +" price="+getPrice() +
                " and the discount:"+getDiscount()+'%'+" price after discount="+(getPrice()-(getPrice()*getDiscount()/100));
    }
}
