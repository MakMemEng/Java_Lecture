public class Wizard extends BaseCharacter{
   public Wizard(String name, int hp, int power){
       super(name, hp, power);
   }

   public void magic(Character e){
       System.out.println(name+"‚ÍUŒ‚–‚–@‚ğ¥‚¦‚½B");
       e.attacked(20);
       
   }

    public boolean deathStatus(){
       if(hp <= 0)
          return true;
          return false;
    }

}
