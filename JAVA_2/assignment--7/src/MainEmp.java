public class MainEmp {

    public static void main(String[] args) {
        Employee E1 = new Employee("001", "Bakr", 50000);
        Employee E2 = new Employee();

        E2.setId("002");
        E2.setName("Salem");
        E2.setSalary(60000);

        System.out.println(E1.toString());
        System.out.println(E1.getName()+" Annual Salary: "+E1.getAnnualSalary());
        System.out.println("Salary after raised by 10%: "+E1.raisedSalary(10));
        System.out.println(" ");

        System.out.println(E2.toString());
        System.out.println(E2.getName()+" Annual Salary: "+E2.getAnnualSalary());
        System.out.println("Salary after raised by 25%: "+E2.raisedSalary(25));
        System.out.println(" ");

    }
}
