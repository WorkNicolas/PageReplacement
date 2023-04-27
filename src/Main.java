import mvc.Model;
import mvc.View;
import mvc.Controller;
public class Main {
    public static void Main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller ctrl = new Controller(model, view);
        
    }
}
