import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class KeyListnerEX extends Frame implements KeyListener{
String keys="";
int size = 1;
  Label box;
  TextArea tx;
  KeyListnerEX(){
      box=new Label();
      box.setBounds(20,50,200,20);
      tx=new TextArea();
      tx.setBounds(20,80,300, 300);
      tx.addKeyListener(this);

      add(box);add(tx);
      setSize(400,400);
      setLayout(null);
      setVisible(true);
  }
    @Override
    public void keyPressed(KeyEvent e) {
      keys += e.getKeyChar();
      //System.out.println(keys);
      String[] words= keys.split("\\s");
      //System.out.println(Arrays.toString(words));
      System.out.println(size);
      System.out.println(words.length);
      if(words.length>size){
        size+=1;
        System.out.println(words[(size-2)]);
      }
      box.setText("words: "+words.length+" key strokes:  "+ (keys.length()+1));
      System.out.println("key pressed: "+ e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e) {
      System.out.println("key realsed: "+ e.getKeyChar());
      if(e.getKeyChar()==KeyEvent.VK_ENTER){System.exit(0);}

    }
    @Override
    public void keyTyped(KeyEvent e) {
      System.out.println("key typed: "+ e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListnerEX();
    }
}
