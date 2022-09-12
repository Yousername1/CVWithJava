package src;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

import javax.swing.*;

import static src.HelperMethods.*;

public class CVWithJava {
    //Load the opencv library to the project
    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Version" + Core.VERSION);}
    //tip: If you get an error, check the location.
    //Static should not be inside a method.

    public static void main(String[] args) {
        imageToWindow();
    }

    public static void toMatrix() {
        Mat img = Imgcodecs.imread("src/image.jpeg");
        MatOfByte buf = new MatOfByte();
        Imgcodecs.imencode(".jpeg", img, buf);
        HelperMethods.ic = new ImageIcon(buf.toArray());
    }
}
