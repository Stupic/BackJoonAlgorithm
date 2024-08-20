#include<stdio.h>

int main()
{
   int x;
   int y;
   int i=1;
   int j=1;
   int n=0;; 
   scanf("%d %d",&x,&y);
   char day[7][4]={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    
   n=y; 
   for(i; i<x; i++)
   {
       if(i==4 || i==6 || i==9 || i==11)
       {
           n= n+30;
       }
       else if(i==2)
       {
           n= n+28;
       }
       else
       {
           n=n+31;
       }     
   }
   printf("%s",day[n%7]);
 
}