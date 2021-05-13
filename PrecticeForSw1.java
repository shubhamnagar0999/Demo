import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Cursor;

class Super{
   JFrame jf = new JFrame();
   ImageIcon im = new ImageIcon("P:/PD/2.jpg");
   Font  f = new Font("Book Antiqua",Font.PLAIN,15);
   JLabel jl = new JLabel("Enter");
    Super(){
        jf.setVisible(true);
   	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setBounds(500,150,300,500);
        jf.setIconImage(im.getImage());
	jf.setTitle("Phone");
        //jf.setResizable(false);
	 
	jf.setLayout(new FlowLayout());
	
	
	//Color clr = new Color();
        //jf.add(jl);
	
	
	//Container c = jf.getContentPane();
	//c.setBackground(Color.GREEN);
	
	jl.setFont(f);	

	//ImageIcon im1 = new ImageIcon("P:/PD/2.jpg");
	
	Cursor cr = new Cursor(Cursor.HAND_CURSOR);
	

	JButton jb = new JButton("Hellow");
	//jb.setSize(im1.getIconWidth,im1.getIconHeigth);
	
	jf.add(jb);
	jb.setCursor(cr);
	//jb.setEnabled(false);
	//jb.setVisible(false);
	jb.setForeground(Color.RED);
	jb.setBackground(Color.BLUE);
 	
	
   }
    
}

public class PrecticeForSw1{
    public static void main(String[] args){
        Super Su = new Super();
    }
}