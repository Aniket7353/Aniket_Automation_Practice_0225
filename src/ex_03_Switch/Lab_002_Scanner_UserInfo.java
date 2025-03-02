package ex_03_Switch;
import java.util.Scanner;

public class Lab_002_Scanner_UserInfo {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name= scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Your salary: ");
        double salary= scanner.nextDouble();

        System.out.println("\n---User Information---");
        System.out.println("Name :" +name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+salary);

        scanner.close();

    }
}
