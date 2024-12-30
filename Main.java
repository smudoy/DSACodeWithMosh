import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(30);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(50);
        list.addLast(70);
        list.addFirst(585);
        System.out.println(list.indexOf(30));
        System.out.println(list.contains(40));
        list.removeFirst();
        System.out.println(list.indexOf(10));
        list.removeLast();
        list.removeFirst();
        System.out.println(list.indexOf(585));
        System.out.println(list.size());

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.reverse();
        array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromTheEnd(9));
    }
}
