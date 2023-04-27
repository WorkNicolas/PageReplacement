package mvc;

import java.util.Scanner;

public class View {

    /**
     * Menu
     * 
     * @param model
     */
    public View(Model model) {
        model.setPages(input());
    }

    /**
     * Allows user to create a reference string
     * e.g. 1 2 3 4 5 6 7 8 9
     * 
     * @return
     */
    private int[] input() {
        System.out.print("Reference String: ");
        int[] value = null;
        while (true) {
            try {
                String scan = new Scanner(System.in).nextLine();
                String[] in = scan.split(" ");
                for (int i = 0; i < in.length; i++) {
                    Integer.valueOf(in[i]);
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid input");
            }
        } 
        return value;
    }
}
