public class Fighter extends BaseCharacter{
   public Fighter(String name, int hp, int power){
       super(name, hp, power);
   }

   public void magic(Character h){
       System.out.println(name+"�͉񕜖��@���������B");
       System.out.println("�������A"+name+"�͖��@���g���Ȃ������B");
   }
   

    public boolean deathStatus(){
       if(hp <= 0)
          return true;
          return false;
    }
  
  
}
