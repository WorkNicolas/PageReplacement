package mvc;

import java.util.Scanner;
import java.util.Arrays;

public class View {
    private Model model;

    /**
     * Menu
     * 
     * @param model
     */
    public View(Model model) {
        this.model = model;
        //Only one Scanner to prevent java.util.NoSuchElementException
        Scanner sc = new Scanner(System.in);
        //Reference String
        model.setPages(inputReference(sc));
        System.out.println("Array Stored " + Arrays.toString(model.getPages()));
        //Frame Size
        model.setFrameSize(inputFrameSize(sc));
        System.out.println("Integer stored " + model.getFrameSize());
        //User input for algorithm used
        model.setAlgo(inputAlgo(sc));
        sc.close();
    }

    /**
     * Allows user to create a reference string
     * e.g. 1 2 3 4 5 6 7 8 9
     * 
     * @param sc
     * @return model.setPages() setting
     */
    private int[] inputReference(Scanner sc) {
        int[] value = null;
        
        while (true) {
            try {
                System.out.print("Input Reference String: ");
                String scan = sc.nextLine();
                String[] in = scan.split(" ");
                value = new int[in.length];
                for (int i = 0; i < in.length; i++) {
                    value[i] = Integer.valueOf(in[i]);
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid String format");
            }
        }
        
        return value;
    }

    /**
     * frame size
     * 
     * @param sc
     * @return model.setFrameSize() setting
     */
    private int inputFrameSize(Scanner sc) {
        int value = -1;
        
        while (true) {
            try {
                System.out.print("Input Frame Size: ");
                if (sc.hasNextInt()) {
                    value = sc.nextInt();
                }
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid frame size format");
            }
        }
        
        return value;
    }

    /**
     * true - LRU
     * false - FIFO
     * 
     * @param sc
     * @return model.setAlgo setting
     */
    private boolean inputAlgo(Scanner sc) {
        boolean exit = false;
        boolean algo = false;
        
        while (!exit) {
            try {
                int in = -1;
                if (sc.hasNextInt()) {
                    in = sc.nextInt();
                }
                switch (in) {
                    case 1: //FIFO
                        algo = false;
                        exit = true;
                        break;
                    case 2: //LRU
                        algo = true;
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid option format");
            }
        }
        
        return algo;
    }
}
