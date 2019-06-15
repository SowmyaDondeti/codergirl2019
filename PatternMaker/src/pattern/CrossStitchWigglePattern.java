package pattern;

import stitch.LargeCrossStitch;
import stitch.SmallCrossStitch;
import stitch.Stitch;

public class CrossStitchWigglePattern extends Pattern
{
    public CrossStitchWigglePattern(double needleJamRate){

        this.needleJamRate = needleJamRate;

    }

    private double needleJamRate ;

    private Stitch smallCrossStitch = new SmallCrossStitch();
   private Stitch largeCrossStitch = new LargeCrossStitch();

    public void pattern(){
        boolean needleJam = (Math.random() < needleJamRate);
        if (needleJam){
      for (int i=0;i<3;i++){
          smallCrossStitch.sew();
          largeCrossStitch.sew();
      }
    } else {
      for (int i = 0; i < 5; i++) {
        smallCrossStitch.sew();
        largeCrossStitch.sew();
      }
    }

    }
}
