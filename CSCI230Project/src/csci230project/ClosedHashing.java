package csci230project;

/**
 * Closed Hash Table using Quadratic Probing
 * 
 * @author Sarah
 */
public class ClosedHashing
{
    public String[] hashTable;
    private int numOfElements;
    private int hashSize;
    private String lazyDelete = "lazy delete";
    private float loadFactor;
    
    public ClosedHashing(int n)
    {
        numOfElements = 0;
        loadFactor = .75f;
        hashSize = Math.round(n / loadFactor);
        hashSize = n;
        hashTable = new String[hashSize];
    }
    
    /**
     * a basic hash function 
     * 
     * @param key
     * @return the hashed key
     */
    public int h(int key)
    {
        return Math.abs(key / 31) % hashSize;
    }
    
    /**
     * searches the hash table to find a certain string and returns
     * true or false if found or not
     *
     * @param str
     * @return boolean
     */
    public boolean search(String str)
    {
        int index = h(str.hashCode());
        boolean isFound = false;
        int newIndex;
        
        if(hashTable[index] != null)
        {
            for(int i = 0; i < hashSize; i++)
            {
                newIndex = (index + i * i) % hashSize;
                if (hashTable[newIndex] == null || hashTable[newIndex] == str)
                {
                    if (hashTable[newIndex] == str)
                        isFound = true;
                }
            }
        }
        return isFound;
    }

    /**
     * inserts a value based on a key
     *
     * @param str
     * @throws FullHashTableException
     */
    public void insert(String str) throws FullHashTableException
    {
        int index = h(str.hashCode());
        int newIndex = -1;
        
        if(hashTable[index] == null)
        {
            hashTable[index] = str;
            numOfElements++;
        }
        else if (!isFull())
        {
            for (int i = 0; i < hashSize; i++)
            {
                newIndex = (index + i * i) % hashSize;
                if (hashTable[newIndex] == null)
                    break;
            }
            hashTable[newIndex] = str;
            numOfElements++;
        }
    }
    
    /**
     * Deletes value based on a string
     * 
     * @param str
     * @throws ElementNotInHashTableException
     */
    public void delete(String str) throws ElementNotInHashTableException
    {
        delete(str.hashCode());
    }
    
    
    /**
     * Deletes a value based on a key
     * 
     * @param key
     * @throws NullPointerException
     * @throws ElementNotInHashTableException
     */
    public void delete(int key) throws ElementNotInHashTableException
    {
        int index = h(key);
        for(int i = 0; i < hashTable.length; i = ((i * i + index) % hashSize))
        {
            String next;
            if (hashTable[i] == null)
                throw new ElementNotInHashTableException();
            else if (hashTable[i].hashCode() == key)
            {
                if (hashTable[((i * i + index) % hashSize)] != null)
                    next = hashTable[((i * i + index) % hashSize)];
                else
                    next = null;         
                if (next != null)
                    hashTable[i] = lazyDelete;
                else
                    hashTable[i] = null;
                break;
            }
        }
    }
    
    /**
     * gets number of elements in hash table
     * 
     * @return numOfElements
     */
    public int getElements()
    {
        return numOfElements;
    }
    
    /**
     * says if hash table is full or not
     * 
     * @return boolean
     */
    public boolean isFull()
    {
        return numOfElements == hashSize;
    }
    
    /**
     * calculates the load factor
     * 
     * @return the load factor
     */
    public double getLoad()
    {
       return numOfElements / (double) hashSize;
    }
    
    /**
     *
     * @param args
     * @throws ElementNotInHashTableException
     * @throws FullHashTableException
     */
    public static void main(String[] args) throws ElementNotInHashTableException, FullHashTableException
    {     
        ClosedHashing hash = new ClosedHashing(31);
        long startTime = System.nanoTime();
        
        hash.insert("Mary");
        hash.insert("had");
        hash.insert("a");
        hash.insert("little");
        hash.insert("lamb");
        hash.insert("whose");
        hash.insert("fleece");
        hash.insert("was");
        hash.insert("white");
        hash.insert("as");
        hash.insert("snow");
        for(int i = 0;i<hash.hashSize;i++){
            System.out.print(i + ":" + hash.hashTable[i] + "\n" );
        }
        System.out.println();
        System.out.println(hash.search("little"));
        
        startTime = 0;
        hash.search("fleece"); //in table
        System.out.println("Search Time: " + (System.nanoTime() - startTime) + " nanoseconds");
        
        startTime = 0;
        System.out.println(hash.search("goat")); //not in table
        System.out.println("Search Time: " + (System.nanoTime() - startTime) + " nanoseconds");
        
        }
    }