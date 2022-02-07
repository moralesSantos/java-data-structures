import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");

        System.out.println(colors.size()); //size or length of arraylist
        System.out.println(colors.contains("blue")); // check if it contains that color
        System.out.println(colors);

        System.out.println(colors.get(0));



    }
}
