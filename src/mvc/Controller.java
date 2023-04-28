/**
 * Controller Architecture
 * CLI-Based Controls
 * 
 * @author WorkNicolas
 * @version 2023-04-28
 */
package mvc;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public Model getModel() {
        return model;
    }
    public View getView() {
        return view;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    public void setView(View view) {
        this.view = view;
    }
}
