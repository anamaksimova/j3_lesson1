package j3hw1;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //задание 1
        try {String [] task1 = {"apple0","apple1","apple2","apple3","apple4","apple5","apple6","apple7"};
            elementChange(task1, 0,2);
            String [] task2 = {"apple0","apple1","apple2","apple3","apple4","apple5","apple6","apple7"};
            elementChange(task2, 7,2);
            String [] task3 = {"apple0","apple1","apple2","apple3","apple4","apple5","apple6","apple7"};
            elementChange(task3, 8,2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите верные индексы для замены");
        }
        //задание 2
        String [] task1 = {"apple0","apple1","apple2","apple3","apple4","apple5","apple6","apple7"};
        System.out.println(arrayToArrayList(task1));

        //задание 3
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple>  boxApple = new Box<Apple>(apple, apple,apple,apple, apple,apple);
        Box<Orange>  boxOrange = new Box<Orange>(orange, orange,orange, orange);
        Box<Apple> boxApple2 = new Box<>();
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        System.out.println("Вес коробки яблок: " + boxApple.getBoxWeight());
        System.out.println("Вес коробки апельсинов: " +boxOrange.getBoxWeight());
        System.out.println("Равны ли коробки по весу: " + boxApple.compare(boxOrange));
        System.out.println("Вес новой коробки " + boxApple2.getBoxWeight());
        boxApple.transfer(boxApple2);
        System.out.println("Вес новой коробки стал " + boxApple2.getBoxWeight());
    }

    public static void elementChange(Object [] arr , int i, int j)  throws ArrayIndexOutOfBoundsException{
        Object n = null;

            if (i >= arr.length || i < 0||j >= arr.length || j < 0) {
                throw new ArrayIndexOutOfBoundsException("Не верные индексы для замены");
            }

        n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;

        System.out.println(Arrays.toString(arr));
    }

    private static <T> List<T> arrayToArrayList(T [] arr) {
        return Arrays.asList(arr);
    }
}
