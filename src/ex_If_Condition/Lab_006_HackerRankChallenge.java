package ex_If_Condition;

public class Lab_006_HackerRankChallenge {
    public static void main(String[] args) {
        int score =-10;

        if (score>=90 && score<=100){
            System.out.println("Student is Pass with A Grade");
        } else if (score<=89 && score>=80) {
            System.out.println("Student is Pass with B Grade");
        } else if (score <=79 && score >=70) {
            System.out.println("Student is Pass with C Grade");
        } else if (score <=69 && score >=60) {
            System.out.println("Student is Pass with D Grade");
        } else if (score <=59 && score >=0) {
            System.out.println("Student is Failed");
        }
        else {
            System.out.println("Invalid Score. You have to check score first!");
        }
    }
}
