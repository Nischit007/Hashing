// HashMap is such type of structure which store two type of information key and value


// key must be unique and value can be unique or duplicate

import java.util.*;



public class HashMAP {

   public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion

        map.put("apple",5);
        map.put("banana",8);
        map.put("orange",10);
        // System.out.println(map);
        map.put("apple",10);
        System.out.println(map);



        // map.put() ->if key is exist then the value will be upgrade or override otherwise new pair is created.

        // SEARCH

        if(map.containsKey("apple")){
            System.out.println("prsented in the map");
            System.out.println(map.get("apple"));
        }else{
            System.out.println("key is not present in the map");
        }


        // map.get()  -> if key exist it return the the value of that crossponding key otherwise return null


        //Iteration

        for(Map.Entry<String,Integer> c: map.entrySet())
        {
            System.out.println(c.getKey()+"="+ c.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        // Remove

        map.remove("apple");
        System.out.println(map);

   }
    
} 