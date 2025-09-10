package ДЗ_Коллекции;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем пример списка с дублями
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Исходный список: " + list);

        // Получаем уникальные элементы
        Set<Integer> uniqueElements = CollectionUtils.getUniqueElements(list);

        // Вывод результата
        System.out.println("Уникальные элементы: " + uniqueElements);
    }
}
