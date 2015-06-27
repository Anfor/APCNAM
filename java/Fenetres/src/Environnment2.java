import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Environnment2 {

	
	JFrame fenetre = new JFrame("une fenetre");
	JButton bouton = new JButton("cliquer ici");
	JTextField monTexte = new JTextField("ecrir ici",20);
	
Environnment2 (){
	
	fenetre.getContentPane().setLayout(new FlowLayout());
	fenetre.getContentPane().add(bouton);
	fenetre.getContentPane().add(monTexte);
	fenetre.pack();
	fenetre.show();
	
}
}

