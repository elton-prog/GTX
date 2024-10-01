
package bar;
import javax.swing.*;
public class Bar {

    public static void main(String[] args) {
        JFrame arx=new JFrame("elton");
        arx.setSize(700,700);
        arx.setLayout(null);
        arx.setVisible(true);
        
        JScrollBar vox=new JScrollBar();
        vox.setSize(200,100);
        vox.setBounds(30,100,600,350);
        arx.add(vox);
    }
    
}
