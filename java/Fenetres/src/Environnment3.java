import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Environnment3 {
	
	//la fenetre 
	JFrame fenetre = new JFrame("une fenetre d'example");
	//les panneaux
	
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
	
	Environnment3(){
		
		pHaut.setLayout(new GridLayout(2,2));
		pHaut.add(bouton1);
		pHaut.add(bouton2);
		pHaut.add(bouton2);
		pHaut.add(bouton3);
		pHaut.add(bouton4);
		

		bouton1.addActionListener(new BoutonListener());
		bouton2.addActionListener(new Bouton2Listener());
		bouton3.addActionListener(new Bouton3Listener());
		bouton4.addActionListener(new Bouton4Listener());
		
		
	// panel du bas
		
		pbas.setLayout(new FlowLayout());
		pbas.add(label);
		pbas.add(zone);
		
		// organisation frame
		
		fenetre.getContentPane().setLayout(new BorderLayout());
		fenetre.getContentPane().add(pHaut, BorderLayout.NORTH);
		fenetre.getContentPane().add(zoneCentre,BorderLayout.CENTER);
		fenetre.getContentPane().add(pbas, BorderLayout.SOUTH);
		fenetre.pack();
		fenetre.show();
		
		
		
	}
	
	class BoutonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			zone.setText("Vous avez clické sur le bouton 1");
			
		}
		
		
	}
	
	class Bouton2Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText("Vous avez clické sur le bouton 2");
			
		}
		
		
	}
	class Bouton3Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Vous avez clické sur le bouton 3");
			
		}}
		
		class Bouton4Listener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				zone.setText("Vous avez clické sur le bouton 4");
				
			}
			}
		}
	
	

