#include<stdio.h>

int main()
{
    int n;
    int z=0;
    
    scanf("%d", &n);
    
    int i;
    
    for (i=1; i<=n; i++)
    {z= z+i;}
    
    printf("%d",z);
}