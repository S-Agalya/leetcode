//using linkedlist class

import java.util.LinkedList;

class Linkedlistdemo {
    public static void main(String[] args){
        LinkedList<Integer> numbers=new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.addFirst(0);
        numbers.addLast(8);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
    }
}