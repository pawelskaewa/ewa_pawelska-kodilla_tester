public class SimpleArray {
    public static void main(String[] args) {
        String[] randomNames = new String[] {"Emilia", "Klaudia", "Kinga", "Agnieszka", "Sebastian"};
        String randomName = randomNames[3];
        System.out.println(randomName);

        int numberOfElements = randomNames.length;
        String poczatekZdania = "Moja tablica zawiera ";
        String koniecZdania = " elementów";

        System.out.println( poczatekZdania + numberOfElements + koniecZdania);

    }
}