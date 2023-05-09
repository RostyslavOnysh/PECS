package org.example.GenericsType;

import java.util.ArrayList;
import java.util.List;

public class exmpl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        /*
        Invariance
      List <Number> numb = myInts;
      По своїй природі всі Generics є Invariance
      це коли немає ієрархії наслідування

        Covariance
       List<Cat> cat = new ArrayList<>();
       List<? extends Animal> animals = cat;
       без ключового слова extends це не буде компілюватися.Коли ми використовуємо wildcard extends
       ми досягаємо ієрархії наслідування.
       Коли досягаєтся ієрархія наслідування
        List<? extends Number> numbers = new ArrayList<Integer>();
        List<? extends Number> numbers1 = new ArrayList<Double>();



        Contravariance
реалізуєтся за рахунок ключового слова Super
List<? super Number> number2 = new ArrayList<>();
Ми можемо в таку колекцію додавати будь який обьект  класу наслідника Number
це протилежне до  Covariance

         */

        List<? extends Number> numbers = new ArrayList<Integer>();
        List<? extends Number> numbers1 = new ArrayList<Double>();

     List<? super Number> number2 = new ArrayList<>();
    }
}
