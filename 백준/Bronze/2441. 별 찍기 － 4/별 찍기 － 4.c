#include<stdio.h>
    
int main()
{
    int n;
    int i;
    int j;
    scanf("%d",&n);
    
    for(i=n ; i>=1 ; i--)
    {
        for(j= 1; j<=n ; j++)
        {
            if(j>n-i)
            {
              printf("*");  
            }
            else
            {
                printf(" ");
            }
            
        }
        printf("\n");
    }     
}