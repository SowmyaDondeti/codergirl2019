package IfclassAndConditions;

import java.util.Scanner;

public class BuildingTreasureChest {
  public static void main(String[] args) {
    int boardsPerChest = 9;
    Scanner keyboard = new Scanner(System.in);
    int silverPiecesPerBoard = keyboard.nextInt();
    int costPerLock = keyboard.nextInt();
    int costForBoards = silverPiecesPerBoard * boardsPerChest;
    int totalChestCost;
    totalChestCost = costForBoards + costPerLock;
    int investment = keyboard.nextInt();
    int numChests;
    numChests = investment / totalChestCost;
    System.out.println("That will pay for the creation of " + numChests + " chests");
    int leftOverSilver;
    leftOverSilver = investment - (numChests * totalChestCost);
    System.out.println("Left over silver pieces " + leftOverSilver);
  }
}
