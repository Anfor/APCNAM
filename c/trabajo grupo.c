#include <stdio.h>
#include <stdlib.h>
#include <time.h>//tiempoejecución
#include <windows.h>//para el color
//#define cambio(type, a, b) {type t = a; a = b; b = t;}

double timepoint(clock_t s, clock_t e);

void swap (int *a,int *b)
        {   int aux;
           aux=*a;
           *a=*b;
           *b=aux;

           }

double timepoint(clock_t s, clock_t e){
    double total=(e-s);
    total=1000*(e-s)/CLOCKS_PER_SEC;
    printf("\nTemps en mili-seconde : %lf\n",total);
    if (total>1000){                              //si le temps est sup 100 ms, on affiche en sec.
        printf("\nExecute en %lf sec",total/1000);
    }
}

void remplir_a(int n)
{
srand(time(0));
 int i;
    int t[n];
  for (i = 0; i < n; i++)
    {
     t[i]= rand ()%100;
  }

copy(n,t);
}

void remplir_b(int n)
{
srand(time(0));
 int i;
    int t[n];
  for (i = 0; i < n; i++)
    {
     t[i]= rand ()%1000000;
  }
copy(n,t);
}
void copy (int n,int t[])
{
    int t2[n],i;

for(i=0;i<n;i++)
{
   t2[i] =t[i];
}
selection(n,t,t2);
}

void selection (int n,int t[],int t2[])
{
    char s;
    ahzme:

    printf("Choisir son tri:  \n\n");
    printf("1- pour tri par selection. (Impossible d'afficher)\n");
    printf("2- pour tri par selection animé.(MAX 20 elements\)\n");
    printf("3- pour tri par inserction.(Impossible d'afficher)\n");
    printf("4- pour tri par inserction animé.\(MAX 20 elements\)\n");
    printf("5- pour tri par Quicksort.(Impossible d'afficher)\n");
    printf("6- pour tri par Quicksort animé.(MAX 20 elements\)\n");
    scanf ("%d",&s);

    if ((s<1)||(s>6)){

    printf("vous avez entrez un nombre incorrect, repetez svp\n");
    sleep(1);
    system("cls");
    goto ahzme;
    }
  /*     int t2[n],i;
for(i=0;i<n;i++)
{
   t2[i] =t[i];
}*/


    switch(s)
    {       clock_t start,end;
        case 1: printf ("tri par selection\n");
                sleep(1);
                system("cls");
                start=clock();
                printf("Attendez, we are sorting!!\n");
                seleccion_b(n,t);
                 end=clock();
                timepoint(start,end);
                break;
        case 2: printf ("tri par selection animé\n");
                sleep(1);
                system("cls");
                start=clock();
                seleccion_a(n,t,t2);
                 end=clock();
                timepoint(start,end);
                break;
        case 3: printf ("tri par inserction\n");
                sleep(1);
                system("cls");
                start=clock();
                 printf("Attendez, we are sorting!!\n");
                inserction_b(n,t);
                end=clock();
                timepoint(start,end);
                break;
        case 4: printf ("tri par inserction animé\n");
                sleep(1);
                system("cls");
                start=clock();
                inserction_a(n,t,t2);
                end=clock();
                timepoint(start,end);
                break;
        case 5: printf ("tri par quicksort");
                sleep(1);
                system("cls");
                start=clock();
                printf("Attendez, we are sorting!!\n");
                quick_b(t,0,n-1);
                end=clock();
                timepoint(start,end);
                system ("pause");
                break;
        case 6: printf ("tri par quicksort animé\n");
                sleep(1);
                system("cls");
                start=clock();
                quick_a(t,0,n-1,t2,n);
                end=clock();
                timepoint(start,end);
                system ("pause");
                break;

    }


}


void mostrar1 (int tab [], int n)
{
    color(7);
   printf("avant:  ");

   int k;

    for(k=0;k<n;k++){

printf("[%d]",tab[k]);
    }
    printf("\n");
}

void color(int c)
{
SetConsoleTextAttribute(GetStdHandle (STD_OUTPUT_HANDLE),c);
}

void mostrar2(int tab[], int n,int z,int p)
{       int i;
 //printf("z es %d\n",z);
  printf("apres:  ");

for(i=0;i<n;i++)
    {
       // printf("p=%d ",p);

        if (z==i)
        {//printf("z=%d ",z);
         color(10);
      printf("[%d]",tab[z]);
        color(7);
        }
         else { if (p==i)
        {//printf("p=%d ",p);
         color(12);
      printf("[%d]",tab[p]);
        color(7);
        }
         else{//printf("resto=%d ",i);
   color(7);
      printf("[%d]",tab[i]);

        }
        }


       // system("pause");
}
    printf("\n");
    }



