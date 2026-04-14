package Interview;

import java.util.Arrays;

public class UberListOfEnergiesWithRange {
    public static int[] maxEnergy(int[] e, int[][] m){
        for (int i = 0; i < m.length ; i++) {
                for (int k = m[i][0]; k <= m[i][1] ; k++) {
                    e[k] += m[i][2];
                }
        }
        return e;
    }

}

class TestUberListOfEnergiesWithRange{
    public static void main(String[] args) {
        int[] energy = {4, 8, 12 , 0, 6};
        int[][] matrix = { {0, 2, 2}, {2, 4, 1} };
        
        //output = {6, 10, 15, 1, 7}
        System.out.println("Output " + Arrays.toString(UberListOfEnergiesWithRange.maxEnergy(energy, matrix)));
    }
}
