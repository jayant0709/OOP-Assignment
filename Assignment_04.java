
import java.util.Scanner;

class sbi{
    public void getrateofinterest(double x, int t){
        double rate=8.4;
        double interest=8.4*x*t/100;
        System.out.println("Rate of Interest in SBI is: "+interest);
    }
}
class hdfc{
    public void getrateofinterest(double x, int t){
        double rate=7.3;
        double interest=7.3*x*t/100;
        System.out.println("Rate of Interest in HDFC is: "+interest);
    }
}
class icici{
    public void getrateofinterest(double x,int t){
        double rate=9.7;
        double interest=9.7*x*t/100;
        System.out.println("Rate of Interest in ICICI is: "+interest);
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Bank:\n 1) SBI \n 2) HDFC \n 3) ICICI \n");
        int choice= sc.nextInt();
        System.out.println("Enter Loan Amount: ");
        double loan= sc.nextDouble();
        System.out.println("Enter Loan Time in Years: ");
        int time= sc.nextInt();
        switch (choice) {
            case 1:{
                sbi obj = new sbi();
                obj.getrateofinterest(loan,time);
                break;
            }
            case 2:{
                hdfc obj1 = new hdfc();
                obj1.getrateofinterest(loan,time);
                break;
            }
            case 3:{
                icici obj2 = new icici();
                obj2.getrateofinterest(loan,time);
                break;
            }
        }
    }
}
