package org.example;



public class Barb extends Grandma {
    public Barb() {super("barb");
    }


    @Override
    public boolean likesWord(String str) {
        if(str.contains("barb"))
        {
        return true;
        }
        if(str.equals(""))
        {
            return false;
        }
        if (str.length() == 4)
        {
            return true;
        }
        return false;
    }
}
