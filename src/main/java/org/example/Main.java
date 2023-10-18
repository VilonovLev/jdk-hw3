package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();
        myCollection.add("asda");
        myCollection.add("asda");

        for (var str:myCollection) {
            System.out.println(str);
        }

        System.out.println(Calculator.sum(123,6L));
        System.out.println(Calculator.subtract(123,6L));
        System.out.println(Calculator.divide(123,6L));
        System.out.println(Calculator.multiply(123,6L));

        String[] a = {"1,2,3,1","2"};
        String[] b = {new String("1,2,3,1"),"2"};
        System.out.println(compareArrays(a,b));

        ServiceBD<String> stringServiceBD = new ServiceBDImpl<>();
        stringServiceBD.save("Str");
        stringServiceBD.save("123");
        System.out.println(stringServiceBD.getAll());
    }

    /**
     *  Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
     *  если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
     *  но должны иметь одинаковую длину и содержать элементы одного типа.
     * @param arraysFirst
     * @param arraysSecond
     * @return
     * @param <T>
     */
    public static <T>  boolean compareArrays(T[] arraysFirst, T[] arraysSecond) {
        if (arraysFirst == arraysSecond) return true;
        if (arraysFirst.length != arraysSecond.length) return false;

        List<T> listFirst = Arrays.stream(arraysFirst).toList();
        List<T> listSecond = new ArrayList<>(Arrays.stream(arraysSecond).toList());

        for (T t: listFirst) {
            if(!listSecond.remove(t)){
                return false;
            }
        }
        return listSecond.size() == 0;

    }
}