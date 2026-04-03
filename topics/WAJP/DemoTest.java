package WAJP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "New, S1, S2, S3\n+" +
                "Sachin, 60, 80, 90\n"+
                "Rohith, 32, 35, 40\n"+
                "Kohili, 35, 35, 34\n"+
                "Sewag, 40, 45, 70\n"+
                "NTR, 90, 90, 90\n"+
                "Vijay, 50, 50, 50";
        String str[] = input.split("\n");
        int max = Integer.MIN_VALUE;
        String firstRank= "";
        int passCount =0;
        int failCount =0;
        for(int i=1;i<str.length;i++){
            String sd[] = str[i].split(",");
            int s1 = Integer.parseInt(sd[1].trim());
            int s2 = Integer.parseInt(sd[2].trim());
            int s3 = Integer.parseInt(sd[3].trim());
            if(s1 >= 35 && s2 >= 35 && s3 >= 35){
                int sum = s1+s2+s3;
                if(max<sum){
                    max = sum;
                    firstRank = sd[0];
                }
                passCount++;
            }else{
                failCount++;
            }
        }
        System.out.println("Number of students pass: "+passCount);
        System.out.println("Number of students fail: "+failCount);
        System.out.println("First rank : "+firstRank);

    }

}
