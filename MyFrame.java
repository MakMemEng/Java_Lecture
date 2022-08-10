import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.util.Random;

public class MyFrame extends JFrame{
    private MyPanel panel;

      public MyFrame(AdminWorld aw){
         super("ÉQÅ[ÉÄRPG");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(300,300);
         panel = new MyPanel(aw);
         add(panel, BorderLayout.CENTER);
         setVisible(true);
         }
 
       public void addObj(Figure f){
          panel.addObj(f);
       }
}
