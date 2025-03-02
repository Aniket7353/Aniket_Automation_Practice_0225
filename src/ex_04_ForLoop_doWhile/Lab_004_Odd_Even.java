package ex_04_ForLoop_doWhile;

public class Lab_004_Odd_Even {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if (i%2 == 0){
                System.out.println("Even = " +i);
            }else {
                System.out.println("Odd = " +i);
            }

        }
    }
}
