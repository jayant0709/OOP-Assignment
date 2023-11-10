import java.util.Scanner;
public class Assignment_1 {
public static void getData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks for Mathematics: ");
	int math=sc.nextInt();
	System.out.println("Enter marks for Physics: ");
	int physics=sc.nextInt();
	System.out.println("Enter marks for Biology: ");
	int biology=sc.nextInt();
	System.out.println("Enter marks for Chemistry: ");
	int chemistry=sc.nextInt();
	System.out.println("Enter marks for History: ");
	int history=sc.nextInt();

	double avg=(math+physics+biology+chemistry+history)/5;
	System.out.println("Average is: "+avg);
	
	if(avg>=80) {
		System.out.println("A Grade");
	}
	else if(avg<80 && avg >= 70) {
		System.out.println("B Grade");
	}
	else if(avg<70 && avg>=60) {
		System.out.println("C Grade");
	}
	else {
		System.out.println("D Grade");
	}
}

public static void main(String args[]) {
	char ch='Y';
	while (ch=='Y') {
		getData();
		System.out.println("Do you want to continue (Y/N)");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
	}
	System.out.println("Thank You!");
	}
	
}
