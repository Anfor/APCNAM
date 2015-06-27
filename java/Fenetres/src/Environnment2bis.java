
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Environnment2bis {
	
	JFrame fenetre = new JFrame("une fenetre");
	JButton bouton = new JButton("cliquer ici");
	JTextField monTexte = new JTextField("ecrir ici",20);
	
	Environnment2bis (){
		
		fenetre.getContentPane().setLayout(new GridLayout(2,1));
		fenetre.getContentPane().add(bouton);
		fenetre.getContentPane().add(monTexte);
		fenetre.pack();
		fenetre.show();
		
		
	}

}
