import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;





public class sumGUI{
    public static void main (String args[]){
         Addition obj=new Addition();
        

    }
}
class Addition extends JFrame implements ActionListener{
/**
 * 
 */
 JTextField j1;
  JTextField j2;
  JButton b;
  JLabel l;
public Addition(){
   setLayout(new FlowLayout());
   j1=new JTextField(6);
    j2=new JTextField(6);
 b=new JButton("ok");
b.addActionListener(this);
l=new JLabel("Result");
    add(j1);
      add(j2);
      add(b);
      add(l);
 setLayout(new FlowLayout());//
setVisible(true);//to use everywhere..
setSize(400,400);//
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//

}
public void actionPerformed(ActionEvent as){
int num1=Integer.parseInt(j1.getText());
int num2=Integer.parseInt(j2.getText());
int sum=num1+num2;
l.setText(sum  + "");
}
}
