package LeetCode;

import java.util.*;

public class BrickWall554 {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> hasMap = new HashMap<>();
        int count = 0;
        for(List<Integer> row : wall){
            int sum = 0;
            for (int i = 0; i <row.size()-1 ; i++) {
                sum += row.get(i);
                hasMap.put(sum, hasMap.getOrDefault(sum,0)+1 );
                count = Math.max(count, hasMap.get(sum));
            }
        }
        return wall.size() - count;
    }
}

class TestBrickWall554 {
    public static void main(String[] args) {
        BrickWall554 obj = new BrickWall554();
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 2, 1)),
                new ArrayList<>(Arrays.asList(3, 1, 2 )),
                new ArrayList<>(Arrays.asList(1, 3, 2)),
                new ArrayList<>(Arrays.asList(2,4)),
                new ArrayList<>(Arrays.asList(3, 1, 2)),
                new ArrayList<>(Arrays.asList(1, 3, 1, 1))
        ));
        System.out.println("result  " + obj.leastBricks(list));

    }
}

