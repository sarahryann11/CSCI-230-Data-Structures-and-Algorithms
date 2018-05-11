package csci230.hwk7;

/**
 * Utilities class that will sort the elements of a list.
 *
 * The sorting algorithms supported in this class are:
 *	1. selection sort (increasing order)
 *	2. bubble sort (increasing order)
 *	3. insertion sort (increasing order)
 *  4. heap sort (increasing and decreasing order)
 * 
 * @author CSCI 230: Data Structures and Algorithms Spring 2017 || Sarah Nicholson
 *
 */
public class Utils {
	
	/**
	 * 
	 */
	private Utils() {
		
	} // end private constructor
	
	/**
	 * 
	 * @param list
	 */
	public static <AnyType extends Comparable> void selectionSort( List<AnyType> list ) throws IndexOutOfBoundsException {
		
		int min = 0;
		
		for ( int i=0; i< list.size()-1; i++ ) {
			
			min = i;
			
			for ( int j=i+1; j<list.size(); j++ ) {
				
				if ( list.get( j ).compareTo( list.get( min ) ) < 0 ) {
					
					min = j;
					
				}
				
			}
			
			list.swap( i, min );
			
		}
		
	} // end selectionSort() method
	
	/**
	 * 
	 * @param list
	 */
	public static <AnyType extends Comparable> void bubbleSort( List<AnyType> list ) throws IndexOutOfBoundsException {
		
		for ( int i=0; i<list.size()-1; i++ ) {
			
			for ( int j=0; j<list.size()-1-i; j++ ) {
				
				if (  list.get( j+1 ).compareTo( list.get( j ) ) < 0 ) {
					
					list.swap( j, j+1 );
					
				}
				
			}
			
		}
		
	} // end bubbleSort() method
	
	/**
	 * 
	 * @param list
	 */
	public static <AnyType extends Comparable> void insertionSort( List<AnyType> list ) throws IndexOutOfBoundsException {
		
		AnyType v = null;
		
		int j = 0;
		
		for ( int i=1; i< list.size(); i++ ) {
			
			v = list.get( i );
			
			j = i - 1;
			
			while( j >= 0 && ( list.get( j ).compareTo( v ) > 0 ) ) {
				
				list.set( j+1, list.get( j ) );
				j--;
				
			}
			
			list.set( j+1, v );
			
		}
		
		
	} // end insertionSort() method
	
	/**
	 * 
	 * @param list
	 * @throws IndexOutOfBoundsException
	 */
	public static <AnyType extends Comparable> void maxHeapify( List<AnyType> list ) throws IndexOutOfBoundsException {
		
		/*
		 * TODO:
		 * ---------------------------------------------
		 * Implement max heapify algorithm as
		 * described in class and in supplemental 
		 * course textbook. The pseudo-code for this 
		 * algorithm can also be found in 
		 * the content section on OAKS.
		 * 
		 */
                
                if (list.size() <= 0)
                    throw new IndexOutOfBoundsException();
                
                //i is the parent of the last item(s)
		for(int i = (int)Math.floor((list.size() - 2) / 2.0); i >= 0; i--)
                {
                    int parent = i;
                    AnyType value = list.get(parent);
                    boolean isHeap = false;
                    while (!isHeap && (2 * parent + 2 <= list.size()))
                    {
                        int child = 2 * parent + 1;
                        //there're two child nodes
                        if (child + 1 < list.size())
                            if (list.get(child).compareTo(list.get(child + 1)) < 0)
                                child += 1;
                        
                        if (value.compareTo(list.get(child)) >= 0)
                            isHeap = true;
                        else
                        {
                            //swap parent and largest child node
                            list.swap(parent, child);
                            parent = child;
                        }
                    }
                }	
	} // end maxHeapify() method
	
	
	/**
	 * 
	 * @param list
	 * @throws IndexOutOfBoundsException
	 */
	public static <AnyType extends Comparable> void minHeapify( List<AnyType> list ) throws IndexOutOfBoundsException {
		
		/*
		 * TODO:
		 * ---------------------------------------------
		 * Implement min heapify algorithm as
		 * described in class and in the supplemental
		 * course textbook. The pseudo-code for this 
		 * algorithm can also be found in 
		 * the content section on OAKS.
		 * 
		 */
		                
                if (list.size() <= 0)
                    throw new IndexOutOfBoundsException();
                
                //i is the parent of last item(s)
		for(int i = (int)Math.floor((list.size() - 2) / 2.0); i >= 0; i--)
                {
                    int parent = i;
                    AnyType value = list.get(parent);
                    boolean isHeap = false;
                    while (!isHeap && (2 * parent + 2 <= list.size()))
                    {
                        int child = 2 * parent + 1;
                        //there're two child nodes
                        if (child + 1 < list.size())
                            if (list.get(child).compareTo(list.get(child + 1)) >= 0)
                                child += 1;
                        
                        if (value.compareTo(list.get(child)) < 0)
                            isHeap = true;
                        
                        else
                        {
                            //swap parent and child
                            list.swap(parent, child);
                            parent = child;
                        }
                    }
                }	
	} // end minHeapify() method
	
	/**
	 * 
	 * @param sorted_list
	 * @param list
	 * @param increasing
	 * @throws IndexOutOfBoundsException
	 */
	public static <AnyType extends Comparable> void heapSort( List<AnyType> sorted_list, List<AnyType> list, Boolean increasing ) throws IndexOutOfBoundsException {
		
		/*
		 * TODO:
		 * ---------------------------------------------
		 * Implement heap sort algorithm as
		 * described in class and in the supplemental
		 * course textbook. The pseudo-code for this 
		 * algorithm can also be found in 
		 * the content section on OAKS.
		 * 
		 */
		                
                if (list.size() < 1)
                    throw new IndexOutOfBoundsException();
                
                if (increasing == false)
                {
                    while (list.size() > 0)
                    {
                        maxHeapify(list);
                        sorted_list.add(list.remove(0));
                    }
                }
                
                else
                {
                    while (list.size() > 0)
                    {
                        minHeapify(list);
                        sorted_list.add(list.remove(0));
                    }
                }

	} // end heapSort() method
} // end Utils class definition
