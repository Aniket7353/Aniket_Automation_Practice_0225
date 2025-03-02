package ex_02_If_Condition;

public class Lab_007_HackerRank1 {
    public static void main(String[] args) {
        double side1 = 20;
        double side2 = 20;
        double side3 = 10;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid Value is provided Need to check the value");
        } else if ((side1 >= 100 || side2 >= 100 || side3 >= 100)) {
            System.out.println("Invalid Value is provided Need to check the value");
        } else {
            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("Its a Equilateral Triangle");
            } else if (side1 == side2 && side2 != side3 && side1 != side3) {
                System.out.println("Its a Isosceles Triangle");
            } else if ((side1 != side2 && side2 == side3 && side1 != side3)) {
                System.out.println("Its a Isosceles Triangle");
            } else if (side1 != side2 && side2 != side3 && side1 !=side3) {
                System.out.println("Its a Scalene Triangle");
            } else {
                System.out.println("Trangle sides value which is provided its invalid need to chekc the provided input");
            }
        }

    }
}

