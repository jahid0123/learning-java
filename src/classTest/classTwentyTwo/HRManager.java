package classTest.classTwentyTwo;

public class HRManager extends Employee{

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resource.");
    }

    public void addEmployee(){
        System.out.println("HR manager is adding a new employee.");
    }

    public static void main(String[] args) {

        Employee employee =  new Employee();
        employee.work();
        System.out.println("Employee salary: "+employee.getSalary());

        System.out.println("\n\n");

        HRManager hrManager= new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager salary: "+ hrManager.getSalary());
    }
}
