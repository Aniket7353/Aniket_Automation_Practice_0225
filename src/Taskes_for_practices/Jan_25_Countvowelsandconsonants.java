package Taskes_for_practices;

import java.util.Scanner;

public class Jan_25_Countvowelsandconsonants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string = ");
        String input = scanner.nextLine();

        int vowalCount = 0, consonantCount = 0;

        input = input.toLowerCase();

        for (char ch : input.toCharArray()){
            if (Character.isLetter(ch)){
                if (isVowel(ch)){
                    vowalCount++;
                }else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel =" + vowalCount);
        System.out.println("Consonant =" +consonantCount);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) !=-1;
    }
}
