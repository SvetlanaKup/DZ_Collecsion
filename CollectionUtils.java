package ДЗ_Коллекции;

import java.util.*;
/*Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор
уникальных элементов этого массива. Решить, используя коллекции*/

public class CollectionUtils {
    /**
     * Возвращает множество уникальных элементов из переданного списка.
     *
     * @param list входной список элементов
     * @param <T> тип элементов
     * @return Set<T> множество уникальных элементов
     */
    public static <T> Set<T> getUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }
}
