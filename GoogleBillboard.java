public class GoogleBillboard {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";
    public final static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public final static void main(String[] args) {
        boolean foundFirstPrime = false;

        for (int i = 2; i < (e.length() - 10); i++) {
            if (isPrime(Double.parseDouble(e.substring(i, i + 10))) && !foundFirstPrime) {
                System.out.println("First 10 digit prime of e located: " + e.substring(i, i + 10));

                if (!foundFirstPrime) {
                    foundFirstPrime = true;
                }
            }
        }
    }

    public final static boolean isPrime(double dNum) {
        for (int i = 0; i < primes.length; i++) {
            if (dNum % primes[i] == 0) {
                return false;
            }
        }

        for (int i = 6; i <= ((int)Math.floor(Math.sqrt(dNum))); i += 6) {
            if (dNum % (i + 1) == 0 || dNum % (i + 5) == 0) {
                return false;
            }
        }

        return true;
    }
}