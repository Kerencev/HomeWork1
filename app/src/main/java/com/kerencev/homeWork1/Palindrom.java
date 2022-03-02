package com.kerencev.homeWork1;

public class Palindrom {

    /**
     * Является ли строка палиндромом
     * @param s - передаем строку
     * @return - результат
     */
    static boolean isPalindrom(String s) {

        String[] letters = s.split("");

        for (int i = 0; i < letters.length; i++) {
            if (!letters[i].equalsIgnoreCase(letters[letters.length - 1 - i]))
                return false;
        }
        return true;
    }
}
