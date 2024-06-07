
// HashSET

// first what is set in math --
// the collection of number where their is no duplicate number for example -  1,2,3,4,5   are a set of number which contain unique collection of number


//why should we use hashset in java
// we should use hashset in java beacause of time complexity of hash set less


//Time complexity of hashSet in java

// INSERT/ADD--0(1)
// SEARCH CONTAINS--0(1)
// DELETE/REMOVE --0(1)


// Time complexity of an Array in java

// INSERT/ADD--0(1)
// SEARCH CONTAINS--0(n) because we need to check every index of an array which contain that element or not 
// DELETE/REMOVE --0(n)  because after delete the element we need to shift the element


import java.util.*;

public class HashSEt {
public static void main(String[] args) {
    HashSet<Integer>set=new HashSet<>();
    // Inset
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);  // will not be added because 1 is only contain in set
    System.out.println(set);  // OUTPUT  [1, 2, 3]  



    //Search  - contains
int num=2;
    if(set.contains(num)){
        System.out.println("set contain "+num);
    }else{
        System.out.println("set does not contain "+num);
    }

    //Delete
int removeNum=1;
    set.remove(removeNum);
    if(set.contains(removeNum)){
        System.out.println("the number " + removeNum+" is not removed");
    }else{
        System.out.println("the number " + removeNum+" is  removed");
    }
    
    //Size

    System.out.println("Size of set is :"+ set.size());// OUTPUT 2 because 1 is removed 



    //ITERATOR   FOR EXAMPLE :  for(int i =0;i<n;++) where i is ITERATOT because it is a variable which is move forward or backward in loop till the condition is satisfied.

    // Iterator it=set.iterator();

    //has two method 
    //1.hasNext
    //2.next 

    // suppose i have an hashset of  [1,2,3] the iterator first point to null. if we use method next then it point to 1 and then 2 and then 3

    //null->1->2->3
    

    // hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     **/

     Iterator it=set.iterator();

     while(it.hasNext()){
        System.out.println(it.next());

     }

}
    
}



// This class implements the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.