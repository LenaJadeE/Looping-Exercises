package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args){
        int count = 0;

        while (count < 5) {
            System.out.println("I Love Jave");
            count++;
        }
    }
}






// EXERCISE 1
// Step 1
//  Create a class called WhileLoop.
//  Add a main() method and create a while loop to display the text "I love Java" 5 times.
//  Create another class named DoWhileLoop. Add a new main() method and print "I love Java" again, 5 times, but this time use a do/while loop.
// Step 2
//  Add another class to your application.
//  Name it ForLoop and add a main() method.
//  Use a for loop to display a countdown from 10 to 1 and then end by displaying the word "Launch!"
//      HINT: Inside the loop add Thread.sleep(1000); to pause 1 second between each number to slow the countdown.
//  You will also need to update the main method definition as follows:
//  public static void main(String[] args) throws InterruptedException
// Step 3
//  1. Ensure all your changes are committed and pushed to GitHub
//  2. Send your repository URL to your Instructor