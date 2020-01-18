import java.util.*;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int matirx[][] = new int[26][A.length];
        int index =0;
        for(String i:A){
            for(Character ch : i.toCharArray()){
                matirx[ch-97][index] +=1;
            }
            index++;
        }
        List<String> output = new ArrayList<>();
        for (int line =0;line<26;line++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<A.length;i++){
                list.add(matirx[line][i]);
            }
            int frequency = Collections.min(list);
            for(int k=1;k<=frequency;k++){
                output.add(String.valueOf((char)(line+97)));
            }
        }
        return output ;

//        Method 2 using hashMap
//        Map<Character,List<Integer>> map = new HashMap<>();
//        for(String st : A){
//            List<Integer> list = new ArrayList<>();
//              list.set(0,2);
//            for(Character ch : st.toCharArray()){
//                map.put(ch,list);
//            }
    }
}
