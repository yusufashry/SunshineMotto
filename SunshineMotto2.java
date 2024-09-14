public class SunshineMotto2 { 
    public static void main(String[] args) {
        String motto = "Yummy makes the food that makes it a party.";
        int borderLength = motto.length() + 4;
        printBorder(borderLength);
        System.out.println("S " + motto + " S");
        printBorder(borderLength);
    }
  
    public static void printBorder(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("S");
        }
        System.out.println();
    }
}
