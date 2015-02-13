#include <stdio.h>
#include <stdlib.h>
#define L 10
#define C 15

void init (int tab[L][C],int newTab[L][C])
{
    /*  @param : 2 tableaux d'entiers
        @retour: initialise les 2 tableaux et remplit avec les cellules vivantes.
        @pre-condition: les tableaux doivent contenir des entiers positifs
        @post-condition: il donne les deux tableaux remplies avec cellules vivants.
        @variable local: les nombres de cellules, et les coordones des cellules.
        */
    int nbCell, ligne, colonne, i,j;

    printf("Afficher nombres de cellules vivantes \n");
    scanf("%d", &nbCell);

        for (i=0; i<L; i++)
        {
            for (j=0; j<C; j++)
            {
                tab[i][j]=0;
                newTab[i][j]=0;
            }
        }

        for (i=0; i<nbCell;i++)
        {

                printf("quelle ligne de 0 à 9 \n");
                scanf("%d", &ligne);
                printf("quelle colonne de 0 à 14 \n");
                scanf("%d", &colonne);
 if ((ligne<0) | (ligne>10) | (colonne <0) | (colonne >15))
           {

            printf("reentrez le nombre\n");
            }
            }



            tab [ligne][colonne]=1;
            newTab [ligne][colonne]=1;


        }

int nb_voisin(int tab [L][C],int x,int y)
{/*  @param : 1 tableau d'entier et les coordonnes des cellules.
        @retour: il retour un entier avec le nombre des voisins des cellules.
        @pre-condition: le tableau doit contenir des entiers positifs et les coordonnes être dedans le tableau.
        @post-condition: il donne un entier positif.
        @variable local: les valeurs des coordonnes des alentours des cellules, et le nombre de voisin.
        */
int val, val2, voisin = 0;

    for (val= x-1; val <= x+1; val++)
    {
        for(val2= y-1; val2 <= y+1; val2++)
        {
            if(tab[val][val2]==1)
            {
                voisin ++;

            }
        }
    }

return (voisin-1);
}

void affichage(int tab[L][C])
{/*  @param : 1 tableau d'entiers
        @retour: c'est une procedure qui affiche le tableu par l'ecran.
        @pre-condition: le tableau doit contenir des entiers positifs
        @post-condition: il affiche le  tableau rempli avec cellules vivants et espaces vides.
        @variable local: les entiers pour le boucle.
        */
    int i,j;
    for(j=0;j<C;j++)
    {
        printf("\n");
        for(i=0;i<L;i++)
        {
            if(i==0)
            {
                printf("|");
            }
            if(tab[i][j]==1)
            {
                printf("| X |");
            }
            else
            {
                printf("|   |");
            }
             if(i==9)
            {
                printf("|");
            }

        }
    }
}

void new_gen(int ancienTab[L][C], int newTab[L][C])
{/*  @param : 1 tableau d'entiers
        @retour: c'est une procedure qui affiche le tableu par l'ecran.
        @pre-condition: le tableau doit contenir des entiers positifs
        @post-condition: il affiche le  tableau rempli avec cellules vivants et espaces vides.
        @variable local: les entiers pour le boucle.
        */
    int i,j,x,y,voisin;


    for(x=0;x<L;x++)
    {
        for(y=0;y<C;y++)
        {

                voisin=nb_voisin(ancienTab,x,y);

                    if (voisin<2 || voisin >3 && ancienTab[x][y]==1)
                    {
                        newTab[x][y]=0;
                    }
                    if(voisin==3 && ancienTab[x][y]==0)
                    {
                         newTab[x][y]=1;
                    }



        }
    }

}


int main()
{/*  @param : les dimensions du tableau L et C, definies a l'avance.
        @retour: Aucun
        @pre-condition: Aucun.
        @post-condition: Aucun.
        @variable local: Aucun.
        */

   int tab [L][C];
   int newTab [L][C];
   init(tab,newTab);



new_gen(tab,newTab);
    affichage(newTab);

    return 0;
}
