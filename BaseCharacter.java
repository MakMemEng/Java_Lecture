public abstract class BaseCharacter implements Character{
   protected String name;
   protected int hp;
   protected int power;

   public BaseCharacter(String name, int hp, int power){
      this.name = name;
      this.hp = hp;
      this.power = power;
    }

   public String getName(){
      return this.name;
   }

   public void attack(Character h){
      System.out.println("\n"+name+"の攻撃！");
      h.attacked(power);
   }
   //魔法のメソッド
   public abstract void magic(Character h);
   //ダメージのメソッド
   public void attacked(int power){
      System.out.println(name+"は"+power+"ダメージを受けた。");
      this.hp -= power;
      if(deathStatus()){
           this.hp = 0;
           System.out.println(name+"は死んだ。");
      }
   }

    //回復のメソッド
    public void recover(int hp){
        System.out.println(name+"のHPは"+hp+"回復した。");
        this.hp += hp;
    }

    public boolean deathStatus(){
       if(hp <= 0)
          return true;
          return false;
    }

    public String toString(){
        return name+"のHP: "+hp;
    }


}
