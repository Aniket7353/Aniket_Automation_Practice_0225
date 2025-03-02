package ex_01_Ternary_Operator;

public class Lab_002_LargestNumber {
    public static void main(String[] args) {
        int n1=2,n2=9,n3=-11;
        int Largest = (n1>=n2) ? ((n1>=n3) ? n1:n3) :((n2>=n3)? n2:n3);
        System.out.println("Largest Number = " + Largest);
    }
}
