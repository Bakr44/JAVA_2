public class Main {
    public static void main(String[] args) {

        Book b1=new Book("A Song of Ice and Fire",220.45,"George R. R. Martin");
        System.out.println(b1.toString());
        System.out.println(" ");
        Book b2=new Book("Harry Potter",100,"J. K. Rowling");
        System.out.println(b2.toString());
        System.out.println("-------------------");
        Movie m1=new Movie("Interstellar",70,"Christopher Nolan");
        System.out.println(m1.toString());
        System.out.println(" ");
        Movie m2=new Movie("Fight Club",95,"David Fincher");
        System.out.println(m2.toString());


    }
}