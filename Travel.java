import java.util.*;

public class Travel {

    public static int chooseBestSum(int t, int k, List<Integer> ls) {
        // Запускаем рекурсивный поиск с начальными параметрами
        return findBestSum(ls, k, t, 0, 0);
    }

    private static int findBestSum(List<Integer> ls, int k, int t, int start, int currentSum) {
        if (k == 0) {
            return currentSum <= t ? currentSum : -1;
        }
        int best = -1;
        // Перебираем возможные элементы для выбора на текущем уровне рекурсии
        for (int i = start; i <= ls.size() - k; i++) {
             // Рекурсивно выбираем следующий элемент
            int sum = findBestSum(ls, k - 1, t, i + 1, currentSum + ls.get(i));
            // Обновляем лучший результат, если текущий лучше
            if (sum > best) {
                best = sum;
            }
        }
        return best;
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> distances = Arrays.asList(50, 55, 56, 57, 58);
        int maxDistance = 175;
        int citiesToVisit = 3;

        int result = chooseBestSum(maxDistance, citiesToVisit, distances);
        System.out.println("Максимальное расстояние: " + result);
    }
}
