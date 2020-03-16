package numberchecker;

public class NumberChecker {

    public String checkDivisibility(int number) {
        if (number % 3 ==0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if  (number % 3 == 0 && number % 5 ==0) {
            return "FizzBuzz";
        }
        return "Nope";
    }
}
