package LoopPractice;

public class App {
    public static void main(String[] args) {
        FifthItem fifth = new FifthItem();
        fifth.getFifthItem();
        HowLarge largest = new HowLarge();
        largest.listLength();
        LastItem last = new LastItem();
        last.getLastItem();
        IndexOfInteger getIndex = new IndexOfInteger();
        getIndex.addNumbers();
        SumOfList sumOf = new SumOfList();
        sumOf.getSum();
    }
}
