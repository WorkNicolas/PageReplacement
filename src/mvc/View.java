package mvc;

import java.util.Scanner;

public class View {
    public View() {
        System.out.println("");
    }

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
