package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Wordlist wordlist = new Wordlist();

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a grandma 1/Vera 2/Jules 3/Penny");
        int choice = scan.nextInt();


        if (choice == 1) {
            Grandma grandma = new Barb();

            int lives = 5;
            boolean likesWord = false;

            System.out.println("Hi my name is " + grandma.getName());
            System.out.println("Give me a word and I will tell you if I hate it");


            while (!likesWord) {
                String str = scan.nextLine();
                if (grandma.likesWord(str) && wordlist.knownWords.contains(str)) {
                    System.out.println("Yes I like this word!");
                    likesWord = true;
                    lives = 5;
                    // System.out.println("Give me another! You have 5 more guesses!");
                } else {
                    //str = scan.nextLine();
                    System.out.println("I hate the word " + str + "!");
                    lives--;
                    System.out.println("You have " + lives + " guesses left!");
                    //str = scan.nextLine();
                }

            }
        } else if (choice == 2) {
            Grandma grandma2 = new Jules();
            int lives = 5;
            boolean likesWord = false;

            System.out.println("Hi my name is " + grandma2.getName());
            System.out.println("Give me a word and I will tell you if I hate it");
                while (!likesWord)
                {
                String str = scan.nextLine();
                if(grandma2.likesWord(str) && wordlist.knownWords.contains(str)){
                    System.out.println("Yes I like this word!");
                    likesWord = true;
                    lives = 5;
                    // System.out.println("Give me another! You have 5 more guesses!");
                }
                else {
                    System.out.println("I hate the word " + str + "!");
                    lives--;
                    System.out.println("You have " + lives + " guesses left!");
                    str = scan.nextLine();
                }
                }
        } else if (choice == 3) {
            Grandma grandma3 = new Penny();
            int lives = 5;
            boolean likesWord = false;

            System.out.println("Hi my name is " + grandma3.getName());
            System.out.println("Give me a word and I will tell you if I hate it");
            while (!likesWord)
            {
                String str = scan.nextLine();
                if(grandma3.likesWord(str) && wordlist.knownWords.contains(str)){
                    System.out.println("Yes I like this word!");
                    likesWord = true;
                    lives = 5;
                    // System.out.println("Give me another! You have 5 more guesses!");
                }
                else {
                    System.out.println("I hate the word " + str + "!");
                    lives--;
                    System.out.println("You have " + lives + " guesses left!");
                    str = scan.nextLine();
                }
            }
        } else if (choice == 4) {
            Grandma grandma4 = new Jamie();
            int lives = 5;
            boolean likesWord = false;

            System.out.println("Hi my name is " + grandma4.getName());
            System.out.println("Give me a word and I will tell you if I hate it");
            while (!likesWord)
            {
                String str = scan.nextLine();
                if(grandma4.likesWord(str) && wordlist.knownWords.contains(str)){
                    System.out.println("Yes I like this word!");
                    likesWord = true;
                    lives = 5;
                    // System.out.println("Give me another! You have 5 more guesses!");
                }
                else {
                    System.out.println("I hate the word " + str + "!");
                    lives--;
                    System.out.println("You have " + lives + " guesses left!");
                    str = scan.nextLine();
                }
            }

            }else System.out.println("Not a choice.");


            // }
            // System.out.println("Hello, I'm Grandma Betty");
            // int i = 0;
            //while(i <10){
            //  Scanner input = new Scanner(System.in);
            // String word = input.nextLine();

            //if(hasDoubleLetters(word) && knownWords.contains(word)){
            // System.out.println("Yes I like that word!");
            // }

    }
}




