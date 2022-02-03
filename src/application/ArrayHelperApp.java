package application;

import util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] names = {"Budi", "Joko", "Jaka"};
        Integer[] numbers = {1,23,4,5,5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
    
}
