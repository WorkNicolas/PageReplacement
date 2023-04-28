import mvc.Model;
import mvc.View;
import mvc.Controller;
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller ctrl = new Controller(model, new View(model));
        
    }
}
