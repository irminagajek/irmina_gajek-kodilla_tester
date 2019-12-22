import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int max = 5000;
        int liczbaMaks = 0;
        int liczbaMin = 30;

        Random random = new Random();
        int sum = 0;
        int result = 0;
        while (sum < max) {
            int randomValue = random.nextInt(31);
            sum = sum + randomValue;
            result++;

            System.out.println(randomValue);


            if (liczbaMaks < randomValue){
                liczbaMaks = randomValue;
                System.out.println(liczbaMaks);
            }
            if (liczbaMin > randomValue){
                liczbaMin = randomValue;
                System.out.println(liczbaMin);
            }
        }
        System.out.println("Najmniejsza wylosowana liczba to " + " " + liczbaMin);
        System.out.println("Największa wylosowana liczba to " + " " + liczbaMaks);

    }

    public static void bla(String[] args) {
        Random r = new Random();
        int [] tab = new int[5000];
        System.out.print("najmniejsza" + tab);
    }
}