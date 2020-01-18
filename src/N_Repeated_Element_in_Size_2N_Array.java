import java.util.HashSet;
import java.util.Set;

public class N_Repeated_Element_in_Size_2N_Array {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            if(set.add(i) == false){
                return i;
            }
        }
//        pigenhole algo
//        for(int i=0;i< A.length;i++){
//            if(A[i] == A[i+1] || A[i]==A[i+2])
//                return A[i];
//        }
        return 0;
    }
}
