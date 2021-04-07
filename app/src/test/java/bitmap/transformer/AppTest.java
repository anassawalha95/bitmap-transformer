/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testNewImagesCreated() {

        colorPalletTransforms bitmapImageTest1=new colorPalletTransforms("eviltower.bmp" ,"RandomizeEvilTower.png");
        bitmapImageTest1.readBitmapFile();
        bitmapImageTest1.convertToRandomize();


        assertEquals("expected true returned false",true, bitmapImageTest1.writeBitmapFile());

        colorPalletTransforms bitmapImageTest2=new colorPalletTransforms("eviltower.bmp" ,"InvertEvilTower.png");
        bitmapImageTest2.readBitmapFile();
        bitmapImageTest2.convertToInvert();
        assertEquals("expected true returned false",true, bitmapImageTest2.writeBitmapFile());

    }
}