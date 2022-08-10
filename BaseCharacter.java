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
      System.out.println("\n"+name+"�̍U���I");
      h.attacked(power);
   }
   //���@�̃��\�b�h
   public abstract void magic(Character h);
   //�_���[�W�̃��\�b�h
   public void attacked(int power){
      System.out.println(name+"��"+power+"�_���[�W���󂯂��B");
      this.hp -= power;
      if(deathStatus()){
           this.hp = 0;
           System.out.println(name+"�͎��񂾁B");
      }
   }

    //�񕜂̃��\�b�h
    public void recover(int hp){
        System.out.println(name+"��HP��"+hp+"�񕜂����B");
        this.hp += hp;
    }

    public boolean deathStatus(){
       if(hp <= 0)
          return true;
          return false;
    }

    public String toString(){
        return name+"��HP: "+hp;
    }


}
