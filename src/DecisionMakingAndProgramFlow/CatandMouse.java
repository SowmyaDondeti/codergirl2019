package DecisionMakingAndProgramFlow;

import java.util.Scanner;

public class CatandMouse {
  public static void main(String[] args) {

    System.out.println(
        "You are a small, hungry field mouse. You find yourself standing in a mouse hole in the kitchen of a farm house. In the room is a bowl of cat food that smells really tasty. A young cat is sleeping on a rug in the middle of the room.\n"
            + "Looking around the room, you see a wooden table with chairs, a metal floor lamp, and curtains over a window. You can smell a summer breeze blowing in.\n"
            + "Where do you go? Options: chair table lamp food curtain\n");
    Scanner keyboard = new Scanner(System.in);
    String input;
    input = keyboard.nextLine();
    if (input.equals("chair")) {
      System.out.println(
          "You sneak quietly to the chair and climb its rough wood. The only place you can reach from here is the table, so you climb it too. Looking around from the table, you see two paths. You can walk across the countertop to the open window, or you can climb down the table leg to the floor.\n"
              + "Where do you go? Options: window floor\n");

      input = keyboard.nextLine();
      if (input.equals("window")) {
        System.out.println(
            "You climb out the window and down. The tall grass hides you well. You find some tasty spilled grain. By the time you get to the barn, you are well fed, and ready to take a nap in the hay. There is no cat in the barn. You're a happy mouse. (The End)\n");
        System.out.println("You Win");
      } else {
        System.out.println(
            "You try to climb down the table leg but it's too slippery. Thump! You hit the floor with a bang. The cat wakes up and chases you around the kitchen! You race back to your hole, still hungry, and hide for the rest of the day. (The End)");
        System.out.println("Try again tomorrow");
      }

    } else if (input.equals("table")) {
      System.out.println(
          "You sneak quietly to the table. The legs are polished and slippery, and you fall with a thump when you try to climb up. The cat woke up! He chases you around the kitchen and back into the mouse hole! Exhausted and hungry, you give up for the day. (The End)\n");
      System.out.println("Try again later");
    } else if (input.equals("lamp")) {
      System.out.println(
          "You sneak quietly over to the lamp and try to climb it. The lamp buzzes slightly under your paws, and the light turns on with a click! The cat heard the lamp turn on and snaps awake. He chases you around the kitchen and back into your hole! (The End)");
      System.out.println("Try again later");
    } else if (input.equals("food")) {
      System.out.println(
          "You sneak over to the cat's food dish. There's one piece of food on the floor and more in the dish. You're very hungry.\n"
              + "What do you eat? Options: floor dish");
      input = keyboard.nextLine();
      if (input.equals("floor")) {
        System.out.println(
            "You eat a large, tasty piece of cat food that was dropped on the floor. You were very quiet. The cat hasn't woken up yet.\n"
                + "Where do you go next? Options: dish curtain");
        input = keyboard.nextLine();
        if (input.equals("dish")) {
          System.out.println(
              "The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be sure to notify your next of kin. (The End)\n");
          System.out.println("The world's tiniest sad trombone plays at your mouse funeral.");
        } else {
          System.out.println(
              "You quietly sneak over to the curtain. The cat wakes up slow and groggy. You've already made it to the curtain by the time he notices you. With a burst of well-fed strength, you race up the curtain and leap out the open window! Behind you, you hear the thump of the cat hitting the window frame and not making it through.\n"
                  + "You follow a grain trail to the barn and find some warm hay to hide in for a nap. There is no cat in the barn. You're a happy mouse! (The End)");
          System.out.println("You win");
        }
      } else {
        System.out.println(
            "The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be sure to notify your next of kin. (The End)");
        System.out.println("The world's tiniest sad trombone plays at your mouse funeral.");
      }

    } else if (input.equals("curtain")) {
      System.out.println(
          "You sneak quietly across the room to the long curtains hanging by the window. The curtains are an easy climb. The cat is still asleep. You smell a barn just outside.\n"
              + "Where do you go? Options: down window");
      input = keyboard.nextLine();
      if (input.equals("down")) {
        System.out.println(
            "As you climb back down the curtain, the cat stretches and looks around the room. He notices the curtain hanging strangely and comes over to investigate. You have barely a moment to race back into your hole and try again tomorrow. (The End)");

      } else {
        System.out.println(
            "You smell a barn nearby with fresh grain. You climb through the window and hide in the tall grass. There's spilled grain here that makes a tasty treat. By the time you reach the barn, you are well fed, and find a quiet spot in the hay for a nap. There is no cat in the barn. You're a happy mouse! (The End)");
        System.out.println("You Win");
      }
    }
  }
}
