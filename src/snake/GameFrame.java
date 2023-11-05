package snake;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {

	public GameFrame() {
		this.add(new GamePanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Snake Game");
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
