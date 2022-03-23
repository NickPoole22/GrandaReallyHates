package org.example;

public class Jamie extends Grandma {
    public Jamie() {super("jamie");
    }


    @Override
    public boolean likesWord(String str ) {
        if(str.equals(""))
        {
            return false;
        }
        if(str.length() >= 6 && str.length() < 11 || str.contains("jamie"))
        {
            return true;
        }
        return false;
    }
}