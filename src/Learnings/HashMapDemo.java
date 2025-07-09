package Learnings;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void printfreq(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            Integer c = map.get(arr[i]);
            if (map.get(arr[i])==null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], ++c);
            }

            for (Map.Entry m:map.entrySet())
                System.out.println("Frequency of "+m.getKey()+" is "+m.getValue());


        }

    }
    public static void main(String[] args){
        int arr[] = {1,3,4,1,5,3,9,2,9};
        printfreq(arr);
    }
}
