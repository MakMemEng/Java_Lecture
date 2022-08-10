import java.util.Random;
import java.util.ArrayList;

public class CharacterManager{
    private Hero h;
    private Fighter f;
    private Wizard w;
    private Party p;
    private Enemy[] e;
    private ArrayList<Enemy> eList;

    public CharacterManager(){}

    public void defaultSetting(){
      Random r = new Random();
      eList = new ArrayList<Enemy>();

    //�L�����N�^�ƃp�[�e�B�̃I�u�W�F�N�g��
      h = new Hero("�E��",50,35);
      f = new Fighter("��m",40,20);
      w = new Wizard("���@�g��",40,15);
      p = new Party(h, f, w);
      
      e = new Enemy[]{
          new Enemy("���΂�A", 40, 30, new Rectangle(0,0),"enemy1.png"),
          new Enemy("���΂�B", 50, 20, new Rectangle(0,0),"enemy2.png"),
          new Enemy("���΂�C", 45, 10, new Rectangle(0,0),"enemy3.png"),
          new Enemy("���΂�D", 65, 20, new Rectangle(0,0),"enemy4.png"),
          new Enemy("���΂�E", 70, 30, new Rectangle(0,0),"enemy5.png"),
         };

       for(Enemy x: e){
           x.move((r.nextInt(29))*10, (r.nextInt(29)*10));
       }
 
       for(Enemy x: e){
           eList.add(x);
       }
    }

    public Party getParty(){
       return p;
    }

    public Enemy[] getEnemy(){
       return e;
    }
   
    public ArrayList<Enemy> getEnemyList(){
        return eList;
    }
}