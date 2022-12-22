import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Integer> intList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> listOfNoZeroNumber = new ArrayList<>();
        List<Integer> listOfEvenNumbers = new ArrayList<>();
        System.out.println("Before");
        intList.forEach(x -> System.out.print(x + " "));
        System.out.println("");
        //Отфильтруйте положительные числа.
        for(int i = 0; i < intList.size(); i++) {
            if (intList.get(i) <= 0) {
                listOfNoZeroNumber.add(i);
            }
        }
        for(int i = 0; i < listOfNoZeroNumber.size(); i++) {
            intList.remove(listOfNoZeroNumber.get(i)-i);
        }
        //Найдите среди этих положительных чисел четные.
        for(int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % 2 != 0) {
                listOfEvenNumbers.add(i);
            }
        }
        for(int i = 0; i < listOfEvenNumbers.size(); i++) {
            intList.remove(listOfEvenNumbers.get(i)-i);
        }
        //Отсортируйте отфильтрованные числа в порядке возрастания.
        PersonComparator comp = new PersonComparator();
        intList.sort(comp);

        System.out.println("After");
        intList.forEach(x -> System.out.print(x + " "));
    }


}