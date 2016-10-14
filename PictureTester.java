/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and on the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroGreen */

    public static void testMirrorVerticalRightToLeft()
    {
        Picture pix = new Picture("beach.jpg");
        pix.explore();
        pix.MirrorVerticalRightToLeft();
        pix.explore();
    } 

    public static void testMirrorHorizontalBotToTop()
    {
        Picture pix = new Picture("beach.jpg");
        pix.explore();
        pix.mirrorHorizontalBotToTop();
        pix.explore();
    }

    public static void testMirrorHorizontal()
    {  
        Picture pix = new Picture("beach.jpg");
        pix.explore();
        pix.mirrorHorizontal();
        pix.explore();
    }

    public static void testNegate()

    {
        Picture pix = new Picture("water-life-crop.jpg");
        pix.explore();
        pix.keepOnlyBlue();
        pix.explore();
    }

    public static void testKeepOnlyBlue()
    {
        Picture pix = new Picture("water-life-crop.jpg");
        pix.explore();
        pix.keepOnlyBlue();
        pix.explore();
    }

    public static void testZeroGreen()
    {
        Picture dt = new Picture("beach.jpg");
        dt.explore();
        dt.zeroGreen();
        dt.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroGreen();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}