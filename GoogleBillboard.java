import java.util.ArrayList;

public class GoogleBillboard {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";
    public final static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public final static void main(String[] args) {
        boolean foundFirstPrime = false;

        for (int i = 2; i < (e.length() - 10); i++) {
            if (isPrime(Double.parseDouble(e.substring(i, i + 10))) && !foundFirstPrime) {
                System.out.println("Solution to level 1 (first 10 digit prime of e): \n" + e.substring(i, i + 10) + "\n");

                if (!foundFirstPrime) {
                    foundFirstPrime = true;
                }
            }
        }

        System.out.println("Solution to level 2: \n" + secondChallenge(e, 5));
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

    public final static String secondChallenge(String e, int n) {
        int sum;
        String currentNum;
        ArrayList<String> solutions = new ArrayList<>();
    
        for (int i = 2; i < (e.length() - 9); i++) {
            sum = 0;
            currentNum = e.substring(i, i + 10);
            
            for (int j = 0; j < currentNum.length(); j++) {
                sum += Character.getNumericValue(currentNum.charAt(j));
            }
        
            if (sum == 49) {
                solutions.add(currentNum);
            }
        }
    
        if (n > solutions.size()) {
            return "";
        } else {
            return solutions.get(n - 1);
        }
    }
}
