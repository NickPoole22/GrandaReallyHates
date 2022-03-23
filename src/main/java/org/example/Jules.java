package org.example;

public class Jules extends Grandma {
    public Jules() {super("Jules");
    }


    @Override
    public boolean likesWord(String str ) {
        if(str.contains("jules"))
        {
            return true;
        }
        if(str.equals(""))
        {
            return false;
        }
        if(str.charAt(0) == str.charAt(str.length() -1))
        {
            return true;
        }
        return false;
    }
}