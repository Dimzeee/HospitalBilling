public class Billing extends Patient {
    private Patient patient;
    private Doctor doctor;
//    private double amountDue;

    public Billing(){
        this(null,null );
    }
    public Billing(Patient patient, Doctor doctor){
        super(patient.getName(), doctor);
    }
    public Billing(Billing other){
        super(other.patient);
    }

//    public double getAmountDue() {
//        return amountDue;
//    }
//
//    public void setAmountDue(double amountDue) {
//        amountDue =getPhysician().getVisitFee();
//        this.amountDue = amountDue;
//    }

    public String toString(){
        return  "Patient: " + super.getName()
                + "\nDoctor: " + super.getPhysician().getName()
                + "\nAmount Due: $" + getPhysician().getVisitFee();
    }
    public boolean equals(Billing other){
        return super.equals(other);
    }


}// end Billing
