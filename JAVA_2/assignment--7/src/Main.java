public class Main {
    public static void main(String[] args) {

  Account A0=new Account();
  A0.setId("0");
  A0.setName("Salem");
  A0.setBalance(100);
        System.out.println("ID:"+A0.getId()+" Name: "+ A0.getName()+" Balance: "+ A0.getBalance());
        System.out.println(" ");


  Account A1=new Account("1","Bakr");
        System.out.println("ID:"+A1.getId()+" Name: "+ A1.getName()+" Balance: "+ A1.getBalance());
        System.out.println(" ");

  Account A2=new Account("2","AbuBakr",500);
        System.out.println("ID:"+A2.getId()+" Name: "+ A2.getName()+" Balance: "+ A2.getBalance());
        System.out.println(" ");

        System.out.println(A0.getName()+" after credit 101");
        A0.credit(101);
        System.out.println("ID:"+A0.getId()+" Name: "+ A0.getName()+" Balance: "+ A0.getBalance());
        System.out.println(A0.getName()+" after debit 600");
        A0.debit(600);
        System.out.println("ID:"+A0.getId()+" Name: "+ A0.getName()+" Balance: "+ A0.getBalance());
        System.out.println(" ");

        System.out.println(A1.getName()+" after debit 60");
        A1.debit(60);
       // System.out.println("ID:"+A1.getId()+" Name: "+ A1.getName()+" Balance: "+ A1.getBalance());
        System.out.println(A1.toString());
        System.out.println(A1.getName()+" after credit 50");
        A1.credit(50);
        //System.out.println("ID:"+A1.getId()+" Name: "+ A1.getName()+" Balance: "+ A1.getBalance());
        System.out.println(A1.toString());
        System.out.println(" ");


        System.out.println(A2.getName()+" after debit 1000");
        A2.debit(1000);
        //System.out.println("ID:"+A2.getId()+" Name: "+ A2.getName()+" Balance: "+ A2.getBalance());
        System.out.println(A2.toString());
        System.out.println(A2.getName()+" after credit 5000");
        A2.credit(5000);
        //System.out.println("ID:"+A2.getId()+" Name: "+ A2.getName()+" Balance: "+ A2.getBalance());
        System.out.println(A2.toString());
        System.out.println(" ");

        System.out.println("after "+A0.getName()+" Transfer to "+ A2.getName()+" 150");
        A0.transferTo(A2,150);
        //System.out.println("ID:"+A0.getId()+" Name: "+ A0.getName()+" Balance: "+ A0.getBalance());
        System.out.println(A0.toString());
        //System.out.println("ID:"+A2.getId()+" Name: "+ A2.getName()+" Balance: "+ A2.getBalance());
        System.out.println(A2.toString());
        System.out.println(" ");

        System.out.println("after "+A2.getName()+" Transfer to "+ A1.getName()+" 1500");
        A2.transferTo(A1,1500);
        //System.out.println("ID:"+A2.getId()+" Name: "+ A2.getName()+" Balance: "+ A2.getBalance());
        System.out.println(A2.toString());
        //System.out.println("ID:"+A1.getId()+" Name: "+ A1.getName()+" Balance: "+ A1.getBalance());
        System.out.println(A1.toString());
        System.out.println(" ");

        System.out.println("after "+A1.getName()+" Transfer to "+ A0.getName()+" 1600");
        A1.transferTo(A0,1600);
        //System.out.println("ID:"+A1.getId()+" Name: "+ A1.getName()+" Balance: "+ A1.getBalance());
        System.out.println(A1.toString());
        //System.out.println("ID:"+A0.getId()+" Name: "+ A0.getName()+" Balance: "+ A0.getBalance());
        System.out.println(A0.toString());


    }
}