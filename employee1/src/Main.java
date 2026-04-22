public class Main {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Jackson";
        e1.Salary = 5000;

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Nick";
        e2.Salary = 4500;

        e1.getAnnualSalary();
        e1.showInfo();

        e2.getAnnualSalary();
        e2.showInfo();
    }
}
