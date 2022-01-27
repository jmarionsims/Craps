
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Craps
{

  public static void main(String[] args)
  {
    Die die = new Die();
    int roll = 0;
    int point = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Do you want to play craps? (Y/N)");
    String response = in.nextLine();
    if (response.equals("Y") || response.equals(""))
    {
      System.out.println("Do you need instructions? (Y/N)");
      String instructions = in.nextLine();
      if (instructions.equals("Y") || instructions.equals(""))
      {
        System.out.println("1. 1. A player rolls two six-sided dice and adds the numbers rolled together.");
        System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
        System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
      }
    }
    while (response.equals("Y") || response.equals(""))
    {
      System.out.println("Press enter to roll!");
      String rollAgain = in.nextLine();
      if (rollAgain.equals(""))
      {
        roll = die.rollDie() + die.rollDie();
      }
      if (roll == 7 || roll == 11)
      {
        System.out.println("You rolled a " + roll + "! You win!");
      }
      else if (roll == 2 || roll == 3 || roll == 12)
      {
        System.out.println("You rolled a " + roll + ". You lose.");
      }
      else
      {
        point = roll;
        System.out.println("Your point is " + roll);
        System.out.println("Press enter to roll again!");
        rollAgain = in.nextLine();
        if (rollAgain.equals(""))
        {
          roll = die.rollDie() + die.rollDie();
          System.out.println("Your roll is " + roll);
        }
        while (roll != point && roll != 7)
        {
          System.out.println("Press enter to roll again!");
          rollAgain = in.nextLine();
          if (rollAgain.equals(""))
          {
            roll = die.rollDie() + die.rollDie();
            System.out.println("Your roll is " + roll);
          }
        }
        if (roll == 7)
        {
          System.out.println("You lost because you rolled a 7");
        }
        else if (roll == point)
        {
          System.out.println("You rolled your point! You win!");
        }
      }
      System.out.println("Do you want to play again? (Y/N)");
      response = in.nextLine();
    }
    System.out.println("Ok, Goodbye!");

  }
}

/*

COMMENTS FROM THE INSTRUCTOR:

Well, you didn't include your name or the date in the JavaDocs up at the top, Jack--it's a
good think I was able to look at the git log to find out who worked on this!

Otherwise, this is an outstanding implementation of the game, and it works just as it should.
I'm looking forward to seeing more of your work on the upcoming projects! :)

SCORE: 50/50

*/

