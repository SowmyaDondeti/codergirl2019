package com.company;


import stitch.ShortLineStitch;
import stitch.SmallCrossStitch;
import stitch.Stitch;

public class Main {

    public static void main(String[] args) {
        Stitch s = new Stitch();
        Stitch sh = new ShortLineStitch();
        Stitch sc = new SmallCrossStitch();
        s.sew();
        sh.sew();
        sc.sew();

    }
}
