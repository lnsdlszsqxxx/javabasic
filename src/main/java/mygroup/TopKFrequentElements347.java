package mygroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,5,5,3};
        int[] nums2 = {1};
        int k = 2;
        System.out.println(topKFrequent(nums,k));
        System.out.println(topKFrequent(nums2,1));

    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        List<Integer> result = new ArrayList<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int key:map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int i=0;
        int l=1;
        while(i<k){
            if(bucket[bucket.length-l-i]==null) {l++;continue;}
            for(int j=0;j<bucket[bucket.length-l-i].size();j++) {
                result.add(bucket[bucket.length - l - i].get(j));
            }
            i++;
        }

        return result;
    }
}
