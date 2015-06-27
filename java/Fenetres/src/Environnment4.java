import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Environnment4 {
	
	//la fenetre 
		JFrame fenetre = new JFrame("une fenetre d'example");
		
		//les elements principaux
		
		JMenuBar barreDeMenus = new JMenuBar();
		JPanel pHaut  = new JPanel();
		JPanel pbas   = new JPanel();
		
		// les boutons
		
		JButton bouton1 = new JButton("Rouge");
		JButton	bouton2 = new JButton("Bleu");
		JButton bouton3 = new JButton("Vert");
		JButton	bouton4 = new JButton("Jaune");
		
		//les zones de texte 
		
		JTextArea zone = new JTextArea(3,20);
		JTextArea zoneCentre = new JTextArea(5,50);
		
		//les labels
		
		JLabel label = new JLabel("Une texte");
		
		// les menus
		
		JMenu menuJours = new JMenu("Jours");
		JMenu menuMois = new JMenu("Mois");
		JMenuItem eltLundi = new JMenuItem("Lundi");
		JMenuItem eltMardi = new JMenuItem("Mardi");
		JMenuItem eltDimanche = new JMenuItem("Dimanche");
		JMenuItem eltMai = new JMenuItem("Mai");
		JMenuItem eltJuin = new JMenuItem("Juin");
		
		
		Environnment4 (){
			
			pHaut.setLayout(new GridLayout(2,2));
			pHaut.add(bouton1);
			pHaut.add(bouton2);
			pHaut.add(bouton2);
			pHaut.add(bouton3);
			pHaut.add(bouton4);
			
			// panel du bas
			
			pbas.setLayout(new FlowLayout());
			pbas.add(label);
			pbas.add(zone);
			
			//menu
			
			menuJours.add(eltLundi);
			menuJours.add(eltMardi);
			menuJours.add(eltDimanche);
			menuMois.add(eltMai);
			menuMois.add(eltJuin);
			barreDeMenus.add(menuJours);
			barreDeMenus.add(menuMois);
			
			
			// organisation frame
			fenetre.setJMenuBar(barreDeMenus);
			fenetre.getContentPane().setLayout(new BorderLayout());
			fenetre.getContentPane().add(pHaut, BorderLayout.NORTH);
			fenetre.getContentPane().add(zoneCentre,BorderLayout.CENTER);
			fenetre.getContentPane().add(pbas, BorderLayout.SOUTH);
			fenetre.pack();
			fenetre.show();
			
			
		}
		
}
