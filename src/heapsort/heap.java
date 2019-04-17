/*
    Matt Ludwig
    2019-04-17
    This holds the swap method and boolean condition to exchange elements in the array
 */

package heapsort;

/**
 *
 * @author malud0519
 */
public class heap {
    int [] unsorted = {5,1,6,7,56,88};
    
    
    public void swap(int index1, int index2) {
        // might need a temp variable
        int l = unsorted[index1];  // will be fed index1, and index2
        int k = unsorted[index2];
        unsorted[index1] = k;  // sets index 1 to the value k
        unsorted[index2] = l;  // sets index 2 to the value l
    }
}
