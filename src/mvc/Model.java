package mvc;
import java.util.Queue;
import java.util.LinkedList;

public class Model {
    private int[] pages;
    private Queue<Integer> pq = new LinkedList<>();

    Model() {
        
    }

    public void setPages(int[] pages) {
        this.pages = pages;
    }
    public void setQ(Queue<Integer> pq) {
        this.pq = pq;
    }

    public int[] getPages() {
        return pages;
    }
    public Queue<Integer> getQ() {
        return pq;
    }
}
