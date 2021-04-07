package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    private String  fileName;

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    private String  outputFileName;
    BufferedImage oldImg = null;
    BufferedImage newImg = null;
    File inputFile=null;
    File outputFile = null;

    private int imgWidth=0;
    private int imgheight=0;


    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgheight;
    }

    public void setImgheight(int imgheight) {
        this.imgheight = imgheight;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    Bitmap(){}

    Bitmap(String fileName,String outputFileName){
        setFileName(fileName);
        setOutputFileName(outputFileName);
        //to run it from the terminal you must add the "../" or remove it to run it from the editor
        inputFile =new File("../"+getFileName());
        outputFile=new File(getOutputFileName());

    }

    public void readBitmapFile(){
        try {
            this.oldImg = ImageIO.read(this.inputFile);
            setImgWidth(this.oldImg.getWidth());
            setImgheight(this.oldImg.getHeight());



        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public boolean writeBitmapFile(){
        try {
          return   ImageIO.write(this.newImg, "PNG", this.outputFile);

        }catch (IOException e){
            System.out.println(e);

        }
    return false;
    }


}