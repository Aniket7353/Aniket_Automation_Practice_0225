package ex_Ternary_Operator;

public class Lab_005_LargestNumberOneMore {
    public static void main(String[] args) {
        int n1=10,n2=20,n3=30;

        int Largest =(n1>=n2) ? ((n1>=n3) ? n1:n3) :((n2>=n3)? n2 : n3);
        System.out.println( "Largest Number = " + Largest);
    }
}
