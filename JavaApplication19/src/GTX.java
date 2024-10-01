import javax.swing.*;
public class GTX {
    public static void main(String[] args) {
        JFrame xhx=new JFrame("file");
        xhx.setSize(600,600);
        xhx.setLayout(null);
        xhx.setVisible(true);
        JFileChooser ko=new JFileChooser();
        ko.showOpenDialog(ko);
        xhx.add(ko);
    }
    
}
