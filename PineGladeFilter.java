import java.awt.Color;
/**
 * Image filter to make it pine glade color.
 *
 * @author (Nick)
 * @version (1)
 */
public class PineGladeFilter extends Filter
{
    

    /**
     * Constructor for objects of class PineGladeFilter
     * @string name
     */
    public PineGladeFilter(String name)
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
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(204, 204, 153));
            }
        }
    }
}
