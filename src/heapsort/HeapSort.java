/*
    Matt Ludwig
    2019-04-23
    
 */

package heapsort;

/**
 *
 * @author malud0519
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mr Kaunes code goes here
        int[] unsorted = {1,3,6,3,5,2,9};  
        heap hs = new heap();
        int[] sorted = hs.sort(unsorted);
        System.out.println(sorted);
    }
    
}
