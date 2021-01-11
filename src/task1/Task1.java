package task1;

public class Task1 {

    public static void main(String[] args) {
        ArrayList2 al2 = new ArrayList2();
        al2.add(1);
        al2.add(10, 2);
        System.out.println(al2.get(0));
        System.out.println(al2.contains(1));
        //al2.clear();
        al2.remove(0);
        System.out.println(al2.size());
        System.out.println(al2);
    }

}
