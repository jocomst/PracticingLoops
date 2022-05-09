package LoopPractice;
import java.util.ArrayList;

public class LastItem implements ScannerFactory{
    private ArrayList<String> list = new ArrayList<>();

    public void getLastItem() {

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            this.list.add(input);
        }
        if (this.list.size() != 0) {
            System.out.println("The last item in the list is: " + this.list.get(this.list.size() - 1));
        }
    }
}
