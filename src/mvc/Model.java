package mvc;
import java.util.Queue;
import java.util.LinkedList;
import methods.FifoPage;
import methods.LruPage;

public class Model {
    private int[] pages;
    private int frameSize;
    private Queue<Integer> pq = new LinkedList<>();
    private boolean algo = false; //false is FIFO, true is LRU

    private FifoPage fp = new FifoPage();
    private LruPage lp = new LruPage();
    
    public Model() {
        
    }

    public void setPages(int[] pages) {
        this.pages = pages;
    }
    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }
    public void setFifoPage(FifoPage fp) {
        this.fp = fp;
    }
    public void setLruPage(LruPage lp) {
        this.lp= lp;
    }
    public void setQ(Queue<Integer> pq) {
        this.pq = pq;
    }
    public void setAlgo(Boolean algo) {
        this.algo = algo;
    }

    public int[] getPages() {
        return pages;
    }
    public int getFrameSize() {
        return frameSize;
    }
    public Queue<Integer> getQ() {
        return pq;
    }
    public FifoPage getFifoPage() {
        return fp;
    }
    public LruPage getLruPage() {
        return lp;
    }
    public Boolean getAlgo() {
        return algo;
    }
}
