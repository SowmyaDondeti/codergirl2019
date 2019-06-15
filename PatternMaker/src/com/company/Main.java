package com.company;

import pattern.*;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Pattern crossStitchWigglePattern = new CrossStitchWigglePattern(0.05);
    Pattern zigZagLinesPattern = new ZigZagLinesPattern();
    Pattern baublePattern = new BaublePattern();
    Pattern blockyBaublePattern = new BlockyBaublePattern();
    Pattern brokenWigglePattern = new CrossStitchWigglePattern(0.4);
    ArrayList<Pattern> patterns = new ArrayList<>();
    patterns.add(crossStitchWigglePattern);
    patterns.add(zigZagLinesPattern);
    patterns.add(baublePattern);
    patterns.add(blockyBaublePattern);
    patterns.add(brokenWigglePattern);
      patterns.forEach(
              pattern -> {
                  printPattern(pattern,8,3);
              });
        blankLines(3);
      patterns.forEach(
              pattern -> {
                  printPattern(pattern,6,8);
              });
  }

    private static void printPattern(Pattern pattern , int blocks ,int rows)
    {
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < blocks; i++) {

                pattern.pattern();
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static  void blankLines(int n){
    for (int i = 0; i < n; i++) {
      System.out.println();
    }
  }
  }

