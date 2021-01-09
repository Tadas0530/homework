package Homework20201214.GenericsTask;

public class Main {
    public static void main(String[] args) {
        TwoItems<Integer> intValues = new TwoItems<>(70, 80);
        System.out.println(intValues.toString());

        TwoItems<String> stringValues = new TwoItems<>("Trying out", "Generics");
        System.out.println(stringValues.toString());

        Generics.lastValue(stringValues);
        Generics.lastValue(intValues);
    }
}
