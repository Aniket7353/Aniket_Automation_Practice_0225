package ex_06_UserDefinedFunctions;

public class Lab_002_All_Examples_UDF {
    public static void main(String[] args) {

        //1. Without Parameters and Without Return Type.
        greet();

        //2. Without Parameters but With Return Type
        String s = greet_2();
        System.out.println(s);

        //3. With Parameters and Without Return Type
        name_of_the_user("Aniket");
        full_name("Aniket", " Thorat");

        //4. With Parameters and With Return Type
        int sum = sum_oftwonumber(3, 4);
        int sum2 =sum_oftwonumber(100,200);
        System.out.println(sum);
        System.out.println(sum2 );

    }
     //1. Without Parameters and Without Return Type.
    static void greet (){
        System.out.println("Hello Im Example 1");
    }
    //2. Without Parameters but With Return Type
    static String greet_2(){
        return "Hello Im example 2";
    }
    //3. With Parameters and Without Return Type
    static void name_of_the_user (String name){
        System.out.println("Hello May name Is Example 3 = " + name);
    }
    static void full_name(String FirstName , String LastName){
        System.out.println("Full Name " + FirstName + LastName);
    }

    //4. With Parameters and With Return Type
    static int  sum_oftwonumber (int a, int b){
        return a+b;
    }
}
