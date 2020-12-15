package GFG_MustDoQuestions.random;

public class KadneAlgoMaxSum {

    public static int kadne(int n[]){
        int maxSum =0,sumTillHere =0;
        for(int i : n){
            sumTillHere +=i;
            sumTillHere = Integer.max(sumTillHere,0);
            maxSum = Integer.max(maxSum,sumTillHere);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int n[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sum is "+ kadne(n));
    }
}
