#include <stdio.h>
#include <stdlib.h>

int main()
{   int n,i,m;
    int x=1;

    printf("Introduire un nombre lignes: ");
    scanf("%d",&n);
    printf("\n");
    int esp=3*n;
    int z=3*n;
    for (i=0;i<=n;i++)
    {
       do
    {
        printf(" ");
        esp=esp-1;


     }while(esp>=0);
     z=z-1;
     esp=z;


      for(m=0;m<x;m++) {

        printf("*");

       }
       x=x+2;
       printf("\n");
    }

    return 0;
}
