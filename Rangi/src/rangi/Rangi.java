
package rangi;
import javax.swing.*;
public class Rangi {

    public static void main(String[] args) {
        JFrame xyz=new JFrame("colours");
        xyz.setSize(700,700);
        xyz.setLayout(null);
        xyz.setVisible(true);
        JColorChooser cv=new JColorChooser();
        cv.setBounds(30,100,600,400);
        xyz.add(cv);
    }
    
}
