package BasicRecursion;

public class subsequent {

    // static variable to keep track of total subsequences generated
    // static because we want ONE shared counter across all recursive calls,
    // not a new counter every time the method is called
    static int count = 0;

    public static void main(String[] args) {
        int number = 12;

        // convert the number to a String so we can access digits one by one using index
        subsequentN(String.valueOf(number), 0, "");

        // after all recursive calls are done, print total count
        System.out.println("Total subsequences: " + count);
    }

    static void subsequentN(String num, int index, String current) {

        // BASE CASE:
        // if index has reached the end of the string,
        // it means we have made a decision (include/exclude) for every digit
        if (index == num.length()) {

            // print current subsequence (or "(empty)" if nothing was included)
            System.out.println(current.isEmpty() ? "(empty)" : current);

            // increment the counter every time we reach a base case
            // because each base case = one complete subsequence
            count++;

            return; // stop this recursive branch, go back (backtrack) to previous call
        }

        // CHOICE 1: INCLUDE current digit
        // add num.charAt(index) to "current" and move to next index
        subsequentN(num, index + 1, current + num.charAt(index));

        // CHOICE 2: EXCLUDE current digit
        // keep "current" unchanged and move to next index
        subsequentN(num, index + 1, current);
    }
}

/*
 * ===================================================================
 * DRY RUN (for number = 12, so num = "12", length = 2)
 * ===================================================================
 *
 * Call: subsequentN("12", 0, "")
 *
 * subsequentN(index=0, current="")
 * │
 * ├── INCLUDE '1' → subsequentN(index=1, current="1")
 * │ │
 * │ ├── INCLUDE '2' → subsequentN(index=2, current="12")
 * │ │ index == length(2) → BASE CASE
 * │ │ print "12" → count = 1
 * │ │
 * │ └── EXCLUDE '2' → subsequentN(index=2, current="1")
 * │ index == length(2) → BASE CASE
 * │ print "1" → count = 2
 * │
 * └── EXCLUDE '1' → subsequentN(index=1, current="")
 * │
 * ├── INCLUDE '2' → subsequentN(index=2, current="2")
 * │ index == length(2) → BASE CASE
 * │ print "2" → count = 3
 * │
 * └── EXCLUDE '2' → subsequentN(index=2, current="")
 * index == length(2) → BASE CASE
 * print "(empty)" → count = 4
 *
 * Final Output printed (in this exact order):
 * 12
 * 1
 * 2
 * (empty)
 * Total subsequences: 4
 *
 * Observation: every digit causes the recursion to split into 2 calls
 * (include + exclude). For n digits, total base-case hits = 2^n.
 * Here n = 2, so 2^2 = 4. Matches our output. ✔
 * ===================================================================
 *
 * TIME COMPLEXITY: O(2^n)
 * -------------------------------------------------------------
 * - n = number of digits in the input number (length of "num").
 * - At every index, the function branches into 2 recursive calls
 * (include + exclude). This forms a binary recursion tree.
 * - Total number of calls in this tree ≈ 2^(n+1) - 1, which is O(2^n).
 * - Total number of LEAF nodes (base cases / printed subsequences)
 * = exactly 2^n.
 *
 * SPACE COMPLEXITY: O(n)
 * -------------------------------------------------------------
 * - This refers to the RECURSION STACK space (auxiliary space),
 * not the space used to print output.
 * - At any point in time, the maximum depth of nested recursive
 * calls waiting on the call stack is equal to "n" (we go from
 * index 0 to index n, one call stacked per level).
 * - Once index == n, that branch returns and the stack unwinds,
 * so we never hold more than n calls on the stack at once.
 *
 * NOTE: If we also count the space needed to store the "current"
 * string being built at each level, each string can be up to
 * length n, so total space across the whole recursion becomes
 * O(n) per active path — still O(n), since only one path's
 * strings exist on the stack at any given moment (others get
 * garbage collected once their branch returns).
 * ===================================================================
 */