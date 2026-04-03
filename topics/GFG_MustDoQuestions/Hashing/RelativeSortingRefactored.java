package GFG_MustDoQuestions.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RelativeSortingRefactored {
    public static void main (String[] args) throws IOException {
        // BufferedReader is the modern, non-deprecated way to handle text input streams.
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        
        String tInput = obj.readLine();
        if (tInput == null) return;
        
        // .trim() prevents NumberFormatException errors if there are accidental spaces.
        int t = Integer.parseInt(tInput.trim());
        while (t > 0){
            int n = Integer.parseInt(obj.readLine().trim());
            int count = 0;
            
            // Using \\s+ gracefully handles single OR multiple spaces between numbers
            String line2[] = obj.readLine().trim().split("\\s+");
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
                            //only for distinct elements
                            break;
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
