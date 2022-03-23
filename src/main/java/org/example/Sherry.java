package org.example;

import java.util.ArrayList;

public class Sherry extends Grandma {
    public Sherry() {super("sherry");
    }


    @Override
    public boolean likesWord(String str ) {
        int i = str.charAt(2);
        ArrayList<Character> vowels = new ArrayList<Character>("a", "e", "i", "o", "u");

        if(str.equals(""))
        {
            return false;
        }
        if(vowels.contains(i) || str.contains("sherry"))
        {
            return true;
        }
        return false;
    }
}