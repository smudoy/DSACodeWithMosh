import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);

        System.out.println(result);
    }
}
