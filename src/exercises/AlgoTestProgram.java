package exercises;

import modules.IModule;
import modules.RModule;

public class AlgoTestProgram {

    public static void main(String[] args) {
        int[] list = {2, 3, 1, 5, 8, 6};
        print(list);
        IModule.linearSearch(list, 3);
        System.out.println("Linear search method:");
        print(list);

        System.out.println("Location of 3 : " + IModule.linearSearch(list, 3));
        System.out.println("Location of 7 : " + IModule.linearSearch(list, 7));
        System.out.println("Location of 8 : " + IModule.linearSearch(list, 8));

    }

    public static void print(int[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        //use a for-each loop to print out list
        for(int item : list) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println();
    }
}
