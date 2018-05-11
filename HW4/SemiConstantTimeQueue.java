package csci230.hwk4;

import java.util.NoSuchElementException;

/**
 * A semi-constant time FIFO queue. The time complexity for 
 * the interface methods are:
 * ----------------------------------
 * 1) add: O(1) - not considering capacity resize operations
 * 2) remove: O(n) - not considering capacity resize operations
 * 3) peek: O(1)
 * 
 * Please note: the above time complexities do not factor in
 * capacity resize (grow and shrink) operations. Even though
 * capacity resize operations will occur, for this assignment 
 * you may assume the are negligible.
 * 
 * This data structure was discussed in class along with the 
 * operations, please review your notes.
 * 
 * @author CSCI 230: Data Structures and Algorithms Spring 2017 || Sarah Nicholson
 *
 * @param <AnyType>
 */
public class SemiConstantTimeQueue<AnyType extends Comparable> implements Queue<AnyType> {
	
	/**
	 * private instance variables
	 */
	private ArrayList<AnyType> list = new ArrayList<AnyType>();


	/**
	 * Inserts the specified element at the end of the queue in 
	 * constant time O(1)
	 * 
	 * @param t element to add
	 * @throws NullPointerException- if the specified element is null 
	 *                               (queue does not permit null elements)
	 */
	public void add(AnyType t) throws NullPointerException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your add solution must be a constant 
         * time O(1) operation (not considering capacity 
         * resize operations)
         * 
         */
	
            if (t == null)
                throw new NullPointerException();
            else
		list.add(t);
		
	} // end add() method

	/**
	 * Retrieves and removes the head of the queue in
	 * linear time O(n).
	 * 
	 * Hint: shift operations will make this a linear time
	 * operation.
	 * 
	 * @return the head of the queue
	 * @throws NoSuchElementException - if this queue is empty
	 */
	public AnyType remove() throws NoSuchElementException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your push solution must be a linear 
         * time O(n) operation. See hint above.
         * 
         *
         */
            AnyType r = null;
            if (list.isEmpty())
                throw new NoSuchElementException();
            else
            {
                r = list.remove(0);
            }
            return r;
		
	} // end remove() method

	/**
	 * Retrieves, but does not remove, the head of the queue, 
	 * or returns null if this queue is empty.
	 * 
	 * @return the head of this queue, or null if this queue is empty
	 */
	public AnyType peek() {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your add solution must be a constant 
         * time O(1) operation 
         * 
         */
                
	    if (list.isEmpty())
                return null;
            else
            {
                AnyType peeked = list.get(0);
                return peeked;
            }
		
	} // end peek() method
	
//        public String toString()
//        {
//            String s = new String();
//            for (int i = 0; i < list.size(); i++)
//                s += list.get(i).toString() + " ";
//            return s;
//        }
        
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
            //A toString method is used to run the main, but is commented out.
		
            SemiConstantTimeQueue<Integer> queue = new SemiConstantTimeQueue<Integer>();
            
            System.out.println("Adding from empty queue: ");
            try
            {
                queue.add(null);
            }
            catch (NullPointerException e)
            {
                System.out.println("add error: " + e);
            }
            
            System.out.println("Removing from empty stack: ");
            try
            {
                queue.remove();
            }
            catch (NoSuchElementException e)
            {
                System.out.println("remove error: " + e);
            }
            
            queue.add(1);
            System.out.println("Adding 1: " + queue);
            queue.add(2);
            System.out.println("Adding 2: " + queue);
            queue.add(3);
            System.out.println("Adding 3: " + queue);
            queue.add(4);
            System.out.println("Adding 4: " + queue);
            queue.add(5);
            System.out.println("Adding 5: " + queue);
                        
            System.out.println("Peeking: " + queue.peek());
            
            System.out.println("Removing: " + queue.remove());
            
            System.out.println(queue);
            
            
            System.out.println("Removing: " + queue.remove());
            System.out.println(queue);
            System.out.println("Removing: " + queue.remove());
            System.out.println(queue);
            System.out.println("Removing: " + queue.remove());
            System.out.println(queue);
            System.out.println("Removing: " + queue.remove());
           
            System.out.println(queue);
            System.out.println("Removing from empty stack: ");
            try
            {
                queue.remove();
            }
            catch (NoSuchElementException e)
            {
                System.out.println("remove error: " + e);
            }
            System.out.println(queue);
            
	} // end main() method

} // end ConstantTimeQueue class definition
