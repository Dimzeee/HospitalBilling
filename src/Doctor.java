public class Doctor extends SalariedEmployee {
    private String speciality;
    private  double visitFee;

    public Doctor(){
        this("No name", new Date(), 0.0, "None", 0.0);
    }
    public Doctor(String name, Date hireDate, double salary, String speciality, double visitFee){
        super(name, hireDate, salary);
        setSpeciality(speciality);
        setVisitFee(visitFee);
    }

    public Doctor(Doctor other) {
        super(other);
        setSpeciality(other.speciality);
        setVisitFee(other.visitFee);
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void setVisitFee(double visitFee) {
        this.visitFee = visitFee;
    }
    public String getSpeciality() {
        return speciality;
    }
    public double getVisitFee() {
        return visitFee;
    }
    public String toString(){
        return "The doctor " + super.getName() + super.toString() +
                "\nThe speciality is " + getSpeciality() + " and visit fee is $" + getVisitFee() + ".";
    }
    public boolean equals(Doctor other){
        return super.equals(other) && getSpeciality().equals(other.getSpeciality())
                && getVisitFee() == other.getVisitFee();
    }

}//end Doctor
