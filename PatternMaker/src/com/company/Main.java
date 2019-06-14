package com.company;


import pattern.*;


public class Main {

    public static void main(String[] args) {
        Pattern crossStitchWigglePattern = new CrossStitchWigglePattern(0.05);
        Pattern brokenStitchWigglePattern = new CrossStitchWigglePattern( 0.40);
        crossStitchWigglePattern.pattern();
        brokenStitchWigglePattern.pattern();

    }
}
