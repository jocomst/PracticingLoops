package LoopPractice;
import java.util.ArrayList;

public class IndexOfInteger implements ScannerFactory{
    private ArrayList<Integer> list = new ArrayList<>();

    public void addNumbers() {
        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0 || String.valueOf(num).isEmpty()) {
                System.out.println("Done entering integers into the list");
                this.getIndex();
                break;
            }
            this.list.add(num);
        }
    }

    public void getIndex() {
        System.out.println("What number are you looking for in the list?");
        int searchFor = Integer.valueOf(scan.nextLine());

        for (int i = 0; i < this.list.size(); i++) {
            if (searchFor == this.list.get(i)) {
                System.out.println(searchFor + " is at index " + i);
            }
        }
    }

}
