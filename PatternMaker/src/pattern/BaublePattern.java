package pattern;

import stitch.CircleStitch;
import stitch.ShortLineStitch;
import stitch.Stitch;

public class BaublePattern extends Pattern
{
    private Stitch shortLineStitch = new ShortLineStitch();
    private Stitch circleStitch = new CircleStitch();
    public void pattern(){
        for (int i=0;i<5;i++){
            shortLineStitch.sew();
            shortLineStitch.sew();
            circleStitch.sew();
        }
    }
}
