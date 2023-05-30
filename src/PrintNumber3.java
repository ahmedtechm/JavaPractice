import java.util.ArrayList;

public class PrintNumber3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
