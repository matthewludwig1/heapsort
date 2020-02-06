/*
    Matt Ludwig, Liam Deaton
    2019-04-17
*/

package heapsort;

public class heap {
    int[] unsorted;
    public int[] sort(int[] unsort){
        unsorted = unsort;
        for (int i=unsorted.length-1; i>0; i--){
            heapify(i);
            sendFrontToEnd(i);
        }
    return unsorted;
    }
    
    public void heapify(int end){
        for (int i=0; i<end; i++){
            swapUpwards(i);
        }
    }
    
    public void swapUpwards(int index){
    if (checkUpwards(index)){
        swap(index, parentIndex(index));
        swapUpwards(parentIndex(index));
        }
    }
    
    public int parentIndex(int index){
        if ((int)Math.ceil((index/2)-1) < 0){
            return 0;
        }
        return (int)Math.ceil((index/2)-1);
    }
    
    public boolean checkUpwards(int indexi) {
        
     return booleanCompare(indexi,parentIndex(indexi));    
    }
    
     public boolean booleanCompare(int index1, int index2){         
            if (unsorted[index1] > unsorted[index2]){
                return true;
            } else {
                return false;
            }    
        }
    
    public void swap(int index1, int index2) {
        // might need a temp variable
        int l = unsorted[index1];  // will be fed index1, and index2
        int k = unsorted[index2];
        unsorted[index1] = k;  // sets index 1 to the value k
        unsorted[index2] = l;  // sets index 2 to the value l
    }
    public void sendFrontToEnd(int lastIndex) {
        int i = 0;
        int k = lastIndex;
        swap(i,k);
    }

}
