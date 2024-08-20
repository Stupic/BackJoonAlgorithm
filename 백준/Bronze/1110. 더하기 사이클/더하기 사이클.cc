#include<stdio.h>

int main(){
    int n;
    int e;
    int count= 0;
    scanf("%d", &n);
    
    e = n;
    do{

        e = (e%10)*10+ ((e/10+e%10)%10); 
       count++; 
    }while(e != n);

    printf("%d",count);
    
}