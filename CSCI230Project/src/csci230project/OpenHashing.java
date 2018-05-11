package csci230project;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Open Hash Table
 * 
 * @author Sarah Nicholson
 */
public class OpenHashing 
{
    //instance variables
    private ArrayList [] hashTable;
    private ArrayList chaining;
    public int hashSize;
    public int numOfElements = 0;

    /**
     * constructor for open hashing class. 
     * 
     * @param n 
     */
    public OpenHashing(int n)
    {
        hashTable = new ArrayList[n];
        hashSize = n;
    }

    /**
     * a basic hash function 
     * 
     * @param str
     * @return the hashed key
     */
    public int h(String str)
    {
        int key = Math.abs(str.hashCode() % hashSize);
        return key;
    }

    /**
     * searches for a certain key and returns it if
     * found and if not found, returns -1
     * 
     * @param str
     * @return boolean
     */
    public int search(String str)
    {
        int index = h(str);
        if (hashTable[index] != null) 
        {
            for (int i = 0; i < hashTable[index].size(); i++) 
            {
                if (hashTable[index].get(i).equals(str))
                    return index;
            }
        }
        return  -1;
    }
    
    /**
     * takes in a string and hashes it to a certain position
     * and then adds it to that position and updates the number
     * of elements in the array
     * 
     * @param str 
     */
    public void insert(String str){
        int index = h(str);
        if (hashTable[index] != null)
            hashTable[index].add(str);
        else 
        {
            chaining = new ArrayList();
            hashTable[index] = chaining;
            hashTable[index].add(str);
        }

        numOfElements++;
    }

    /**
     * takes in a string and searches the hash table 
     * until it is found and removes it and decreases
     * the size of the array
     * 
     * @param str
     */
    public void delete(String str)
    {
        int index = search(str);
        if (index > 0)  
        {
            hashTable[index] = null;
            numOfElements--;
        }

    }
    
    /**
     * calculates the successful search time for open hashing
     * 
     * @return the load factor for successful 
     * searches for open hashing
     */
    public double calcSuccessful()
    {
        return (calcLoadFactor(hashSize) / 2 + 1);
    }
    
    /**
     * calculates the unsuccessful search time for open hashing
     * 
     * @return the load factor for unsuccessful 
     * searches for open hashing
     */
    public double calcUnsuccessful()
    {
        return (calcLoadFactor(hashSize));
    }
        
   /**
     * calculates the load factor
     * 
     * @param n
     * @return the load factor
     */
    public double calcLoadFactor(int n)
    {
        return (float)numOfElements/hashSize;
    }
    
    /**
     * gets the number of elements in the hash table
     * 
     * @return number of elements in hash table
     */
    public int getElements()
    {
        return numOfElements;
    }
    
    /**
     * 
     * @param args
     * @throws ElementNotInHashTableException 
     * @throws java.io.FileNotFoundException 
     */
    public static void main(String[] args) throws ElementNotInHashTableException, FileNotFoundException, IOException 
    {
        OpenHashing openHashing = new OpenHashing(31);
        
        openHashing.insert("hey");
        openHashing.insert("there");
        openHashing.insert("i");
        openHashing.insert("like");
        openHashing.insert("you");
        openHashing.insert("do");
        openHashing.insert("iejgwsjegiwekgseg");
        openHashing.insert("hasdhsdag");
        openHashing.insert("kakjag");
        openHashing.insert("aseogijawsg");
        openHashing.insert("byebye");
        openHashing.insert("okay");
        openHashing.insert("well");
        openHashing.insert("bye");
        openHashing.insert("how");
        openHashing.insert("to");
        openHashing.insert("does");
        openHashing.insert("aaaaa");
        openHashing.insert("y7uvr");
        openHashing.insert("sarah");
        openHashing.insert("a");
        openHashing.insert("ab");
        openHashing.insert("abc");
        openHashing.insert("abcd");
        openHashing.insert("abcde");
        openHashing.insert("abcde");
        openHashing.insert("abcdef");
        openHashing.insert("abcdefg");
        openHashing.insert("abcdefgh");
        openHashing.insert("abcdefghi");
        
        System.out.println(openHashing.hashSize);
        System.out.println(openHashing.numOfElements);
        
        System.out.println(openHashing.search("how")); //in table
                
        System.out.println(openHashing.search("ryan")); //not in table
        
        openHashing.delete("how");
        
        System.out.println(openHashing.search("how")); //deleted
    }
}