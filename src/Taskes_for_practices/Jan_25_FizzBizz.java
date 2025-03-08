package Taskes_for_practices;

public class Jan_25_FizzBizz {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("Fizz Bizz");
            } else if (i%3==0) {
                System.out.println("Fizz");
                
            } else if (i%5==0) {
                System.out.println("Bizz");

            }else {
                System.out.println(i);
            }
        }
    }
}
