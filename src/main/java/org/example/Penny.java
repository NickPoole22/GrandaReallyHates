package org.example;

public class Penny extends Grandma {
    public Penny() {super("Penny");
    }


    @Override
    public boolean likesWord(String str ) {
        if(str.contains("penny"))
        {
            return true;
        }
        if (str.equals(""))
        {
            return false;
        }
        String temp = "";

        for(int i = str.length() - 1;  i > -1; i--) {
            temp += str.charAt(i);
          System.out.println(temp);
        }
        return(temp.equals(str));
    }
}