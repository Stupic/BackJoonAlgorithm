#include<stdio.h>

int main()
{
    int stic=64;
    int count=1;
    int min=64;
    int want;
    scanf("%d",&want);
    
    while(stic!=want)
    {
        if(stic>want)
        {
           min=min/2;
           stic=stic-min;
           if(stic<want)
           {
               stic=stic+min;
               count++;
           }
           
        }
    }
    printf("%d",count);
}