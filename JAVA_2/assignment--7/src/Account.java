public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account() {
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int credit(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
          }
//        else {
//            //System.out.println("the money not enough");
//            return this.balance;
//        }
        return this.balance;
    }

    public int debit(int amount) {
        return this.balance += amount;
    }

    public int transferTo(Account another, int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            return 0;
        }
        return another.balance;
    }


    public String toString() {
        return "ID:" + this.getId() + " Name: " + this.getName() + " Balance: " + this.getBalance();

    }
}
