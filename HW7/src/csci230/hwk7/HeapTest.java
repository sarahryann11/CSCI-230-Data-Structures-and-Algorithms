package csci230.hwk7;

public class HeapTest {

	public static void main(String[] args) {
		try
                {
                    //min heap
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    ArrayList<Integer> sorted_list = new ArrayList<Integer>();

                    list.add( 5 );
                    list.add( 16 );
                    list.add( 8 );
                    list.add( 14 );
                    list.add( 20 );
                    list.add( 1 );
                    list.add( 26 );

                    Utils.heapSort( sorted_list, list, true );
                    System.out.println ( sorted_list );

                    //max heap
                    SinglyLinkedList<Integer> slist = new SinglyLinkedList<Integer>();
                    SinglyLinkedList<Integer> sorted_slist = new SinglyLinkedList<Integer>();

                    slist.add( 5 );
                    slist.add( 16 );
                    slist.add( 8 );
                    slist.add( 14 );
                    slist.add( 20 );
                    slist.add( 1 );
                    slist.add( 26 );

                    Utils.heapSort(sorted_slist, slist, false );
                    System.out.println( sorted_slist );

                    //min heap
                    list = new ArrayList<Integer>();
                    sorted_list = new ArrayList<Integer>();
                    list.add(11);
                    list.add(23);
                    list.add(5);
                    list.add(9);
                    list.add(7);
                    list.add(7);
                    list.add(1);
                    list.add(30);

                    Utils.heapSort(sorted_list, list, true);
                    System.out.println (sorted_list);

                    //max heap
                    slist = new SinglyLinkedList<Integer>();
                    sorted_slist = new SinglyLinkedList<Integer>();
                    slist.add(11);
                    slist.add(23);
                    slist.add(5);
                    slist.add(9);
                    slist.add(7);
                    slist.add(7);
                    slist.add(1);
                    slist.add(30);

                    Utils.heapSort(sorted_slist, slist, false);
                    System.out.println (sorted_slist);

                    //min heap
                    list = new ArrayList<Integer>();
                    sorted_list = new ArrayList<Integer>();
                    for(int i = 0; i < 50; i++)
                        list.add((int)(Math.random() * 50));
                    Utils.heapSort(sorted_list, list, true);
                    System.out.println(sorted_list);

                    //max heap
                    slist = new SinglyLinkedList<Integer>();
                    sorted_slist = new SinglyLinkedList<Integer>();
                    for(int i = 0; i < 50; i++)
                        slist.add((int)(Math.random() * 50));
                    Utils.heapSort(sorted_slist, slist, false);
                    System.out.println(sorted_slist);

                    //max heap
                    slist = new SinglyLinkedList<Integer>();
                    sorted_slist = new SinglyLinkedList<Integer>();
                    slist.add(5);
                    slist.add(3);
                    slist.add(17);
                    slist.add(10);
                    slist.add(84);
                    slist.add(19);
                    slist.add(6);
                    slist.add(22);
                    slist.add(9);
                    Utils.heapSort(sorted_slist, slist, false);
                    System.out.println(sorted_slist);

                    //max heap
                    slist = new SinglyLinkedList<Integer>();
                    sorted_slist = new SinglyLinkedList<Integer>();
                    slist.add(1);
                    slist.add(2);
                    slist.add(3);
                    slist.add(4);
                    slist.add(5);
                    slist.add(6);
                    slist.add(7);
                    slist.add(8);
                    slist.add(9);
                    slist.add(10);
                    slist.add(14);
                    slist.add(16);
                    Utils.heapSort(sorted_slist, slist, false);
                    System.out.println(sorted_slist);

                    //check for indexoutofbounds error catch
                    slist = new SinglyLinkedList<Integer>();
                    sorted_slist = new SinglyLinkedList<Integer>();
                    Utils.heapSort(sorted_slist, slist, false);
                    System.out.println(sorted_slist);
                }
                catch (IndexOutOfBoundsException ioobe)
                {
                    System.out.println("error" + ioobe);
                }
	}
}
