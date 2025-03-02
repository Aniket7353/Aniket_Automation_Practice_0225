package ex_String_0203;

public class Lab_001_string {
    public static void main(String[] args) {
        String a = "Aniket";
        String a2 = new String("aniket");
        System.out.println(a);
        System.out.println(a2);
        String anotherPalindrom = "Niagara. o Roar Again";
        String roar = anotherPalindrom.substring(11,15);
        System.out.println(roar);

        String a3 ="Aniket";
        String a4 = a3.concat(" Thorat");
        System.out.println(a4);
    }
}
