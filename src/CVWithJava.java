package src;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.*;

import static src.HelperMethods.*;

public class CVWithJava {
    //Load the opencv library to the project
    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Version" + Core.VERSION);}
    //tip: If you get an error, check the location.
    //Static should not be inside a method.

    public static void main(String[] args) throws IOException {
        imageToWindow();
        createImageCopy();
    }

    public static void toMatrix() {
        Mat img = Imgcodecs.imread("src/image.jpeg");
        MatOfByte buf = new MatOfByte();
        Imgcodecs.imencode(".jpeg", img, buf);
        HelperMethods.ic = new ImageIcon(buf.toArray());
    }

    public static void createImageCopy() throws IOException {
        //Input File
        File input = new File("src/image.jpeg");

        //Reading the image
        BufferedImage image = ImageIO.read(input);

        //Saving the image with a different name
        File output = new File("src/workingCopy.jpeg");
        ImageIO.write(image, "jpeg", output);
    }
}
