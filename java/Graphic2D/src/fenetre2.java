import javax.swing.JFrame;


public class fenetre2 extends JFrame {
	
	public fenetre2(){
		
		this.setTitle("Ma premiere fenetre java");
		this.setSize(100, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new panneau());
		this.setVisible(true);
	}

}
