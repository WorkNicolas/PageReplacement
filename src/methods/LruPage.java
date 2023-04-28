/**
 * Least Recently Used Page Replacement Algorithm
 * 
 */

package methods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class LruPage {
    private String[] frames;
    public int pageFaults(int pages[], int frameSize) {
        //current pages
        HashSet<Integer> hs = new HashSet<>(frameSize);

        /**
         * each value of the hashmap corresponds to the
         * value of the reference string itself and determines
         * the times that it was used
         */
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        
        //stores frames
        frames = new String[pages.length];

        int pageFault = 0;
        //LRU page replacement
        for (int i = 0; i < pages.length; i++) {
            //keep adding pages until frameSize is reached
            //otherwise remove the least recently used frame
            if (hs.size() < frameSize) {
                if (!hs.contains(pages[i])) {
                    hs.add(pages[i]);
                    pageFault++;
                }
                indexMap.put(pages[i],i);
            } else {
                if (!hs.contains(pages[i])) {
                    int lru = Integer.MAX_VALUE;
                    int val = Integer.MIN_VALUE;
                    Iterator<Integer> itr = hs.iterator();
                    while (itr.hasNext()) {
                        int temp = itr.next();
                        if (indexMap.get(temp) < lru) {
                            lru = indexMap.get(temp);
                            val = temp;
                        }
                    }
                    hs.remove(val);
                    indexMap.remove(val);
                    hs.add(pages[i]);
                    pageFault++;
                }
                indexMap.put(pages[i],i);
            }
            frames[i] = hs.toString();
        }
        return pageFault;
    }
    public String[] getFrames() {
        return frames;
    }
}
