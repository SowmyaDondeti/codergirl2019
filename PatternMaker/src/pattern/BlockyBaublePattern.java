package pattern;

import stitch.BlockStitch;
import stitch.CircleStitch;
import stitch.ShortLineStitch;
import stitch.Stitch;

public class BlockyBaublePattern extends Pattern
{
    private Stitch blockStitch = new BlockStitch();
    private Stitch shortLineStitch = new ShortLineStitch();
    private Stitch circleStitch = new CircleStitch();
    public void pattern(){
        boolean needleJam = (Math.random() < 0.1d);
        if (needleJam){
            for (int i = 0; i < 2; i++) {
                blockStitch.sew();
                shortStitchLoop(shortLineStitch);
                circleStitch.sew();
                shortStitchLoop(shortLineStitch);
            }
    } else {
      for (int i = 0; i < 3; i++) {
        blockStitch.sew();
        shortStitchLoop(shortLineStitch);
        circleStitch.sew();
        shortStitchLoop(shortLineStitch);
      }
    }
    }
    private void shortStitchLoop(Stitch type){
        for (int i=0;i<2;i++){
            type.sew();
        }
    }

}
