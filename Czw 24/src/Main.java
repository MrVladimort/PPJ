import java.awt.*;
import java.awt.Graphics.*;

public class Main extends Frame{
	public static void main(String[] args) {
		System.out.println("LoL");
		new Main();
	}
	
	public Main(){
		setSize(640, 480);
		setVisible(true);
	}
	
	public void paint (Graphics g){
		System.out.println("Teraz rysuje");
		
		int r = getWidth() < getHeight() ? getWidth()/2 : getHeight()/2;
		g.fillOval(getWidth()/2-r, getHeight()/2-r, 2*r, 2*r);
	}
}