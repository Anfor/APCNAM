package tableau;

import java.util.*;
public class tableau {

	public static void main(String[] args) {
		
		// voici un programme principal qui teste les fonctions fusion,
				// indexMin, swap, selectionSortRecursif et mergeSortRecursif
				
		int[] tab1 = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6,
						5, 4, 3, 2, 1 };
				selectionSortRecursif(tab1, 0);
			
				// fonction utilitaire pour affichage
				afficherTableau(tab1);

				// test de mergeSort
				int[] tab2 = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
				tab2 = mergeSortRecursif(tab2);
				afficherTableau(tab2);
			}

			/**
			 * 
			 * @param t1
			 *            un tableau trié dans l'ordre croissant
			 * @param t2
			 *            un tableau trié dans l'ordre croissant
			 * @return un tableau contenant les eléments de t1 avec ceux de t2 tous
			 *         triés dans l'ordre croissant
			 */
	
	public static int[] fusion(int[] t1, int[] t2) {

		int[] t3 = new int[t1.length + t2.length];
		int i = 0;
		int j = 0;
		// arrêt de la boucle une fois l'un des deux tableau est entièrement
		// ajouté à t3
		while (t1.length > i && t2.length > j) {

			if (t1[i] < t2[j]) {
				t3[i + j] = t1[i];
				i++;
			} else {
				t3[i + j] = t2[j];
				j++;
			}
		}
		
		while (i < t1.length) {
			t3[i + j] = t1[i];
			i++;
		}
		
		while (j < t2.length) {
			t3[i + j] = t2[j];
			j++;
		}

		return t3;
	}
	

			/**
			 * Fonction qui retourne l'index du plus petit élément compris entre
			 * indexDebut et la fin du tableau L a recherche du min commence à partir de
			 * indexDebut Exemple : tab = {1, 4, 3} indexMin( tab, 1 ) = 2 car on
			 * s'interesse uniquement à la partie du tableau qui débute à l'index 1
			 * jusqu'à la fin
			 * 
			 * @param tab est un tableau quelconque
			 * @param indexDebut
			 *            l'indice à partir du quel on commence la recherche du plus
			 *            petit elément
			 * 
			 * @return l'index où se trouve l'élement le plus petit du tableau
			 */
	
	public static int indexMin(int[] tab, int indexDebut) {

		int indexMin = indexDebut;
		int i=indexDebut;
for(i=indexDebut+1;i<tab.length;i++)
		if (tab[i]<tab[indexMin]){
			indexMin=i;}
		

		
				// à compléter

		return indexMin;
	}
		
			/**
			 * Permuter les éléments situés à firstIndex et secondIndex dans le tableau
			 * array
			 * 
			 * @param array
			 *            le tableau
			 * @param firstIndex
			 *            indice du premier élément
			 * @param secondIndex
			 *            indice du 2ièm élément
			 * 
			 */
	
	private static void swap(int[] array, int firstIndex, int secondIndex) {
		
		int aux=array[firstIndex];
		array[firstIndex]=array[secondIndex];
		array[secondIndex]=aux;
		
		/*int aux = firstIndex;
		
		firstIndex=secondIndex;
		
		secondIndex=aux;*/

	}

			
			/*
			 * Ceci est une procédure Donc elle se charge de trier les éléments du
			 * tableau Utiliser la fonction indexMin et swap Utiliser un appel récursif
			 * pour trier la suite du tableau
			 * 
			 * @param array
			 * @param startIndex
			 */
		
				/*Trouver l'index du min entre startIndex et la fin
				compléter */
				
				
		
			
	public static void selectionSortRecursif(int[] array, int startIndex) {
		// cas d'arrêt
		if (startIndex >= array.length - 1)
			return;
		// Trouver l'index du min entre startIndex et la fin
				/* compléter */
		int minIndex = indexMin(array,startIndex);
			// Swap => permuter les éléments situés à startIndex et minIndex
		/* compléter */
		swap(array, startIndex, minIndex);
		
		// Récursion => trier le reste du tableau càd : en partant de
		// startIndex+1*/
		selectionSortRecursif(array,startIndex+1);
		

		

		
		/* compléter */

	}

			/**
			 * Se baser sur la selectionSortRecursif(array,startIndex+1); fonction fusion pour implémenter cette fonction
			 * 
			 * @param tab
			 * @return
			 */
	
	public static void afficherTableau(int[] res) {
		String affichage = "";
		for (int i : res) {
			affichage += (i) + " | ";
		}
		System.out.println(affichage);
	}




			public static int[] mergeSortRecursif(int[] array) {
				int[] array1,array2;
				// condition d’arrêt
				if (array.length <= 1)
					return array;
				// séparer en 2 parties
				
				int[] t1 = new int[array.length / 2];
				int[] t2 = new int[array.length - t1.length]; 
				
				for (int i=0;i<t1.length;i++)
				{  t1[i]= array[i];
				}
			
			
				for (int i=t1.length;i<t1.length+t2.length;i++)
				{		t2[i-t1.length]=array[i];	
				}
				

				// trier la premère moitié
				t1 = mergeSortRecursif(t1);
				t2 = mergeSortRecursif(t2);
				// trier la deuxième moitié

				// fusion des deux parties triées
				
				return fusion(t1,t2);
				// changer null par ce qu'il faut renvoyer
			}

		

}






