package ex_03_Switch;

public class Lab_001_Switch {
    public static void main(String[] args) {
        int itemcode=005;

        switch (itemcode){
            case 001,002,003:
                System.out.println("This is medical item");
                break;

            case 004,005,006:
                System.out.println("This is Automobile item");
                break;
        }
    }
}
