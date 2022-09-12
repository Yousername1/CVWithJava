package src;

import javax.swing.*;

import static src.CVWithJava.toMatrix;

public class HelperMethods extends JFrame {
    private static JFrame window = new JFrame();
    private static JLabel screen = new JLabel();
    public static ImageIcon ic;

    public static void imageToWindow(){
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        toMatrix();
        screen.setIcon(ic);
        window.getContentPane().add(screen);
        window.pack();
    }
}
