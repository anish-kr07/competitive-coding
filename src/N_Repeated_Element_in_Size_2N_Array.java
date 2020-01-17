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
        return 0;
    }
}
