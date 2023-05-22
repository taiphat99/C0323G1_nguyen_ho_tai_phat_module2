package ss11_dsa_stack_queue.exercise.exercise_2;

import java.util.*;

public class CountingWord {
    public static void main(String[] args) {
        String str = "Anh và em là hai người anh em tốt tính";
        countingWord(str);
    }

    public static void countingWord(String str) {
        str = str.toLowerCase();
        Map<String, Integer> wordMap = new TreeMap<>();
        String[] words = str.split(" ");
        for(int i = 0; i<words.length;i++){
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count ++;
                }
            }
            wordMap.put(words[i],count);
        }
        Set<String> keyMap = wordMap.keySet();

        for (String key : keyMap) {
            System.out.println("key: " + key + ", count: " + wordMap.get(key));
        }
    }
}
