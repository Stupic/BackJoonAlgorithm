#include<stdio.h>

int main()
{
    int n;
    
    scanf("%d",&n);
    
    if(n<60)
     printf("F");

    else if(n<70)
     printf("D");
        
    else if(n<80)
     printf("C");
        
    else if(n<90)
     printf("B");
        
    else
     printf("A");
    
}