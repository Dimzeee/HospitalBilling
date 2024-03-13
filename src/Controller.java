public class Controller {
    public static void main(String[] args){
        // Doctors
        Doctor doc1 = new Doctor("Bob",new Date("December",31,1969), 34000, "Pediatrist", 10.5);
        System.out.println(doc1);
        Doctor doc2 = new Doctor("Susan",new Date("December",31,1969), 450000, "Surgeon", 150.5);
        System.out.println(doc2);
        Doctor doc3 = new Doctor("Lily",new Date("December",31,1969), 290000, "Kidney", 95.5);
        System.out.println(doc3);

        // Patients
        System.out.println("\n\n*Patient's Information*");
        Patient patient1 = new Patient("Fred", doc1);
        System.out.println(patient1);
        Patient patient2 = new Patient("Sally", doc2);
        System.out.println(patient2);
        Patient patient3 = new Patient("John", doc3);
        System.out.println(patient3);

        // Billing Records
        System.out.println("\n\n*Billing Information*");
        Billing bill1 = new Billing(patient1, doc1);
        System.out.println(bill1);
        Billing bill2 = new Billing(patient2, doc2);
        System.out.println(bill2);
        Billing bill3 = new Billing(patient3, doc3);
        System.out.println(bill3);

        // Total Income
        double totalIncome = bill1.getPhysician().getVisitFee() +
                bill2.getPhysician().getVisitFee() +
                bill3.getPhysician().getVisitFee();
        System.out.println("\n\nThe total income from billing records is : $" + totalIncome);
    }//end main
}// end Controller
