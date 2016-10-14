import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void mirrorArms()
    public void MirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[0].length; j++)
            {
                leftPixel = pixels[i][j];
                rightPixel = pixels[i][pixels[0].length - 1 - j];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[0].length; j++)
            {
                topPixel = pixels[i][j];
                bottomPixel = pixels[pixels.length / 2 - 1 - i][j];
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    }
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[0].length; j++)
            {
                topPixel = pixels[i][j];
                bottomPixel = pixels[i][pixels[0].length - j - 1];
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    }
    public void grayscale()
    {
        Pixel[][] pixels = this.getPixels2D();
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[i].length; j++)
            {
                int average = (pixels[i][j].getRed() + pixels[i][j].getGreen() + pixels[i][j].getBlue())/3;
                pixels[i][j].setBlue(average);
                pixels[i][j].setRed(average);
                pixels[i][j].setGreen(average);
            }
        }
    }
    public void negate()
    {
        Pixel[][] pixels = this.getPixels2D();
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setRed(250 - pixels[i][j].getRed());
                pixels[i][j].setBlue(250 - pixels[i][j].getBlue());
                pixels[i][j].setGreen(250 - pixels[i][j].getGreen());
            }
        }
    }
    public void keepOnlyBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for(int i = 0; i < pixels.length; i++)
        {
            for(int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setBlue(255);
            }
        }
    }
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void zeroRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }

    public void zeroGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        //     for (Pixel[] rowArray : pixels)
        //     {
        //       for (Pixel pixelObj : rowArray)
        //       {
        //         pixelObj.setGreen(0);
        //       }
        //     }
        for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setGreen(255);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {

    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 27; row < 97; row++)
        {
            for (int col = 13; col < mirrorPoint; col++)
                {
                    leftPixel = pixels[row][col];
                    rightPixel = pixels[row]
                    [mirrorPoint - col + mirrorPoint];
                    rightPixel.setColor(leftPixel.getColor());
                    count++;
                }
        }
    }
    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,int startRow, int startCol)
    {

    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {

    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {

    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture pix = new Picture("water-life-crop.jpg");
        pix.explore();
        pix.zeroBlue();
        pix.explore();
    }

} // this } is the end of class Picture, put all new methods before this
