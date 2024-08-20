#include<stdio.h>


int main(){
	
	int n1;
	int n2;
	int kg3=0,kg5=0;
	int EA1=-1,EA2=99999;
	scanf("%d",&n1);
	
	n2 = n1;
	while(1){
		
		if(kg5==0 && kg3==0){
			kg5= n1/5;
			n2= n1%5;
			kg3= n2/3;
			if(n2%3==0){
				EA2= kg5+kg3;
			} 
		}
		else{
            kg5--;
			n2 +=5;
			kg3= n2/3;
			if(n2%3==0){
				if(EA2>kg3+kg5){
					EA2= kg3+kg5;
				}
			}			
		}
		
		if(kg3==n1/3){
			break;
		}
	}
	
	if(EA2!=99999){
		printf("%d",EA2);
	}else{
		printf("%d",EA1);
	}
	
	
}