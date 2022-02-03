package application;

import data.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("first", 10);

        System.err.println(pair.getFirst());
        System.err.println(pair.getSecond());
    }
    
}
