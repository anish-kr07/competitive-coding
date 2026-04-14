package LeetCode;

import java.util.Random;

public class ImplementRand10UsingRand7470 {
    /**
     * The rand7() API is already defined in the parent class SolBase.
     * public int rand7();
     * @return a random integer in the range 1 to 7
     */
    private Random random = new Random();
    public int rand7() {
        // nextInt(7) gives {0,1,2,3,4,5,6} uniformly
        return random.nextInt(7)+1;
    }

    public int rand7AnotherImplmentation() {
        // Math.random() → [0.0, 1.0)
        // * 7            → [0.0, 7.0)
        // (int)          → {0,1,2,3,4,5,6}
        // + 1            → {1,2,3,4,5,6,7}
        return (int )(Math.random()*7) +1;
    }

    public int rand10() {
        while(true) {
            int row = rand7() -1;
            int col = rand7();
            int value = row*7+col;
            if (value < 41)
                return value %10 + 1;
        }
    }
}
