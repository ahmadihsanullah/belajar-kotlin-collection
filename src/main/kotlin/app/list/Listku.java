package app.list;

import java.util.ArrayList;
import java.util.List;

public class Listku {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.addAll(List.of("ahmad","ihsanullah","rabbani"));

        list.forEach(
                value -> {
                    System.out.println(value);
                }
        );
    }
}
