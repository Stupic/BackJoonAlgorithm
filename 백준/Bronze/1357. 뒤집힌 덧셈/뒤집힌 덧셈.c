#include<stdio.h>

int rev(int x);

int main()
{
    int a; int b;
    scanf("%d %d",&a,&b);
    
    a =rev(a);
    b= rev(b);
    a= a+b;
    a = rev(a);
    printf("%d",a);
}

int rev(int x)
{
     int result= 0;
     int i;
     int a=0;
     int b=1;
      for(i=1000; i>=1; )
      {
          if(x>=i)
          {
              result += x/i*b;
              x= x%i;
              a=1;
          }
          
          if(a==1)
              b=b*10;
          
          i= i/10;
      }
    return result;
}