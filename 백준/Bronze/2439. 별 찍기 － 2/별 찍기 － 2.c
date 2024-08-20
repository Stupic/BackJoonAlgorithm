#include<stdio.h>
    
int main()
{
    int n;
    int i;
    int j;
    scanf("%d",&n);
    
    for(i=1 ; i<=n ; i++)
    {
        for(j= 1; j<=n ; j++)
        {
            if(j<=n-i) 
            {
                printf(" ");
            }
            else if(j>n-i)
            {
                printf("*");
            }
        }
        printf("\n");
    }     
}