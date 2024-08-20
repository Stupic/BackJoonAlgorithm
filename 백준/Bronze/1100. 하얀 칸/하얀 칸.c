#include<stdio.h>

int main()
{
    char a[8][8];
    
    int i;
    int j;
    int count=0;
    for(i=0; i<8; i++)
    {
        for(j=0; j<8; j++)
        {
            scanf("%c\n",&a[i][j]);
        }
            
    }
    
    for(i=0; i<8; i++)
    {
        if(i%2==0)
        {
            for(j=0;j<8;j++)
            {
                if(j%2==0 && a[i][j]=='F')
                count++;    
            }    
        }
        else if(i%2==1)
        {
            for(j=0; j<8; j++)
            {
                if(j%2==1 && a[i][j]=='F')
                count++;    
            }
        }
        
    }
    
    printf("%d",count);
    
    
}