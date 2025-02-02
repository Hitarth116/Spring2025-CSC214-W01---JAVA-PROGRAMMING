import java.util.ArrayList;

public class Factorizer {

    // Method to find prime factors of a number
    public ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (number <= 1) {
            return factors;
        }

        // Factor out 2s
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        // Factor out odd numbers from 3 onwards
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        // If remaining number is a prime
        if (number > 2) {
            factors.add(number);
        }

        return factors;
    }

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        ArrayList<Integer> factors = primeFactors(number);
        return factors.size() == 1 && factors.get(0) == number;
    }

    // Method to check if a number is composite
    public boolean isComposite(int number) {
        return number > 1 && !isPrime(number);
    }

    // Method to simplify fractions
    public String reduce(int numerator, int denominator) {
        ArrayList<Integer> numFactors = primeFactors(numerator);
        ArrayList<Integer> denFactors = primeFactors(denominator);

        for (Integer factor : new ArrayList<>(numFactors)) {
            while (denFactors.contains(factor)) {
                numerator /= factor;
                denominator /= factor;
                numFactors.remove(factor);
                denFactors.remove(factor);
            }
        }

        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }

    // Main method for testing
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();
    
        // Testing primeFactors method
        System.out.println("Prime factors of 100: " + factorizer.primeFactors(100)); 
        System.out.println("Prime factors of 35: " + factorizer.primeFactors(35));   
        System.out.println("Prime factors of 24: " + factorizer.primeFactors(24));   
        System.out.println("Prime factors of 17: " + factorizer.primeFactors(17));   
    
        // Testing isPrime method
        System.out.println("Is 36 prime? " + factorizer.isPrime(36)); 
        System.out.println("Is 17 prime? " + factorizer.isPrime(17)); 
        System.out.println("Is 12 prime? " + factorizer.isPrime(12)); 
        System.out.println("Is 1 prime? " + factorizer.isPrime(1)); 
    
        // Testing isComposite method
        System.out.println("Is 36 composite? " + factorizer.isComposite(36)); 
        System.out.println("Is 17 composite? " + factorizer.isComposite(17)); 
    
        // Testing reduce method
        System.out.println("Reduce 36/12: " + factorizer.reduce(36, 12)); 
        System.out.println("Reduce 12/14: " + factorizer.reduce(12, 14)); 
        ///gfjhhgkh
    }
}
