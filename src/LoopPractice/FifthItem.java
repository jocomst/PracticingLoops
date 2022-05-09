package LoopPractice;
import java.util.ArrayList;

public class FifthItem implements ScannerFactory{

    private ArrayList<String> list = new ArrayList<>();

    public void getFifthItem() {
        while(true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }

        if (list.size() < 5) {
            System.out.println("List is shorter than 5, no fifth element.");
        } else {
            System.out.println("The fifth item in the list is: " + list.get(4));
        }
    }
}
