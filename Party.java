import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.io.IOException;

public class Party{
   private Hero hero;
   private Fighter fighter;
   private Wizard wizard;
   private Figure fig;
   public Party(Hero h, Fighter f, Wizard w, Figure fig){
       this.hero = h;
       this.fighter = f;
       this.wizard = w;
       this.fig = fig;
   }

   public Hero getHero(){
     return hero;
   }
  
   public Fighter getFighter(){
     return fighter;
   }
    
   public Wizard getWizard(){
     return wizard;
   }

   public Figure getFigure(){
      return fig;
   }

   public void move(int dx, int dy){
       fig.move(dx, dy);
   }

   public int getX(){
      return fig.getX();
   }

   public int getY(){
      return fig.getY();
   }

   public boolean deathParty(){
      if(hero.deathStatus() == true &&
         fighter.deathStatus() == true &&
         wizard.deathStatus()== true)
          return true;
      else
          return false;
   }

}
