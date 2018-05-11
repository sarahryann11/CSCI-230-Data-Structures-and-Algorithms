package csci230.hwk4;
 
/**
 * Singly LinkedList Data Structure
 * 
 * @author CSCI 230: Data Structures and Algorithms Spring 2017 || Sarah Nicholson
 *
 * @param <AnyType>
 */
public class SinglyLinkedList<AnyType extends Comparable> implements List<AnyType> {
    // instance variables
    private Node<AnyType> headNode = null;
    private int size = 0;

    /**
     * Appends the specified element to the end of this list.
     * 
     * @param t
     */
    public void add(AnyType t) {
        addNode(new Node<AnyType>(t));
    } // end add() method

    /**
     * implementation for public add(AnyType t) method
     * 
     * @param t
     */
    private void addNode(Node<AnyType> t) {
        if (isEmpty()) headNode = t;
        else getNode(size-1).setNextNode(t);

        size++;
    } // end addNote() method

    /**
     * Inserts the specified element at the specified position in this list.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, AnyType t) throws IndexOutOfBoundsException {
    	addNode(index, new Node<AnyType>(t));
    } // end add() method
    
    /*
     * 
     * Implementation for public add(int index, AnyType t) method
     *
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    private void addNode(int index, Node<AnyType> t) throws IndexOutOfBoundsException {
    	/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
        else
        {
            Node<AnyType> currNode = headNode;
            if (index == 0)
            {
                t.setNextNode(headNode);
                headNode = t;
                size++;
            }
            else if (index == size)
                add((AnyType) t);
            else
            {
                t.setNextNode(getNode(index));
                getNode(index - 1).setNextNode((Node<AnyType>) t);
                size++;
            }

        }
    } // end addNode() method
 
    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * 
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, AnyType t) throws IndexOutOfBoundsException {
        setNode(index, new Node<AnyType>(t));
    } // end set() method
    
    /**
     * 
     * Implementation for public set(int index, AnyType t) method
     *
     * @param index
     * @param t
     * @throws IndexOutOfBoundsException
     */
    private void setNode(int index, Node<AnyType> t) throws IndexOutOfBoundsException {
    	/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
        else
        {
            getNode(index).setData(t.getData());

        }
    } // end setNode() method

 
    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public AnyType remove(int index) throws IndexOutOfBoundsException {
    	return removeNode(index).getData();
    } // end remove() method
    
    /**
     *
     * Implementation for public remove(int index) method
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    private Node<AnyType> removeNode(int index) throws IndexOutOfBoundsException {
        /*
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
        else
        {
            Node currNode = getNode(index);
            if (index == 0)
                headNode = currNode.getNextNode();
            else
            {
                getNode(index - 1).setNextNode(currNode.getNextNode());

            }
            size--;
            return currNode;
        }  
    } // end removeNode() method
 
    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public AnyType get(int index) throws IndexOutOfBoundsException {
    	return getNode(index).getData();
    } // end get() method
    
    /**
     *
     * Implementation for public get(int index) method
     * 
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    private Node<AnyType> getNode(int index) throws IndexOutOfBoundsException {
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
        else
        {
            Node<AnyType> currNode = headNode;
            for (int i = 1; i <= index; i++)
                currNode = currNode.getNextNode();
            return currNode;
        }    
    } // end getNode() method
 
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
        return (size == 0) ? true : false;
    } // end isEmpty() method
     
     
    /**
     * Removes all of the elements from this list.
     * 
     */
    public void clear() {
        /**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         */
            size = 0;
            headNode = null;
         
    } // end clear method
     
     
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * -------------------------------------------
         * TODO: You put your test cases here
         * 
         */
         
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        
        //addNode test
        sll.add(new Integer(1));
        sll.add(new Integer(2));
        sll.add(1, new Integer(3));
        sll.add(2, new Integer(4));
        
        for (int i = 0; i < sll.size(); i++) 
        {
            Node<Integer> curr = sll.getNode(i);
            System.out.println(curr.toString());
        }

        //addNode error test
        try
        {
            sll.add(10, new Integer(23));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("addNode error: " + e + "\n");
        }
        
        //setNode test
        sll.set(0, new Integer(6));
        sll.set(1, new Integer(8));
        
        for (int i = 0; i < sll.size(); i++) 
        {
            Node<Integer> curr = sll.getNode(i);
            System.out.println(curr.toString());
        }
        
        //setNode error test
        try
        {
            sll.set(-11, new Integer(23));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("setNode error: " + e + "\n");
        }
        
        //removeNode test
        sll.remove(0);

        for (int i = 0; i < sll.size(); i++) 
        {
			
            Node<Integer> curr = sll.getNode(i);
            System.out.println(curr.toString());
	}

        //removeNode error test
        try
        {
            sll.remove(-11);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("removeNode error: " + e + "\n");
        }
        
        //getNode test
        System.out.println(sll.get(0) + "\n");
        System.out.println(sll.get(1) + "\n");
        System.out.println(sll.get(2) + "\n");
        
        //getNode error test
        try
        {
            Integer err = sll.get(10);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("getNode error: " + e + "\n");
        }
        
        //clear test
        sll.clear();
        if (sll.isEmpty())
            System.out.println("Singly linked list is empty.");
        else
            System.out.println("Singly linked list is not empty.");

    } // end main() method
  
}// end SinglyLinkedList class definition