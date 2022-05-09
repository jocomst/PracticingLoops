package LoopPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList implements ScannerFactory{
    private ArrayList<Integer> list = new ArrayList<>();

    public void getSum() {
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == 0 || String.valueOf(input).isEmpty()) {
                break;
            }
            this.list.add(input);
        }

        String printThis = "";
        int sum = 0;
        for (int i = 0; i < this.list.size(); i++) {
            sum += this.list.get(i);
            if (i == this.list.size() - 1) {
                printThis += " and " + this.list.get(i) + "were the items in the list. The sum of that list is: \n" + sum;
            } else {
                printThis += this.list.get(i) + ", ";
            }
        }

        System.out.println(printThis);

    }
}
