package application;

import application.MultipleConstraintApp.Manager;
import data.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Agung"));
        print(new MyData<Manager>(new Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
