public class Hero extends BaseCharacter{
   public Hero(String name, int hp, int power){
       super(name, hp, power);
   }

   public void magic(Character h){
       System.out.println(name+"‚Í‰ñ•œ–‚–@‚ğ¥‚¦‚½B");
       h.recover(10);
      
   }
   
    public boolean deathStatus(){
       if(hp <= 0)
          return true;
          return false;
    }
}