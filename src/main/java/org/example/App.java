package org.example;

import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "wrld", "generics");
        List<Integer> listInteger = List.of(10, 20, 30);

        printCollection(list);
        printCollection(listInteger);
    }

    public static void printCollection(Collection <?> collection) {
        for (Object element : collection) {
            System.out.println(element);

        }
    }
}

// use wilcard when we don`t know which type we get