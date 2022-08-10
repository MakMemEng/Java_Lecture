import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class AdminWorld{
    private final int UP= 38;
    private final int DOWN = 40;
    private final int LEFT = 37;
    private final int RIGHT = 39;

    private MyFrame frame;
    private Party p;
    private ArrayList<Enemy> eList;

    private CharacterManager cm;

    public AdminWorld(CharacterManager cm){
        this.cm = cm;
        this.p = cm.getParty();
        eList = new ArrayList<Enemy>();
        eList = cm.getEnemyList();
        frame= new MyFrrame(this);
    } 

    public void initialize(){
         frame.addObj(p.getFigure());
         for(Enemy e: eList){
             frame.addObj(e.getFigure());
         }
         frame.repaint();
    }

    public void presed(int keyCode){
       System.out.println("ÅuPush"+keyCode+"Åv");

   
              switch(keyCode){
              case UP: p.move( 0, -10); break;
              case DOWN: p.move( 0, 10); break;
              case LEFT: p.move(-10, 0); break;
              case RIGHT: p.move( 10, 0); break; 
              default: break;
              }

          Random r = new Random(); 
            for(Enemy e: eList){
              switch(r.nextInt(5)){
              case 0: e.move( 0, -10); break;
              case 1: e.move( 0, 10); break;
              case 2: e.move(-10, 0); break;
              case 3: e.move( 10, 0); break; 
              default:break;
              }
           }
            
          frame.repaint();
         }


      public static void main(String args[]){
          CharacterManager cm = new CharacterManager();
          cm.defaultSetting();
          AdminWorld aw = new AdminWorld(cm);
          aw.initialize();
      }
}
