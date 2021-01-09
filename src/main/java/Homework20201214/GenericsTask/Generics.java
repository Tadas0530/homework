package Homework20201214.GenericsTask;

import java.util.ArrayList;
import java.util.List;

public class Generics<T extends TwoItems> {
    private static final List<TwoItems> valueList = new ArrayList<>();

    public static void lastValue(TwoItems values) {
        valueList.add(values);
        System.out.println(valueList.get(valueList.size()-1).getEntry2());
    }
}
