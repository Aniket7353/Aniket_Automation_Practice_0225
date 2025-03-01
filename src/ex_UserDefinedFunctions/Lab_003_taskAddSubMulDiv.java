package ex_UserDefinedFunctions;

import java.util.Scanner;

public class Lab_003_taskAddSubMulDiv {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Numb 1");

        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();

        }else {
            System.out.println("Enter Int datatype only");
            System.exit(0);
        }
        //int a = scanner.nextInt();
        System.out.println("Enter Numb 2");
        int b = scanner.nextInt();

        int result_sum= sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);

        System.out.println(result_sum);
        System.out.println(result_mul);
        System.out.println(result_sub);
        System.out.println(result_div);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        if (b==0){
            System.out.println("Div is not allowed");
        }
        return a / b;
    }
}
