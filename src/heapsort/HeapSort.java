/*
    Matt Ludwig, Liam Deaton
    2019-04-23
    This class builds the heap object, which sorts an array of numbers
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
        
        int[] unsorted = {1,3,6,3,5,2,9,11,9,10};
        heap hs = new heap();
        int[] sorted = hs.sort(unsorted);
        
        for (int i=0; i<sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
    
}
