package ru.geekbrains.java2.homework3;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        namesNumber();
    }


    public static void namesNumber() {
        String[] words = {"Cat", "Cat", "Cat", "Dog", "Human", "Sea", "Star", "Star", "Dog", "Cat"};

        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (list.containsKey(words[i]))
                list.put(words[i], list.get(words[i]) + 1);
            else
                list.put(words[i], 1);
        }
        
    }
}
