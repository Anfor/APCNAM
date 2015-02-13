#include <stdio.h>
#include <stdlib.h>
#include <time.h>

double timepoint(clock_t s, clock_t e);
double ins=0;
double sel=0;
double qck=0;

void swap (long *a,long *b)
        {   int aux;
           aux=*a;
           *a=*b;
           *b=aux;
           }

double timepoint(clock_t s, clock_t e){

    double total=(e-s);
    total=1000*(e-s)/CLOCKS_PER_SEC;
    printf("\nTemps en mili-seconde : %lf\n",total);
    if (total>1000){printf("\nExecute en %lf sec",total/1000); //si le temps est sup 100 ms, on affiche en sec.

    }
    return total;

}

void remplir(long n)
{
srand(time(0));
    long i;
    long t[n];
  for (i = 0; i < n; i++)
    {
     t[i]= rand ()%1000000;
  }

copy(n,t);
}

void copy (long n,long t[])
{
    long t2[n],i;

for(i=0;i<n;i++)
{
   t2[i] =t[i];
}

selection(n,t,t2);
}


void selection (long n,long t[],long t2[])
{
    int s;
    ahzme:

    printf("Choisir son tri:  \n\n");
    printf("1- pour tri par selection.\n");
    printf("2- pour tri par inserction.\n");
    printf("3- pour tri par Quicksort.\n");
    scanf ("%d",&s);



    switch(s)
    {       clock_t start,end;

        case 1: printf ("tri par selection\n");
                sleep(1);
                system("cls");
                 afficher(n,t);
                 system ("pause");
                 system("cls");
                start=clock();
                printf("Attendez, we are sorting!!\n");
                seleccion(n,t);
                end=clock();
                afficher(n,t);
                sel= timepoint(start,end);
                system ("pause");
                system("cls");
                break;
        case 2: printf ("tri par inserction\n");
                sleep(1);
                system("cls");
                 afficher(n,t);
                 system ("pause");
                 system("cls");
                start=clock();
                 printf("Attendez, we are sorting!!\n");
                inserction(n,t);
                end=clock();
                afficher(n,t);
                ins= timepoint(start,end);
                printf("tiempo %lf\n",ins);
                system ("pause");
                system("cls");
                break;
        case 3: printf ("tri par quicksort");
                sleep(1);
                system("cls");
                 afficher(n,t);
                 system ("pause");
                 system("cls");
                start=clock();
                printf("Attendez, we are sorting!!\n");
                quick(t,0,n-1);
                end=clock();
                afficher(n,t);
                qck= timepoint(start,end);
                system ("pause");
                system("cls");
                break;

    default:
        printf("vous avez entrez un nombre incorrect, repetez svp\n");
    sleep(1);
    system("cls");
    goto ahzme;

     break;

    }
    {


    samuel: ;
char c;
printf("Voulez vous recommencer le tri? \n");
printf("o pour oui.\n");
printf("n pour non.\n");
printf("a pour afficher les resultats stockes.\n");
scanf(" %c", &c);

 system("cls");

switch (c)
{
case 'o': case 'O':
 copy(n,t2);

    break;
case 'n': case 'N':
printf("Temp de tri pour inserction pour un tableau de %d cases: \n",n,ins);
    printf("Au revoir!\n");
   sleep(1);
    system("cls");
       break;

case 'a': case 'A':

comparer(sel,ins,qck,n);

    break;

    default :
    printf("Nombre incorrect, repetez svp\n");
    sleep(1);
    system("cls");
    goto samuel;
       break;

   }
    }
return 0;
}
comparer (double sel,double ins,double qck,long n)
{
   printf("Temp de tri pour inserction pour un tableau de %d cases: %lf\n",n,ins);
   printf("Temp de tri pour selection pour un tableau de %d cases: %lf\n",n,sel);
    printf("Temp de tri pour quicksort pour un tableau de %d cases: %lf\n",n,qck);
}

void afficher(long n,long t[])
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("[%d]",t[i]);
    }
    printf("\n");
}
void inserction (long n,long tab[])
{
long i;

long j;

{for (i = 1 ; i <= n - 1; i++) {
    j = i;

    while ( j > 0 && tab[j] < tab[j-1]) {
 swap(tab +j,tab+(j-1));

      j--;
     }
  }

}
system("cls");

}

void seleccion (long n,long tab[])
{
    long i,j,min=0;

  for(i=0;i<(n-1);i++)
       {
           min = i;

      for(j=i+1;j<n;j++)
      {    if(tab[min]>tab[j])
            min=j;
              }
      if(min!=i)
      {
          swap(tab+i,tab+min);
      }
   }

 system("cls");


}

void quick(long tab[], long prim, long dern)
{
    long pvt,indpvt,i,chg;

    {

    if(dern > prim)
    {

    {
        long indpvt= (prim + dern) / 2;
        long pvt = tab[indpvt];

        swap(tab + indpvt, tab + dern);
        for(i=chg=prim;i<dern;i++)
        {
            if(tab[i]< pvt)
            {
                swap(tab + i,tab  +chg);
                chg++;

            }
        }

        swap(tab + chg,tab + dern);
        quick(tab,prim,chg-1);
        quick(tab,chg +1,dern);
    }
}
    }

}

int main (void){


long i;
long n;
angel:
printf("Entrez le nombre d'elements\n");//pide cuantos elementos queremos en el vector comprobar que si no introducimos ningún número guarda el max
 scanf("%d",&n);
 if(n<0)
 {
  printf("vous avez entrez un nombre incorrect, repetez svp\n");
    sleep(1);
    system("cls");
    goto angel;
 }

 remplir(n);


//system ("pause");


  return 0;
}// fin del principal






