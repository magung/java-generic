package application;

import data.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        
        MyData<Object> objectMyData = new MyData<>("Agung");

        objectMyData.setData(1000); // HATI _ HATI untuk set data

        MyData<? super String> stringMyData = objectMyData;

        process(objectMyData);

        System.err.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData) {
        String value = (String) myData.getData();

        System.err.println("Pocess parameter " + value);

        myData.setData("Agung Maulana");
    }
    
}
