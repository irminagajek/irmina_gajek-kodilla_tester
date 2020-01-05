public class SimpleArray {
public static void main(String[] args) {
    String[] names = new String[5];
    names[0] = "Kala";
    names[1] = "Paweł";
    names[2] = "Miki";
    names[3] = "Fred";
    names[4] = "Paparuch";

    String name = names[3];
    System.out.println(name);
    int numberOfElements = names.length;
    System.out.println(numberOfElements);
    System.out.println("Moja tablica zawiera" + " " + numberOfElements + " " + "elementów");
}
}
