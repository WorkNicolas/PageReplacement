/**
 * First-In-First-Out Page Replacement Algorithm
 * 
 */
package methods;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class FifoPage {
    public int pageFaults(int pages[], int frameSize) {
        //current pages
        HashSet<Integer> hs = new HashSet<>(frameSize);

        //stores pages using FIFO data structure
        Queue<Integer> indexQ = new LinkedList<>();

        int pageFault = 0;
        //FIFO page replacement
        for (int i = 0; i < pages.length; i++) {
            //keep adding pages until frameSize is reached
            //otherwise remove the first page that came in (FIFO)
            if (hs.size() < frameSize) {
                if (!hs.contains(pages[i])) {
                    hs.add(pages[i]);
                    pageFault++;
                    indexQ.add(pages[i]);
                }
            } else {
                if (!hs.contains(pages[i])) {
                    int val = indexQ.peek();
                    indexQ.poll();
                    hs.remove(val);
                    hs.add(pages[i]);
                    indexQ.add(pages[i]);
                    pageFault++;
                }
            }
        }
        return pageFault;
    }
}