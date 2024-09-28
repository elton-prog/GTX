import javax.swing.*;
public class complab3 {

    public static void main(String[] args) {
        JFrame Kemei=new JFrame("COURSE REGISTRETION");
        JLabel fn=new JLabel("First name");
        fn.setBounds(30,100,100,30);
        JLabel mn=new JLabel("Middle Name");
        mn.setBounds(30,150,100,30);
        JLabel vn=new JLabel("Last Name");
        vn.setBounds(30,200,100,30);
        
        JTextField t1,t2,t3;
        t1=new JTextField();
        t1.setBounds(110,100,100,30);
        t2=new JTextField();
        t2.setBounds(110,150,100,30);
        t3=new JTextField();
        t3.setBounds(110,200,100,30);
        
        JButton btn1,btn2;
        btn1=new JButton("save");
        btn1.setBounds(30,250,100,30);
        btn2=new JButton("Delete");
        btn2.setBounds(200,250,100,30);
        
        Kemei.add(btn1);
        Kemei.add(btn2);
        Kemei.add(t1);
        Kemei.add(t2);
        Kemei.add(t3);
        Kemei.add(fn);
        Kemei.add(mn);
        Kemei.add(vn);
        Kemei.setSize(500,500);
        Kemei.setLayout(null);
        Kemei.setVisible(true);
        
        
        
    }
    
}