void inserction_a (int n,int tab[],int t2[])
{
int i;
int k;
int z=-2;
int p=-3;
int j,aux;


{for (i = 1 ; i <= n - 1; i++) {
    j = i;
    while ( j > 0 && tab[j] < tab[j-1]) {
   // printf("j=%d i=%d",j,i);
    p=j;
     mostrar1(t2,n);
     mostrar2(tab,n,z,p);
     Sleep(250);
      system("cls");
     //system ("pause");
     p=j;
     z=j-1;
    //printf("z=%d p=%d \n",z,p);
        mostrar1(t2,n);
     mostrar2(tab,n,z,p);
     Sleep(250);
      system("cls");
   //  system ("pause");
        swap(tab +j,tab+(j-1));
        //printf("z=%d p=%d \n",z,p);
        p=j-1;
     z=j;
   /* aux=tab[j];
   tab[j]=tab[j-1];
    tab[j-1]=aux;
*/  //printf("p=%d z=%d\n",p,z);
    mostrar1(t2,n);
     mostrar2(tab,n,z,p);
     Sleep(250);
      system("cls");
     //system ("pause");
        p=j-1;
        z=j;
        j--;
   // printf("p=%d z=%d\n",p,z);
     mostrar1(t2,n);
     mostrar2(tab,n,z,p);
     Sleep(250);
     //system ("pause");
     system("cls");
     }
  }


}


color(7);





}


void inserction_b (int n,int tab[])
{
int i;

int j,aux;

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


void seleccion_a (int n,int tab[],int t2[])
{   int z=-5,p=-3;
    int i,j,min=0,aux;




  for(i=0;i<(n-1);i++)
       { // printf("z=%d ",z);
       // printf("i=%d ",i);
           z=i;
           min = i;
            mostrar1(t2,n);
            mostrar2(tab,n,z,p);
            Sleep(200);
     system("cls");

      for(j=i+1;j<n;j++)
      { //printf("z=%d ",z);
   // printf("j=%d ",j);
    p=j;
    // mostrar2(tab,n,z,p);//
            z=j;
         if(tab[min]>tab[j])
            min=j;
            z=min;

            mostrar1(t2,n);
            mostrar2(tab,n,z,p);
     Sleep(200);
      system("cls");
      }
      if(min!=i)
      {     int a=tab[i];
            int b =tab[min];
    swap(tab+i,tab+min);
        /* aux=tab[i];
         tab[i]=tab[min];
         tab[min]=aux;*/

        z=i;

      }
      mostrar1(t2,n);
      mostrar2(tab,n,z,p);
      Sleep(200);
      system("cls");
     //system ("pause");
   }
   mostrar1(t2,n);
     mostrar2(tab,n,z,p);
     Sleep(200);
     //system ("pause");
     system("cls");

    mostrar1(t2,n);
     mostrar2(tab,n,z,p);




         }


void seleccion_b (int n,int tab[],int t2[])
{   int z,p;
    int i,j,min=0,aux;



  for(i=0;i<(n-1);i++)
       {
           min = i;

      for(j=i+1;j<n;j++)
      {    if(tab[min]>tab[j])
            min=j;
              }
      if(min!=i)
      { swap(tab+i,tab+min);
        /* aux=tab[i];
         tab[i]=tab[min];
         tab[min]=aux;*/
      }

   }


 system("cls");





}



void quick_a(int tab[], int prim, int dern,int t2[],int n)
{

     int pvt,indpvt,i,chg,z,p;

    {



    if(dern > prim)
    {


    {
        int indpvt= (prim + dern) / 2;
        int pvt = tab[indpvt];
        p=indpvt;
         z=dern;
         system("cls");
        mostrar1(t2,n);
        mostrar2(tab,n,z,p);

        //system ("pause");
         Sleep(150);
    system("cls");
        swap(tab + indpvt, tab + dern);
        p=indpvt;
        z=dern;
       mostrar1(t2,n);
        mostrar2(tab,n,z,p);
         Sleep(150);

       // system ("pause");
     system("cls");
        p=indpvt;
        z=-5;
       // system ("pause");
        for(i=chg=prim;i<dern;i++)
        {   p=indpvt;
            z=i;

              mostrar1(t2,n);
            mostrar2(tab,n,z,p);

        //system ("pause");
            //system ("pause");
         Sleep(150);
          system("cls");
            if(tab[i]< pvt)
            {   z=chg;
                p=indpvt;
                mostrar1(t2,n);
               mostrar2(tab,n,z,p);

        //system ("pause");
               Sleep(150);
            system("cls");

                swap(tab + i,tab  +chg);

                 mostrar1(t2,n);
            mostrar2(tab,n,z,p);

        //system ("pause");
             Sleep(150);
            system("cls");
                chg++;
               // system ("pause");
            }
        }
        system("cls");
         mostrar1(t2,n);
            mostrar2(tab,n,z,p);

       // system ("pause");
             Sleep(150);
        system("cls");

        swap(tab + chg,tab + dern);
            mostrar1(t2,n);
            mostrar2(tab,n,z,p);

        //system ("pause");
             Sleep(150);
            system("cls");

        //system ("pause");
        quick_a(tab,prim,chg-1,t2,n);

        quick_a(tab,chg +1,dern,t2,n);
    }
}
    }
system("cls");

 mostrar1(t2,n);
 mostrar2(tab,n,z,p);

}

void quick_b(int tab[], int prim, int dern)
{


     int pvt,indpvt,i,chg,z,p;

    {

    if(dern > prim)
    {


    {
        int indpvt= (prim + dern) / 2;
        int pvt = tab[indpvt];

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

        quick_b(tab,prim,chg-1);

        quick_b(tab,chg +1,dern);
    }
}
    }


}







int main (void){

clock_t start,end;
int i;
int n;
int a;
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

if (n<=20)
{
   remplir_a(n);
}
else
{
 remplir_b(n);
}


system ("pause");
  return 0;
}// fin del principal




