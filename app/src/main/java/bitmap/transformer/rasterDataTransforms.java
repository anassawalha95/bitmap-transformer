package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class rasterDataTransforms extends Bitmap{

    rasterDataTransforms(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }

    public void pixilate(){


        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());


            for(int y=0; y<getImgHeight(); y++) {
                for(int x=0; x<getImgWidth(); x++) {
                    int a = (int)(Math.random()*256); //alpha
                    int r = (int)(Math.random()*256); //red
                    int g = (int)(Math.random()*256); //green
                    int b = (int)(Math.random()*256); //blue
                   int p = (a<<24) | (r<<16) | (g<<8) | b;

                    newImg.setRGB(x, y, p);
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }

//
//    public void addBorder(){
//        this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
//        try {
//            for (int y = 0; y < getImgHeight(); y++) {
//                for (int x = 0; x < getImgWidth(); x++) {
//                    int pixelRGB = oldImg.getRGB(x, y);
//                    for (int enlargeFactorPercentage = 0; enlargeFactorPercentage < 10; enlargeFactorPercentage++) {
//                        newImg.setRGB(getImgWidth(), enlargeFactorPercentage, pixelRGB * 5);
//                        newImg.setRGB(enlargeFactorPercentage, getImgHeight(), pixelRGB * 5);
//                    }
//                }
//            }
//        }catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//    }


    public void rotateLeft(){
        try {
        this.newImg=new BufferedImage(getImgHeight(),getImgWidth(),oldImg.getType());
        for(int y=0; y<getImgHeight(); y++) {
            for(int x=0; x<getImgWidth(); x++) {
               newImg.setRGB(y,(getImgWidth()-1) -x ,oldImg.getRGB(x,y));
            }
        }

    } catch (Exception e) {

        System.out.println(e);

    }

    }
    public void rotateRight(){
        try {
            this.newImg=new BufferedImage(getImgHeight(),getImgWidth(),oldImg.getType());
            for(int y=0; y<getImgHeight(); y++) {
                for(int x=0; x<getImgWidth(); x++) {
                    newImg.setRGB((getImgHeight()-1)-y,x ,oldImg.getRGB(x,y));
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}