public class Enemy extends BaseCharacter{
   private Figure fig;
   private String imFrame;

   public Enemy(String name, int hp, int power, Figure fig, String imFrame){
       super(name, hp, power);
       this.fig = fig;
       this.imFrame = imFrame;
   }

   public void magic(Character e){
       System.out.println(name+"‚Í‰ñ•œ–‚–@‚ğ¥‚¦‚½B");
       e.recover(20);
   }

   public Figure getFigure(){
       return fig;
   }

   public move(int dx, int dy){
        fig.move(dx, dy);
   }

   public int getX(){
         return fig.getX();
   }

   public int getY(){
         return fig.getY();
   }

   public String getFrame(){
         return imFrame;
   }

}

