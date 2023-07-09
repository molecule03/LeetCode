package LeetCode_Contest.BW88;

import java.util.*;

public class A {
    public static void main(String[] args) {

        System.out.println("keep it up Lavesh");

        String word1 = "aazz";
        String word2 = "abcc";
        System.out.println(equalFrequency(word1));
    }

    public static boolean equalFrequency(String word) {

        Map<Character, Integer> map = new HashMap<>();

        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int val : map.values())list.add(val);
        Collections.sort(list);
        // System.out.println(map);
        int count = 0;
        for(char key : map.keySet()){
            int val = 0;
            Set<Integer> set =  new HashSet<>();
            for(char k : map.keySet()){
                if(key-'a' == k-'a'){
                    if(map.get(key)-1 > 0){
                        set.add(map.get(key)-1);
                    }
                    continue;
                }
                set.add(map.get(k));
            }

            if(set.size() == 1) return true;
        }

        for(int i : list){
            if(i == 1) count++;
        }

        if(count == word.length()) return true;

        return false;


    }
}
