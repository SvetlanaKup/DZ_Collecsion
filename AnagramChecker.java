package ДЗ_Анаграмма;

/*С консоли на вход подается две строки s и t. Необходимо вывести true, если одна строка является валидной
анаграммой другой строки, и false – если это не так.
Анаграмма – это слово, или фраза, образованная путем перестановки букв другого
слова или фразы, обычно с использованием всех исходных букв ровно один раз.
Для проверки:
● Бейсбол – бобслей
● Героин – регион
● Клоака – околка*/

import java.util.Arrays;

public class AnagramChecker {

    /**
     * Проверяет, являются ли две строки анаграммами.
     *
     * @param s первая строка
     * @param t вторая строка
     * @return true, если строки являются анаграммами; false — иначе
     */
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        // Удаление пробелов, приведение к нижнему регистру
        String sClean = s.replaceAll("\\s+", "").toLowerCase();
        String tClean = t.replaceAll("\\s+", "").toLowerCase();

        // Быстрая проверка длины
        if (sClean.length() != tClean.length()) {
            return false;
        }

        // Преобразование строк в массивы и сортировка
        char[] sChars = sClean.toCharArray();
        char[] tChars = tClean.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Сравнение отсортированных массивов
        return Arrays.equals(sChars, tChars);
    }
}
