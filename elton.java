import javax.swing.*;
import java.awt.*;
public class elton{

    public static void main(String[] args) {
        JFrame maseno=new JFrame("SIRIBA CAMPUS");
        JLabel xm=new JLabel("USER NAME");
        xm.setBounds(30,100,100,30);
        JLabel xj=new JLabel("PIN");
        xj.setBounds(30,150,100,30);
        JLabel xa=new JLabel("HOSTELS");
        xa.setBounds(30,200,100,30);
        JLabel vx=new JLabel ("Cities");
        vx.setBounds(30,250,100,30);
        JPasswordField aa=new JPasswordField();
        aa.setBounds(110,100,100,30);
        JPasswordField aj=new JPasswordField();
        aj.setBounds(110,150,100,30);
        
        String HOSTELS [] ={"Nyabundi","Niles","elgon","nyawita","vision","nyawita","across","mabungo","mbwa kali"};
        JList vv=new JList(HOSTELS);
        vv.setBounds(110,200,100,30);
        
        String cities[]={"New York","Nairobi","chicago","Hong Kong","Cairo","Johannersburg","Washington D.C","Lagos","Sidney","London","Toronto","Dubai"};
        JComboBox cc=new JComboBox(cities);
        cc.setBounds(110,250,100,30);
        
        JCheckBox cx=new JCheckBox("benz C180");
        cx.setBounds(230,100,100,30);
        JCheckBox dj=new JCheckBox("Audi A5");
        dj.setBounds(230,150,100,30);
        JCheckBox dz=new JCheckBox("bmw m5");
        dz.setBounds(230,200,100,30);
        
        JRadioButton cj =new JRadioButton ("male");
        cj.setBounds(110,300,100,30);
        JRadioButton vp=new JRadioButton("female");
        vp.setBounds(230,300,100,30);
        JRadioButton mk=new JRadioButton("transgender");
        mk.setBounds(330,300,100,30);
        
        
        
                
        
        maseno.add(mk);
        maseno.add(vp);
        maseno.add(cj);
        maseno.add(xm);
        maseno.add(xj);
        maseno.add(xa);
        maseno.add(aa);
        maseno.add(aj);
        maseno.add(vv);
        maseno.add(vx);
        maseno.add(cc);
        maseno.add(cx);
        maseno.add(dj);
        maseno.add(dz);
        maseno.setSize(600,600);
        maseno.setLayout(null);
        maseno.setVisible(true);
    }
    
}
