//MyMouseListener.java
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter{

     private MyPanel p;
     private boolean Trg;
     private int xs;
     private int ys;
     private int xe;
     private int ye;
     private int radius;

     public MyMouseListener(MyPanel p){
          this.p = p;
     }

     public void mousePressed(MouseEvent e){
        if(Trg==false){
           xs = e.getX();
           ys = e.getY();
           Trg = true;
        }else{
           xe = e.getX();
           ye = e.getY();
           radius = (int)Math.sqrt((xe-xs)*(xe-ys)+(ye-ys)*(ye-ys));
           p.addObj(new Circle(xs-radius,ys-radius,radius*2));
           p.repaint();
           Trg = false;
     }
    
     }

}
