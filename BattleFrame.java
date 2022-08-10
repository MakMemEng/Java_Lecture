import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BattleFrame extends JFrame{
     private JPanal messagePanal;
     private JPanal imagePanal;
     private JPanel p;
     private ImageIco icon;
     private JLabel imageLabel;
     private JLabel messageLabel;

     public BattleFrame(){
        super("êÌì¨");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 550);
 
        GridBagConstrains gbc = new GridBagConstrains();
        GridBagLayout layout = new GridBagLayout();
 
        p = new JPanel();
        p.setLayout(layout);

        messagePanal = new JPanel;
        messageLabel = new JLabel();
        messagePanal.add(messageLabel, BorderLayout.CENTER);

        imagePanal = new JPanel();
        icon = new ImageIcon();
        imageLabel = new JLabel();
        imagePanal.add(imageLabel, BorderLayout.CENTER);

        gbc.gridx = 0; gbc.gridy = 0;
        layout.setConstraints(messagePanel, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        layout.setConstraints(imagePanel, gbc);

        p.add(messagePanel);
        p.add(imagePanel);
        getContentPane().add(p, BorderLayout.CENTER);
      
        setVisible(true);
     }

      public void setMessageText(String str){
         messageLabel.setText(str);
      }

      public void setImage(Image image){
         icon = new ImageIcon(image);
         imageLabel.setIcon(icon);
      }

}

     