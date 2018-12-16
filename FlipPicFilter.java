import java.awt.Color;
/**
 * Image filter to revert picture upsidedown.
 *
 * @author (Nick)
 * @version (1)
 */
public class FlipPicFilter extends Filter
{
    

    /**
     * Constructor for objects of class PineGladeFilter
     * @string name
     */
    public FlipPicFilter(String name)
    {
        super (name);
    }

    /**
     * 
     * apply filter pine glade
     * @param image
     * 
     */
    public void apply(OFImage image)
    {
         int height = image.getHeight();
        int width = image.getWidth();
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height / 2; y++) {
                Color left = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(x, height - 1 - y));
                image.setPixel(x, height - 1 - y, left);
            }
        }
    }
}
