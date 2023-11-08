import java.util.Scanner;

public class ComputerEngg {
    private byte roll;
    private String name;
    private int grNumber;
    private String hobby;

    public void setRoll(byte roll) {
        this.roll = roll;
    }

    public byte getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrNumber(int grNumber) {
        this.grNumber = grNumber;
    }

    public int getGrNumber() {
        return grNumber;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }
}

class Student extends ComputerEngg {
    private String area_of_interest;
    private byte[] marks = new byte[5];

    public void setArea_of_interest(String area_of_interest) {
        this.area_of_interest = area_of_interest;
    }

    public String getArea_of_interest() {
        return area_of_interest;
    }

    public void setMarks(byte[] arr) {
        if (arr.length == 5) {
            System.arraycopy(arr, 0, this.marks, 0, 5);
        } else {
            System.err.println("Marks array should have exactly 5 elements.");
        }
    }

    public void getMarks() {
        String[] subjects = {"Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5"};
        for (int j = 0; j < 5; j++) {
            System.out.println(subjects[j] + " : " + marks[j]);
        }
    }
}

public class inherited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("Enter Roll Number: ");
        byte roll = scanner.nextByte();
        student.setRoll(roll);

        System.out.print("Enter GR Number: ");
        int grNumber = scanner.nextInt();
        student.setGrNumber(grNumber);
        scanner.nextLine();

        System.out.print("Enter Hobby: ");
        String hobby = scanner.nextLine();
        student.setHobby(hobby);

        System.out.print("Enter Area of Interest: ");
        String areaOfInterest = scanner.nextLine();
        student.setArea_of_interest(areaOfInterest);

        System.out.println("Enter Marks for 5 Subjects:");
        byte[] marks = new byte[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextByte();
        }
        student.setMarks(marks);

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRoll());
        System.out.println("GR Number: " + student.getGrNumber());
        System.out.println("Hobby: " + student.getHobby());
        System.out.println("Area of Interest: " + student.getArea_of_interest());
        System.out.println("Marks:");
        student.getMarks();
    }
}
