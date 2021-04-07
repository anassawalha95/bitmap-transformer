package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;


public class colorPalletTransforms extends Bitmap {

    colorPalletTransforms(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }
    public void convertToInvert(){
        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
//
//            for (int y = 0; y < getImgHeight(); y++) {
//                for (int x = 0; x < getImgWidth(); x++) {
//                    int pixelRGB = oldImg.getRGB(x, y);
//                    newImg.setRGB(x, y, pixelRGB);
//                }
//            }
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = (int)(255-color.getRed());
                    int green = (int)(255- color.getGreen() );
                    int blue = (int)(255- color.getBlue());
                    Color newColor = new Color(red,green,blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }



    }


    public void convertToRandomize(){
        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = (int)(color.getRed() * Math.random() );
                    int green = (int)(color.getGreen() * Math.random() );
                    int blue = (int)(color.getBlue() * Math.random()  );

                    Color newColor = new Color(red,green,blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }



    public void convertToBlackAndWhite(){
        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = (int)(color.getRed() * 0.299);
                    int green = (int)(color.getGreen() * 0.587);
                    int blue = (int)(color.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,
                            red+green+blue,red+green+blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }


    }

//
//    public void convertToDarker(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//
//                    img.setRGB(j, i, new Color(255, 0, 0, 127).getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//
//
//    }
//
//    public void convertToLighter(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//                    Color color = new Color(img.getRGB(j, i));
//                    int red = (int)(color.getRed() * 0.299);
//                    int green = (int)(color.getGreen() * 0.587);
//                    int blue = (int)(color.getBlue() *0.114);
//                    Color newColor = new Color(red+green+blue,
//                            red+green+blue,red+green+blue);
//                    img.setRGB(j,i,newColor.getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//}

//        public void addHue(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//                    Color color = new Color(img.getRGB(j, i));
//                    int red = (int)(color.getRed() * 0.299);
//                    int green = (int)(color.getGreen() * 0.587);
//                    int blue = (int)(color.getBlue() *0.114);
//                    Color newColor = new Color(red+green+blue,
//                            red+green+blue,red+green+blue);
//                    img.setRGB(j,i,newColor.getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//}
//
//    public void multiplyHue(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//                    Color color = new Color(img.getRGB(j, i));
//                    int red = (int)(color.getRed() * 0.299);
//                    int green = (int)(color.getGreen() * 0.587);
//                    int blue = (int)(color.getBlue() *0.114);
//                    Color newColor = new Color(red+green+blue,
//                            red+green+blue,red+green+blue);
//                    img.setRGB(j,i,newColor.getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//    }
//
//    public void addContrast(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//                    Color color = new Color(img.getRGB(j, i));
//                    int red = (int)(color.getRed() * 0.299);
//                    int green = (int)(color.getGreen() * 0.587);
//                    int blue = (int)(color.getBlue() *0.114);
//                    Color newColor = new Color(red+green+blue,
//                            red+green+blue,red+green+blue);
//                    img.setRGB(j,i,newColor.getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//    }
//
//    public void subtractContrast(){
//        try {
//
//            for(int i=0; i<getImgHeight (); i++) {
//                for(int j=0; j<getImgWidth(); j++) {
//                    Color color = new Color(img.getRGB(j, i));
//                    int red = (int)(color.getRed() * 0.299);
//                    int green = (int)(color.getGreen() * 0.587);
//                    int blue = (int)(color.getBlue() *0.114);
//                    Color newColor = new Color(red+green+blue,
//                            red+green+blue,red+green+blue);
//                    img.setRGB(j,i,newColor.getRGB());
//                }
//            }
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//    }
}