import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        double avg = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.printf("Average value of even elements from list is: %.2f", avg);
    }
}