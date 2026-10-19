package Lab2.task3;

public class Employee {
    public String name;
    public double salary;
    public String designation;

    public void newEmploye(String name) {
        this.name = name;
        salary = 30000;
        designation = "junior";
    }

    public void displayInfo() {
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Salary: "+ salary);
        System.out.println("Employee Designation: "+ designation);
    }
    
    public void calculateTax(){
        if (salary > 50000) {
            double tax = salary * 0.30;
            System.out.println(name +" Tax Ammount: "+ tax +" Tk");
        } else if (salary > 30000) {
            double tax = salary * .10;
            System.out.println(name +" Tax Ammount: "+ tax +" Tk");
        } else {
            System.out.println("No need to pay tax");
        }
    }
    public void promoteSalary(String position){
        if (position.equals("senior")){
            salary += 25000;
        } else if (position.equals("lead")){
            salary += 50000;
        } else if (position.equals("manager")){
            salary += 75000;
        }
        designation = position;
        double totalSalary = salary;
        System.out.println(name +" has been promoted to "+ designation);
        System.out.println("New Salary: "+ totalSalary + "Tk");
    }
}
