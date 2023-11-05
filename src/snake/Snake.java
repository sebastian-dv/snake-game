package snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Snake {
	private static final int UP_ARROW = KeyEvent.VK_UP;
	private static final int DOWN_ARROW = KeyEvent.VK_DOWN;
	private static final int RIGHT_ARROW = KeyEvent.VK_RIGHT;
	private static final int LEFT_ARROW = KeyEvent.VK_LEFT;
	private static final int W = KeyEvent.VK_W;
	private static final int A = KeyEvent.VK_A;
	private static final int S = KeyEvent.VK_S;
	private static final int D = KeyEvent.VK_D;
	char direction = 'R';
	int bodyParts = 4;
	
	public Snake() {
		
	}
	
	public class SnakeKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case UP_ARROW:
					direction = 'U';
					break;
				case DOWN_ARROW:
					direction = 'D';
					break;
				case RIGHT_ARROW:
					direction = 'R';
					break;
				case LEFT_ARROW:
					direction = 'L';
					break;
				case W:
					direction = 'U';
					break;
				case A:
					direction = 'L';
					break;
				case S:
					direction = 'D';
					break;
				case D:
					direction = 'R';
					break;
			}
		}
	}
}
