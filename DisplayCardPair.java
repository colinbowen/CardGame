import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
 
/**
 * Displays pairs of cards
 * 
 * @author Colin Johnson
 * @version 2013-01-31
 */
public class DisplayCardPair extends JPanel
{
    JFrame frame;
    Card c1, c2;
    BufferedImage img1,img2;
    
    public DisplayCardPair()
    {
        setPreferredSize(new Dimension(1090,766));
        frame = new JFrame("Card Viewer");
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void setCards(Card c1p, Card c2p)
    {
        c1 = c1p; 
        c2 = c2p;
        loadImages();
        repaint();
    }

    private void loadImages() 
    {
       try 
       {
           String filename1 = cardToFilename(c1);
           System.out.println("Filename: "+filename1);
           img1 = ImageIO.read(new File("PNG-cards-1.3"+File.separator+filename1));
           String filename2 = cardToFilename(c2);
           System.out.println("Filename: "+filename2);
           img2 = ImageIO.read(new File("PNG-cards-1.3"+File.separator+filename2));
       } catch (IOException e) {}
    }
    
    public void blankWindow()
    {
        img1 = null;
        img2 = null;
        repaint();
    }
    
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawImage(img1, 20, 20, null);
        g.drawImage(img2, 540, 20, null);
    }  
    
  private static String cardToFilename(Card c)
  {
      Suit s = c.getSuit();
      Value v = c.getValue();
      String ans = new String();
      boolean jqk = false;
      switch (v)
      {
         case ACE: ans += "ace"; break;
         case TWO: ans += "2"; break;
         case THREE: ans += "3"; break;
         case FOUR: ans += "4"; break;
         case FIVE: ans += "5"; break;
         case SIX: ans += "6"; break;
         case SEVEN: ans += "7"; break;
         case EIGHT: ans += "8"; break;
         case NINE: ans += "9"; break;
         case TEN: ans += "10"; break;
         case JACK: ans += "jack"; jqk=true;  break;
         case QUEEN: ans += "queen"; jqk=true; break;
         case KING: ans += "king"; jqk=true; break;
      }
      switch (s)
      {
          case HEARTS: ans += "_of_hearts"; break;
          case CLUBS: ans += "_of_clubs"; break;
          case DIAMONDS: ans += "_of_Diamonds"; break;
          case SPADES: ans += "_of_Spades"; break;
      }
      ans += (jqk?"2":"")+".png";
      return ans;
    }
}
