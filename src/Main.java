import java.util.Arrays;
import mvc.Model;
import mvc.View;
import mvc.Controller;
import methods.FifoPage;
import methods.LruPage;
public class Main {
    public static void main(String[] args) {
        FifoPage fp = new FifoPage();
        LruPage lp = new LruPage();
        Model model = new Model();
        /**
         * Controller will create menu through new View(model)
         * Controller will acquire new model vaules from View
         * Access Model contents through getView().getModel()
         * 
         */
        Controller ctrl = new Controller(model, new View(model));
        model = ctrl.getView().getModel();
        // Acquire Page Fault
        int pf = -1;
        String[] frames = new String[model.getPages().length];
        if (!model.getAlgo()) {
            pf = fp.pageFaults(
                model.getPages(),
                model.getFrameSize()
            );
            frames = fp.getFrames();
        } else if (model.getAlgo()) {
            pf = lp.pageFaults(
                model.getPages(),
                model.getFrameSize()
            );
            frames = lp.getFrames();
        }
        System.out.println("Reference String " + Arrays.toString(model.getPages()));
        System.out.println("Frames " + model.getFrameSize());
        System.out.println("Page Faults " + pf);
        System.out.println("Reference String | Frames");
        for (int i = 0; i < model.getPages().length; i++) {
            System.out.print(model.getPages()[i] + " ");
            System.out.print(frames);
            System.out.println();
        }
        
    }
}
