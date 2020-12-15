package GFG_MustDoQuestions.random;

public class MissingNumberInSortedArray {


    public static int findMissingBumnber(int n[]) {

        int beg =0,end = n.length-1,mid=0;
        while(end-beg > 1) {
            mid = beg + (end - beg) / 2;
            if ((n[beg] - beg) != (n[mid] - mid))
                end = mid;
            else if ((n[end] - end) != (n[mid] - mid))
                beg = mid;
        }
        return n[mid]+1;
    }

    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,8};
        System.out.println("ANish");
        System.out.println(findMissingBumnber(n));
    }
}

