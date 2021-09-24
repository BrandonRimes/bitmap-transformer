package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Bitmap {
    public String getGreeting2() {
        return "Goodbye (cruel) World!";
    }

    public static int[][] getImage(String filePathToRead) throws IOException {
        BufferedImage image = ImageIO.read(new File("./src/main/resources/baldy-8bit.bmp"));
        int width = image.getWidth();
        int height = image.getHeight();
        int[][] imageArray = new int[width][height];
//https://www.tutorialspoint.com/how-to-set-modify-the-pixels-rgb-values-of-an-image-using-java-opencv-library
        for(int xPixel = 0; xPixel < imageArray.length; xPixel++) {
            for(int yPixel = 0; yPixel < imageArray[xPixel].length; yPixel++){
                int pixelRGB = image.getRGB(xPixel, yPixel);
                Color color = new Color(pixelRGB, true);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                green = 50;
                blue = 50;
                color = new Color(red, green, blue);
                image.setRGB(xPixel, yPixel, color.getRGB());
//                System.out.println(pixelRGB);
//                imageArray[xPixel][yPixel] = pixelRGB;
            }
        }
        Path current = Paths.get(".");
        String currentFile = current.toAbsolutePath().toString();
        System.out.println(currentFile);
        File file = new File("./src/main/resources/bald2.bmp");
//        BufferedImage newImage = new BufferedImage(width, height, Buff);

        boolean bmp = ImageIO.write(image, "BMP", file);

        System.out.println("Height: "+height+"\nWidth: " +width);
//        System.out.println(Arrays.toString(imageArray));
        return imageArray;
    }

//    public static int[][] transformImage1(int) {
//        if(typeOfTransform.equals("blue")) {
//            transform
//        }
//    }
//        if(transform1) {
//            transform1(pixelRGB);
//        } else if(transform2) {
//            transform2(pixelRGB);
//        } else if(transform3) {
//            transform3(pixelRGB);
//        } else {
//            imageArray[xPixel][yPixel] = pixelRGB;
//        }


//    public transform1(img) {
//
//    BufferedImage img = ImageIO.read("./");
//
////        ImageIO.write(img, "BMP", )
//    }
}