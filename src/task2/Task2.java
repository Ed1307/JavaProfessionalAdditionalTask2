package task2;

public class Task2 {

    public static void main(String[] args) {
        LinkedList2 ll2 = new LinkedList2();
        ll2.add(1);
        ll2.addFirst(0);
        ll2.addLast(2);
        ll2.removeFirst();
        ll2.removeLast();
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());
        System.out.println(ll2.size());
        System.out.println(ll2);
    }

}
