public class Patient extends Person{
    private Doctor physician;

    public Patient(){
        this("No name", new Doctor());
    }
    public Patient(String name, Doctor physician){
        super(name);
        setPhysician(physician);
    }
    public Patient(Patient other){
        super(other);
        setPhysician(other.physician);
    }

    public Doctor getPhysician() {
        return physician;
    }
    public void setPhysician(Doctor physician) {
        this.physician = physician;
    }
    public String toString(){
        return "The name is: " + super.getName() + ", Primary doctor is: " + getPhysician().getName();
    }
    public boolean equals(Patient other){
        return super.equals(other) && getPhysician() == other.getPhysician();
    }

}// end Patient
