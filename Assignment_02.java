
public class CovidPatientDatabase {
    public static class CovidPatient {
        private String name;
        private int id;
        private String dateOfBirth;
        private String bloodGroup;
        private String testReport;
        private String contactAddress;
        private String telephoneNumber;
        private String aadharNumber;

        public CovidPatient(String name, int id, String dateOfBirth, String bloodGroup, String testReport) {
            this.name = name;
            this.id = id;
            this.dateOfBirth = dateOfBirth;
            this.bloodGroup = bloodGroup;
            this.testReport = testReport;
        }

        public CovidPatient(String name, int id, String dateOfBirth, String bloodGroup, String testReport,
                            String contactAddress, String telephoneNumber, String aadharNumber) {
            this.name = name;
            this.id = id;
            this.dateOfBirth = dateOfBirth;
            this.bloodGroup = bloodGroup;
            this.testReport = testReport;
            this.contactAddress = contactAddress;
            this.telephoneNumber = telephoneNumber;
            this.aadharNumber = aadharNumber;
        }

        public void displayInformation() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Blood Group: " + bloodGroup);
            System.out.println("Test Report: " + testReport);
            if (contactAddress != null) {
                System.out.println("Contact Address: " + contactAddress);
            }
            if (telephoneNumber != null) {
                System.out.println("Telephone Number: " + telephoneNumber);
            }
            if (aadharNumber != null) {
                System.out.println("Aadhar Number: " + aadharNumber);
            }
        }
    }

    public static void main(String[] args) {
        CovidPatient patient1 = new CovidPatient("John Doe", 101, "01-01-1990", "A+", "Negative");
        CovidPatient patient2 = new CovidPatient("Alice Smith", 102, "02-02-1985", "B-", "Positive",
                "123 Main St, City", "123-456-7890", "1234-5678-9012");

        System.out.println("Patient 1 Information:");
        patient1.displayInformation();

        System.out.println("\nPatient 2 Information:");
        patient2.displayInformation();
    }
}
