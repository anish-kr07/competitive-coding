import java.util.stream.IntStream;

public class HelloWorld {

    public static void main(String args[]) {
        System.out.println("HI... I am Anish and this is my  Hellow World program");

        //Two Sum
//        TwoSum twoSum = new TwoSum();
//        int a[] = twoSum.twoSum(new int[]{1, 2, 5, 6, 7}, 9);
//        System.out.println(a[0] + "  " + a[1]);
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println("No Of jewsels:" + jewelsAndStones.numJewelsInStones("aA","aAAbbbb"));

    }

}
