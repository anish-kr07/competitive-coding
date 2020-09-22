package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch : chars.toCharArray()){
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.replace(ch,map.get(ch)+1);
        }
        int sum = 0;
        for(String st: words){
            boolean flag = false;
            HashMap<Character,Integer> hashMap = new HashMap<>();
            hashMap.putAll(map);
            for(Character ch : st.toCharArray()){
                if(!hashMap.containsKey(ch) || hashMap.get(ch) == 0){
                    flag = false;
                    break;
                } else {
                    flag = true;
                    hashMap.replace(ch,hashMap.get(ch)-1);
                }
            }

            if(flag) sum+=st.length();
        }
//        System.out.println("output "+sum );
        return sum;
    }
}

class  Test{
    public static void main(String[] args) {
        LeetCode.FindWordsThatCanBeFormedByCharacters1160 obj = new LeetCode.FindWordsThatCanBeFormedByCharacters1160();
        int result = obj.countCharacters(new String[]{"cat","bt","hat","tree"},"atach");
        System.out.println(result);
    }
}
