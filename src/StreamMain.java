import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Before");
        intList.forEach(x -> System.out.print(x + " "));
        System.out.println("");
        System.out.println("After");
        intList.stream()
                .filter(x -> x >= 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
        // 1 Отфильтруйте положительные числа.
        // 2 Найдите среди этих положительных чисел четные.
        // 3 Отсортируйте отфильтрованные числа в порядке возрастания.
        //  4 Выведите результат на экран.
    }
}
