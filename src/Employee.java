public class Employee extends Person{
    private Date hireDate;

    public Employee(){
        this("No name", new Date());
    }
    public Employee(String name, Date hireDate){
        super(name);
        setHireDate(hireDate);
    }
    public Employee(Employee other){
        super(other);
        setHireDate(other.hireDate);
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public  String toString(){
        return  " was hired on Wed " + getHireDate().getMonth() + " " +
                getHireDate().getDay() + " 19:00:12 EST " + getHireDate().getYear();
    }
    public  boolean equals(Employee other){
        return super.equals(other) && getHireDate().equals(other.getHireDate());
    }
}// end Employee
