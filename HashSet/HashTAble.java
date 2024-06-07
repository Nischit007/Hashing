//  

// What is a Hash Table?
// A hash table (also known as a hash map) is a data structure that maps keys to values for highly efficient lookup. It uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.

// Key Concepts
// Hash Function: Converts a given key into an integer, which is then mapped to an index in an array.
// Collision Handling: Since different keys can hash to the same index, a method to handle these collisions is necessary. Common techniques include chaining (using linked lists) and open addressing.
// Load Factor: A measure that determines when to resize the hash table to maintain efficient performance.
// Hash Table in Java
// Java provides a built-in implementation of a hash table through the HashMap class in the java.util package.

// Basic Operations
// Put: Insert a key-value pair into the hash table.
// Get: Retrieve the value associated with a given key.
// Remove: Delete the key-value pair associated with a given key.
// ContainsKey: Check if a key exists in the hash table




import java.util.HashMap;
import java.util.Map;

public class HashTAble {
    public static void main(String[] args) {
        // Create a hash map
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Insert key-value pairs
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Retrieve a value
        int value = hashMap.get("two");
        System.out.println("Value for key 'two': " + value);
        
        // Check if a key exists
        boolean containsKey = hashMap.containsKey("three");
        System.out.println("HashMap contains key 'three': " + containsKey);
        
        // Remove a key-value pair
        hashMap.remove("one");
        System.out.println("HashMap after removing key 'one': " + hashMap);
    }
}


// Behind the Scenes
// Hash Function: Java's HashMap uses the hashCode() method of the key object to compute the hash code and then applies a secondary hash function to reduce collisions.

// code of brhind the scence 
// static final int hash(Object key) {
//     int h;
//     return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
// }


// Index Calculation: The index for the array (bucket) is determined using the modulus operator

// int index = hash(key) & (n - 1);  // where n is the length of the array


// Collision Handling: Java uses chaining with a linked list at each array index. If multiple keys hash to the same index, they are stored in a linked list at that index. From Java 8 onward, if the number of items in a bucket exceeds a certain threshold, the linked list is converted to a balanced tree (red-black tree) to improve performance.

// Resizing: When the load factor (number of elements divided by the number of buckets) exceeds a threshold (default 0.75), the hash table is resized. The array size is doubled, and all existing entries are rehashed to the new array.