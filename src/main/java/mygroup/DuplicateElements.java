package mygroup;

import java.io.IOException;
import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) throws IOException{
        String[] input = {"aab","aaabb","cddawww","odncvywu","yytzkww"};
        check(input);
    }

    public static void check(String[] input) throws IOException {
        List<String> result = new ArrayList<>();

        for(String each:input){
            Map<Character,Integer> output = new HashMap<>();
            int counter=0;

            for(int i=0;i<each.length();i++){
                if(!output.containsKey(each.charAt(i))) counter=0;
                else counter=output.get(each.charAt(i));
                counter++;
                output.put(each.charAt(i),counter);
            }
            String resultString = mapSort(output);

            System.out.println(resultString);

            result.add(resultString);
        }

        System.out.println(result);
    }

    public static String mapSort(Map<Character,Integer> input){
        LinkedHashMap<Character,Integer> output = new LinkedHashMap<Character,Integer>();

        List<Map.Entry<Character,Integer>> temp =new ArrayList<Map.Entry<Character,Integer>>(input.entrySet());

//        temp.sort(Map.Entry.comparingByValue());

        //use Collections to sort
        Collections.sort(temp, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Map.Entry<Character,Integer> entry: temp){
            output.put(entry.getKey(),entry.getValue());
        }


        int n=temp.size();
        if(n<2) return "null";
        if(temp.get(n-1).getValue()==1) return  "null";
        if(temp.get(n-1).getValue()==temp.get(n-2).getValue()) return "tie";

        return Character.toString(temp.get(n-1).getKey());

    }



}
