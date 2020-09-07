package WAJP.StringMatching;

public class BruteForce
{
    private static int stringMatchingBruteforce(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        for(int i =0;i <= n-m;i++) {
            int j = 0;
            while (j<m && pattern.charAt(j) == text.charAt(i+j))
                j++;
            if(j==m)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String p = "ISH";   //substring
        String t = "ANISH"; //text
        boolean isSubstring = stringMatchingBruteforce(t,p) == -1 ? false : true;
        int position = stringMatchingBruteforce(t,p);
        System.out.println("isPattern present: "+isSubstring + " at position :" + position);
    }
}
