package GFG_MustDoQuestions.Array;

import java.io.DataInputStream;
import java.io.IOException;

public class SubarrayWithGivenSum {
    public static void main (String[] args) throws IOException {
        DataInputStream obj = new DataInputStream(System.in);
        int t = Integer.parseInt(obj.readLine());
        while (t > 0){
            String line1[] = obj.readLine().split(" ");

            int n = Integer.parseInt(line1[0]);
            int sum = Integer.parseInt(line1[1]);
            int result = 0,initialPostion = 0;
            String line2[] = obj.readLine().split(" ");
            int a[] = new int[n];
            for (int i =0;i<n;i++){
                a[i] = Integer.parseInt(line2[i]);
            }
            for (int i =0;i<n;i++){
                result += a[i];
                if(result == sum){
                    System.out.println((initialPostion+1)+" "+(i+1));
                    break;
                }else  if (result > sum){
                    while (result > sum){
                        result -= a[initialPostion];
                        if( result == sum){
                            System.out.println((initialPostion+2)+" "+(i+1));
                            break;
                        }
                        initialPostion++;
                    }
                }
                if( result == sum){
                    break;
                }

            }
            if( result != sum)
                System.out.println(-1);
            t--;
        }
    }
}
