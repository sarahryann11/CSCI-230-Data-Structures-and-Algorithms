package csci230.hwk4;

/**
 * ArrayList Data Structure
 * 
 * @author CSCI 230: Data Structures and Algorithms Spring 2017 | Sarah Nicholson
 *
 * @param <AnyType>
 */
public class ArrayList<AnyType extends Comparable> implements List<AnyType> {
     
    // instance variables
    private Object[] array;
    private int size = 0;
    private final static int INITIAL_CAPACITY = 10;
    private int capacity = INITIAL_CAPACITY;
    
    /**
     * Constructs an empty list with an initial capacity
     * (for this assignment initial capacity is 10 - see 
     * constant instance variable)
     * 
     */
    public ArrayList() {
    	
    	array = new Object[ INITIAL_CAPACITY ];
    	
    } // end constructor
 
    /**
     * Appends the specified element to the end of this list.
     * 
     * @param t
     */
    public void add( AnyType t) {
         
    	if ( size >= capacity )
    		grow();
    	
    	array[size]=t;
        size++;
         
    } // end add() method
 
    /**
     * Inserts the specified element at the specified position in this list.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, AnyType t) throws IndexOutOfBoundsException {
         
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
    	
    	if (index < 0 || index > capacity)
            throw new IndexOutOfBoundsException("Index is invalid");
        else
        {

            if (size >= capacity) 
                grow();
            for (int i = size + 1; i > index; i--) 
            {
                array[i] = array[i - 1];
            }
            array[index] = t;
            size++;
        }
    	
    } // end add() method
 
    /**
     * Replaces the element at the specified position in this list with the specified element.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, AnyType t) throws IndexOutOfBoundsException {
         
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        
        if (index < 0 || index >= capacity)
            throw new IndexOutOfBoundsException("Index is invalid");
        else
        {
            array[index] = t;
        }
    } // end set() method
 
    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    @SuppressWarnings("unchecked")
	public AnyType remove( int index ) throws IndexOutOfBoundsException {
         
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Requirement - you must use loops (i.e. may not use
         * System.arraycopy, or any other array copy operation 
         * available in the Java API) to perform left or right
         * shift operations
         * 
         */
         
    	if (index < 0 || index >= capacity)
            throw new IndexOutOfBoundsException("Index is invalid");
        else
        {
            Object elementRemoved = array[index];
            for (int i = index; i < size; i++)
                array[i] = array[i + 1];
            size--;

            return (AnyType) elementRemoved; 
        }
         
    } // end remove() method
 
    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    @SuppressWarnings("unchecked")
	public AnyType get(int index) throws IndexOutOfBoundsException {
         
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        
        if (index < 0 || index >= capacity)
            throw new IndexOutOfBoundsException("Index is invalid");
        else
        {
            return (AnyType) array[index];
        }
         
    } // end get() method
 
    /**
     * Returns the number of elements in this list. 
     * 
     * @return
     */
    public int size() {
         
        return size;
         
    } // end size() method
 
    /**
     * Returns true if this list contains no elements.
     * 
     * @return
     */
    public Boolean isEmpty() {
         
        return ( size == 0 );
         
    } // end isEmpty() method
     
     
    /**
     * Removes all of the elements from this list.
     * and the initial capacity is set back to 10
     * 
     */
    public void clear() {
         
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
    	
        array = new Object[INITIAL_CAPACITY];
        size = 0;
        capacity = 10;         
        
    } // end clear method
    
    /**
     * Double the capacity of the array
     * 
     */
    private void grow() {
    	
    	/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Requirement - you must use loops (i.e. may not use
         * System.arraycopy, or any other array copy operation 
         * available in the Java API)
         * 
         */
        
        Object[] newArr = new Object[capacity * 2];
        for (int i = 0; i < array.length; i++)
            newArr[i] = array[i];
        array = newArr;
        capacity = capacity * 2;
        
    } // end grow() method
    
    
    /**
     * Half the capacity of the array
     * 
     */
    private void shrink() {
    	
    	/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Requirement - you must use loops (i.e. may not use
         * System.arraycopy, or any other array copy operation 
         * available in the Java API)
         * 
         */
    	
        Object[] newArr = new Object[capacity / 2];
        for (int i = 0; i < newArr.length; ++i)
            newArr[i] = array[i];
        array = newArr;
        capacity = capacity / 2;
        
    } // end shrink() method

    /**
     * 
     * @param args
     */
    public static void main( String[] args ) {
         
        /**
         * -------------------------------------------
         * TODO: Put your test cases here
         * 
         */
        
        ArrayList arr = new ArrayList();
        
        //add method tests
        arr.add(0, 1);
        arr.add(4, 2);
        arr.add(9, 3);
        
        System.out.println("Size: " + arr.size());
                
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }

        try
        {
            arr.add(-1, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("add error: " + e + "\n");
        }
        
        //set method tests
        arr.set(0, 3);
        arr.set(4, 6);
        arr.set(9, 9);
        
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }
        
        try
        {
            arr.set(-1, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("set error: " + e + "\n");
        }
        
        
        //remove method tests
        arr.remove(0);
        System.out.println("Size: " + arr.size());
        
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }
        
        try
        {
            arr.remove(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("remove error: " + e + "\n");
        }
          
        //get method tests
        arr.add(0, 1);
        arr.add(1, 2);
        arr.add(2, 3);
        System.out.println(arr.get(0) + "\n");
        System.out.println(arr.get(1) + "\n");
        System.out.println(arr.get(2) + "\n");
        
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }
        
        try
        {
            arr.get(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("get error: " + e + "\n");
        }
        
        //clear method tests
        arr.clear();
        System.out.println("Size: " + arr.size());
        System.out.println("Capacity: " + arr.capacity);
        
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }
                
        //grow method tests
        arr.grow();
        arr.add(3,3);
        arr.add(15, 15);
        arr.add(11, 11);
        System.out.println(arr.capacity);
        
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }
        
        System.out.println();
        
        //shrink method tests
        arr.remove(11);
        arr.remove(15);
        arr.shrink();
        System.out.println("Shrink: ");
        for (int i = 0; i < arr.capacity; i++)
        {
            System.out.println(arr.get(i));
        }

    } // end main() method
  
} // end ArrayList class definition