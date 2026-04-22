public class Employee {
    int id;
    String name;
    int Salary;
    int aSalary = Salary*12;

    void getAnnualSalary(){
        System.out.println("AnnualSalary: $"+Salary*12);
    }

    void showInfo(){
        System.out.println("id: "+id+", name: "+name+", Salary: $"+Salary+", AnnualSalary: $"+(Salary*12));
    }
}
