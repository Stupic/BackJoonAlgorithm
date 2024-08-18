#include<stdio.h>
#include<stdlib.h>


int main(){
	
    int n;
	int *score;
	int i;
	int max = 0;
	float avg= 0;
	
	
	scanf("%d",&n);
	
	score = (int*)malloc(sizeof(int)*n);
	for(i=0 ; i<n; i++){
		scanf("%d",(score+i));
		(*(score+i)>max)?    max=*(score+i):max;
		
		
	}
	    	
			
	for(i=0 ; i<n; i++){
		avg += ((float)*(score+i)/max)*100;
	}	    
	
	printf("%.2f",avg/n);
	

}