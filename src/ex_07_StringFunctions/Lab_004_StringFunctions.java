package ex_07_StringFunctions;

public class Lab_004_StringFunctions {
    public static void main(String[] args) {
        String a= "Andy";
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        System.out.println(a.concat(" Thorat"));
        System.out.println(a.contains("An"));
        System.out.println(a.equals("Andy"));
        System.out.println(a.equalsIgnoreCase("andy"));
        System.out.println(a.indexOf("d"));
        System.out.println(a.replace("d","dd"));
        System.out.println(a.replace("d","a"));

        String a2= "aniket@Thorat";
        String [] split= (a2.split("@"));
        System.out.println(split [0]);
        System.out.println(split[1]);

        String aa ="humburger";
        System.out.println(aa.substring(4,8));

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.startsWith("A"));
        System.out.println(a.endsWith("a"));

        String name = "    Andy Thorat    ";
        System.out.println(name.trim());

        System.out.println(a.compareTo("Andy"));
        System.out.println(a.compareToIgnoreCase("andy"));

        StringBuilder stringBuilder = new StringBuilder("Andy");
        stringBuilder.append(" Thorat");
        System.out.println(stringBuilder);
    }
}
