package pattern;

import stitch.FillStitch;
import stitch.Stitch;
import stitch.ZigZagStitch;

public class ZigZagLinesPattern extends Pattern
{
   private Stitch zigZagStitch = new ZigZagStitch();
    private Stitch fillStitch = new FillStitch();
    public void pattern(){

    for (int i = 0; i < 2; i++) {
      zigZagLoop(zigZagStitch);
      zigZagLoop(fillStitch);
        }
    }
    private void zigZagLoop(Stitch stitchType){

        for (int i=0;i<3;i++){
            stitchType.sew();
        }
    }
}
