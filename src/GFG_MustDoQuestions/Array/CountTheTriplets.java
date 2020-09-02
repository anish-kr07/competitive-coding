package GFG_MustDoQuestions.Array;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class CountTheTriplets {
    public static void main (String[] args) throws IOException {
        DataInputStream obj = new DataInputStream(System.in);
        int t = Integer.parseInt(obj.readLine());
        while (t > 0){
            int n = Integer.parseInt(obj.readLine());
            int count = 0;
            String line2[] = obj.readLine().split(" ");
            int a[] = new int[n];
            for (int i =0;i<n;i++){
                a[i] = Integer.parseInt(line2[i]);
            }
            Arrays.sort(a);
            for(int i=0;i<n;i++ ) {
                int first = a[i];
                for (int j = i + 1; j < n - 1; j++) {
                    int k = j + 1;
                    while ((k < n) && ((a[i] + a[j] > a[k])||(a[i] + a[j] == a[k]))) {
                        if (a[i] + a[j] == a[k]) {
                            count++;
                        }
                        k++;
                    }
                }
            }
            System.out.println(count == 0 ? -1 : count);
            t--;
        }
    }
}
