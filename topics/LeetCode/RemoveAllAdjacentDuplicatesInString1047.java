package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public static String removeDuplicates(String s) {
//         StringBuilder str = new StringBuilder(s);
//         int len = str.length();
//         for(int i =0; i< len-1;i++){
//             if(str.charAt(i) == str.charAt(i+1)){
//                 str = str.delete(i,i+2);
//                 len = str.length();
//                 i = -1;
//             }
//         }
//         return str.toString();
        StringBuilder ss = new StringBuilder();
        for(int j = 0 ; j < s.length(); j++)
        {
            char ch = s.charAt(j);

            if(ss.length() > 0 && ss.charAt(ss.length()-1) == ch)
            {
                ss.deleteCharAt(ss.length()-1);
            }
            else ss.append(ch);
        }
        return ss.toString();

    }
}

class TestRemoveAllAdjacentDuplicatesInString1047{
    public static void main(String[] args) {
        String str1= "abbaca";
        System.out.println("Input:  " + str1 + "\n" + "Output: " + RemoveAllAdjacentDuplicatesInString1047.removeDuplicates(str1) );
    }
}
