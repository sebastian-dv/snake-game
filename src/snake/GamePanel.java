package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings({"serial", "unused"})
public class GamePanel extends JPanel {
	
	private static final Dimension WINDOW_SIZE = new Dimension(700, 700);
	private static final int UNIT_SIZE = 50;
	private static final int TOTAL_UNITS = 196;
	private static final Color BLACK = Color.black;
	Random random;
	int applesEaten = 0;
	char direction = 'R';
	boolean running = false;
	

	public GamePanel() {
		this.setPreferredSize(WINDOW_SIZE);
		this.setBackground(BLACK);
	}
	
	public void startGame() {
		
	}
	
	public void spawnApple() {
		
	}
	
	public void checkApple() {
		
	}
	
	public void checkCollision() {
		
	}
	
	public void move() {
		
	}
	
	
}
