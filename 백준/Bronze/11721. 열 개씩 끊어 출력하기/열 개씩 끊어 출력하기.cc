#include<stdio.h>

int main(){

	char c;	
    int count= 0;
    
    
	while(1){
		scanf("%c", &c);
        
        if(c=='\n'){
            break;
        }
        else{
            printf("%c",c);
            count++;
        }
        
        if(count==10){
            printf("\n");
            count=0;
        }
	}
	

}