import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }
        System.out.println("Задача 2");

        List<Integer> nums2 = new ArrayList<>(List.of(1, 9, 2, 3, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> result = new TreeSet<>(nums2);
        System.out.println(result);

        System.out.println("Задача 3");

        List<String> nums3 = new ArrayList<>(List.of("привет", "пока", "привет", "здравствуй", "пока"));
        Set<String> result1 = new HashSet<>(nums3);
        System.out.println(result1);

        System.out.println("Задача 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> result2 = new HashMap<>();

        for (String string : strings) {
            if (result2.containsKey(string)) {
                result2.put(string, result2.get(string) + 1);

            } else {
                result2.put(string, 1);
            }
        }
        System.out.println(result2.values());

        Set<Integer> result3 = new HashSet<>(result2.values());

        System.out.println(result3);

    }


}





