package org.launchcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String quote =
                "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInQuote = quote.toCharArray();

        HashMap<Character, Integer> HashQuote = new HashMap<>();

        for (char index : charactersInQuote) {
            if (HashQuote.containsKey(index)) {
                HashQuote.put(index, HashQuote.get(index) + 1);
            } else {
                HashQuote.put(index, 1);
            }
        }
        for (Map.Entry<Character, Integer> index : HashQuote.entrySet()){
            System.out.println(index.getKey() +": " + index.getValue());
        }
    }
}