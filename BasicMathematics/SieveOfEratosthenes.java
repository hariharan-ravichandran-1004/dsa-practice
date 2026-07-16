
package BasicMathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

    // Function to find all prime numbers from 2 to n
    public static List<Integer> findPrimes(int n) {

        // Step 1:
        // Create a boolean array of size n + 1.
        // Initially assume every number is prime.
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime.
        if (n >= 0)
            isPrime[0] = false;
        if (n >= 1)
            isPrime[1] = false;

        // Step 2:
        // Traverse only till √n.
        // If the current number is prime,
        // mark all of its multiples as non-prime.
        for (int i = 2; (long) i * i <= n; i++) {
            if (isPrime[i]) {
                // Start from i * i because
                // all smaller multiples have already been marked.
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3:
        // Collect all numbers still marked as prime.
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                primes.add(i);
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("Primes up to " + n + " : " + findPrimes(n));
    }
}

/*
 * =============================================================================
 * ==
 * SIEVE OF ERATOSTHENES
 * =============================================================================
 * ==
 * 
 * Definition
 * ----------
 * The Sieve of Eratosthenes is an efficient algorithm used to
 * find all prime numbers from 2 to n.
 * 
 * Instead of checking each number individually, it marks the
 * multiples of every prime number as non-prime.
 * 
 * -----------------------------------------------------------------------------
 * --
 * Algorithm
 * -----------------------------------------------------------------------------
 * --
 * 
 * 1. Create a boolean array isPrime[] of size n + 1.
 * 
 * 2. Assume every number is prime.
 * 
 * Arrays.fill(isPrime, true);
 * 
 * 3. Mark
 * 
 * isPrime[0] = false
 * isPrime[1] = false
 * 
 * 4. Traverse from 2 to √n.
 * 
 * 5. If current number i is prime,
 * mark all multiples of i as non-prime.
 * 
 * 6. Start marking from i × i.
 * 
 * 7. Finally, every index that is still true is a prime number.
 * 
 * -----------------------------------------------------------------------------
 * --
 * Dry Run
 * -----------------------------------------------------------------------------
 * --
 * 
 * Example
 * 
 * n = 30
 * 
 * Initially
 * 
 * Index
 * 
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28
 * 29 30
 * 
 * Prime?
 * 
 * F F T T T T T T T T T T T T T T T T T T T T T T T T T T T T T
 * 
 * -----------------------------------------------------------------------------
 * --
 * 
 * i = 2
 * 
 * 2 is prime.
 * 
 * Start marking from
 * 
 * 2 × 2 = 4
 * 
 * Mark
 * 
 * 4
 * 6
 * 8
 * 10
 * 12
 * 14
 * 16
 * 18
 * 20
 * 22
 * 24
 * 26
 * 28
 * 30
 * 
 * Remaining prime candidates
 * 
 * 2 3 5 7 9 11 13 15 17 19 21 23 25 27 29
 * 
 * -----------------------------------------------------------------------------
 * --
 * 
 * i = 3
 * 
 * 3 is prime.
 * 
 * Start marking from
 * 
 * 3 × 3 = 9
 * 
 * Mark
 * 
 * 9
 * 12
 * 15
 * 18
 * 21
 * 24
 * 27
 * 30
 * 
 * Newly marked
 * 
 * 9
 * 15
 * 21
 * 27
 * 
 * Remaining prime candidates
 * 
 * 2 3 5 7 11 13 17 19 23 25 29
 * 
 * -----------------------------------------------------------------------------
 * --
 * 
 * i = 4
 * 
 * 4 is already marked non-prime.
 * 
 * Skip.
 * 
 * -----------------------------------------------------------------------------
 * --
 * 
 * i = 5
 * 
 * 5 is prime.
 * 
 * Start marking from
 * 
 * 5 × 5 = 25
 * 
 * Mark
 * 
 * 25
 * 30
 * 
 * 30 is already marked.
 * 
 * 25 becomes non-prime.
 * 
 * Remaining primes
 * 
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 * 29
 * 
 * -----------------------------------------------------------------------------
 * --
 * 
 * Next value
 * 
 * i = 6
 * 
 * 6 × 6 = 36
 * 
 * 36 > 30
 * 
 * Stop the loop.
 * 
 * -----------------------------------------------------------------------------
 * --
 * Output
 * -----------------------------------------------------------------------------
 * --
 * 
 * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
 * 
 * -----------------------------------------------------------------------------
 * --
 * Why do we iterate only till √n?
 * -----------------------------------------------------------------------------
 * --
 * 
 * Every composite number has at least one factor less than
 * or equal to √n.
 * 
 * Example
 * 
 * 77 = 7 × 11
 * 
 * Since 7 ≤ √77,
 * 
 * 77 will already be marked while processing 7.
 * 
 * Hence traversing till √n is sufficient.
 * 
 * -----------------------------------------------------------------------------
 * --
 * Why start marking from i × i?
 * -----------------------------------------------------------------------------
 * --
 * 
 * Example
 * 
 * i = 5
 * 
 * 5 × 2 = 10 (already marked by 2)
 * 
 * 5 × 3 = 15 (already marked by 3)
 * 
 * 5 × 4 = 20 (already marked by 2)
 * 
 * Therefore, the first multiple that may not have been marked is
 * 
 * 5 × 5 = 25
 * 
 * This avoids duplicate work and improves efficiency.
 * 
 * -----------------------------------------------------------------------------
 * --
 * Time Complexity
 * -----------------------------------------------------------------------------
 * --
 * 
 * Creating boolean array
 * 
 * O(n)
 * 
 * Marking multiples
 * 
 * O(n log log n)
 * 
 * Collecting prime numbers
 * 
 * O(n)
 * 
 * Overall Time Complexity
 * 
 * O(n log log n)
 * 
 * -----------------------------------------------------------------------------
 * --
 * Space Complexity
 * -----------------------------------------------------------------------------
 * --
 * 
 * Boolean array
 * 
 * O(n)
 * 
 * List of primes
 * 
 * O(number of primes)
 * 
 * Auxiliary Space
 * 
 * O(n)
 * 
 * -----------------------------------------------------------------------------
 * --
 * Interview Points
 * -----------------------------------------------------------------------------
 * --
 * 
 * ✔ One of the fastest algorithms to generate all prime numbers up to n.
 * 
 * ✔ Uses a boolean array to mark composite numbers.
 * 
 * ✔ Iterate only till √n.
 * 
 * ✔ Start marking from i².
 * 
 * ✔ Time Complexity : O(n log log n)
 * 
 * ✔ Space Complexity : O(n)
 * 
 * =============================================================================
 * ==
 */
