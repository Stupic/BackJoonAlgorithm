#include<stdio.h>
#include<math.h>
int main(){
    int x1,x2,y1,y2,r1,r2;
    double r3,l3;
    
    int t;
    
    scanf("%d",&t);
    
    while (t>0){
        scanf("%d %d %d %d %d %d",&x1,&y1,&r1,&x2,&y2,&r2);
        
        l3 = sqrt(pow((x1-x2),2)+pow((y1-y2),2));
        r3 = r1+r2;
        
      
       if(x1==x2 && y1== y2 && r1 == r2){
           printf("-1\n");
       }
       else if(r1>r2 && l3<=r1){
        	if(l3+r2<r1){
        		printf("0\n");
			}
			else if(l3+r2>r1){
				printf("2\n");
			}
			else{
				printf("1\n");
			}
		}
        else if(r2>r1 && l3<=r2){
        	double temp;
        	temp = r1;
        	r1 = r2;
        	r2 = temp;
        	if(l3+r2<r1){
        		printf("0\n");
			}
			else if(l3+r2>r1){
				printf("2\n");
			}
			else{
				printf("1\n");
			}
        	
		}

		else{	
            if(l3 == r3){
            	printf("1\n");
        	}else if( r3>l3){
            	printf("2\n");
        	}else{
            	printf("0\n");
        	}
    	}
        t--;
        
    }
    
}