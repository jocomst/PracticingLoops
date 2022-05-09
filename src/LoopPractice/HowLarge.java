package LoopPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge implements ScannerFactory{
    private ArrayList<String> list = new ArrayList<>();

    public void listLength() {
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        if (list.size() == 0) {
            System.out.println("No input recorded");
        } else {
            System.out.println("The total amount of items in the list was: " + list.size());
        }
    }
}
