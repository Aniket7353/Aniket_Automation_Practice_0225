package ex_Ternary_Operator;

public class Lab_011_Eg_Sir_2 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        //--a -> A-> exp A-> 19 a->19
        //a++ -> B -> exp B ->19 b-> 20
        //a-- -> C -> EXP C -> 20 c-> 19

    }
}
