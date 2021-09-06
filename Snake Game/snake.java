package snake_game;
import javax.swing.*;
public class snake extends JFrame{
     snake()
    {
        Board b=new Board();
        add(b);
        pack();
        setLocationRelativeTo(null);
        setTitle("Snake Game");
        setResizable(false);
    }
    public static void main(String[] args)
    {
       new snake().setVisible(true); 
    }
}
