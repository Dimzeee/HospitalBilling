public class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(){
        this("No name", new Date(), 0.0);
    }
    public SalariedEmployee(String name, Date hireDate, double salary){
        super(name, hireDate);
        setSalary(salary);
    }
    public SalariedEmployee(SalariedEmployee otherEmployee){
        super(otherEmployee);
        setSalary(otherEmployee.salary);
    }
    public void setSalary(Double salary){
        if(salary <0.0){
            System.out.println("Invalid Salary");
            System.exit(0);
        }
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }
    public String toString(){
        return super.toString() + " at a Salary of $" + getSalary() + ".";
    }
    public boolean equals(SalariedEmployee other){
        return super.equals(other) && getSalary() == other.getSalary();
    }
}// end SalariedEmployee
