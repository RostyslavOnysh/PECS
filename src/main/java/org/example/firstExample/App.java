package org.example.firstExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "wrld", "generics");
        List<Integer> listInteger = List.of(10, 20, 30);

        List<Animal> animals = new ArrayList<>();
        List<Cat> cat = new ArrayList<>();

        printCollection(animals);
        printCollection(cat);
        // printCollection(list);
        //  printCollection(listInteger);
    }

    public static void printCollection(Collection<? extends Animal> collection) {
        for (Object element : collection) {
            System.out.println(element);
        }
    }
}

// use wilcard when we don`t know which type we get
// за допомогою wilcard та ключового слова можна обмежити тип данних,це називаєтся обмеження типів.
// wildcard це колекція невідомого типу ми можемо обмежувати цей тип,будь якого типу не більчим чим наприклад Animal
