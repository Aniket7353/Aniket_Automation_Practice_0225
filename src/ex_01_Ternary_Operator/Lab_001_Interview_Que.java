package ex_01_Ternary_Operator;

public class Lab_001_Interview_Que {
    public static void main(String[] args) {
        int score=90;

        String result= (score>=90 && score<=100) ? "Grade A" : (score>=80 && score <=89 ) ? "Grade B": (score>=70 && score <=79 ) ? "Grade C":  (score>=60 && score <=69 ) ? "Grade D":  (score>=0 && score <=59 ) ? "Grade F": "Invalid Score" ;
        System.out.println("Grade of the student = " + result);
    }
}
