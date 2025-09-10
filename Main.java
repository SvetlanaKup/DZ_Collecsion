package ДЗ_PowerfulSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2, 4));

        System.out.println("Пересечение: " + PowerfulSet.intersection(set1, set2));
        System.out.println("Объединение: " + PowerfulSet.union(set1, set2));
        System.out.println("Разность (set1 без set2): " + PowerfulSet.relativeComplement(set1, set2));
    }
}
