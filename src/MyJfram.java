import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by IntelliJ IDEA.
 * User: Student
 * Date: 5/7/14
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyJfram extends JFrame
{
    private JButton button;
    private JTextField txt1;
    private JButton button1;
    private JButton button2;

    public MyJfram(String title)
   {
     super(title);
     setBounds(90,90,550,280);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     JPanel jp = new JPanel();
     txt1 = new JTextField("This is a text!");
     txt1.setColumns(14);
     button = new JButton("In The Name Of God!");
     button1 = new JButton("Besmelahe Rahmane Rahim!");
     button2 = new JButton("Be Name Khoda!");
     button.setSize(200,180);
     jp.setLayout(new GridLayout(3, 1));
     jp.add(button);
     jp.add(button1);
     jp.add(button2);
     jp.add(txt1);
     add(jp);
     setVisible(true);

     button.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(MouseEvent e) {
            txt1.setText(button.getText());
         }

         @Override
         public void mousePressed(MouseEvent e) {
             //To change body of implemented methods use File | Settings | File Templates.
         }

         @Override
         public void mouseReleased(MouseEvent e) {
             //To change body of implemented methods use File | Settings | File Templates.
         }

         @Override
         public void mouseEntered(MouseEvent e) {
             //To change body of implemented methods use File | Settings | File Templates.
         }

         @Override
         public void mouseExited(MouseEvent e) {
             //To change body of implemented methods use File | Settings | File Templates.
         }
     });

 /*      button1.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
                txt1.setText(button.getText());
           }
       }); */
/*     JButton button1 = new JButton("Be Name Khoda!");
     button1.addActionListener(new ActionListener()
     {
         @Override
         public void actionPerformed(ActionEvent e)
         {
           txt1.setText(button1.getText());
         }
     });  java: local variable button1 is accessed from within inner class; needs to be declared final */

       button1.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
            txt1.setText(button1.getText());

           }
       });
       button2.addMouseListener(new MyMouseListener());
   }


 }

