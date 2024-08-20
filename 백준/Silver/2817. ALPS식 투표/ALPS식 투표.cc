#include<stdio.h>

typedef struct staff{
       char name;
       int score;
       int num;
};


       

int main()
{
    int i,j=0;
    int playerAll;
    int staffAll;
    staff stf[10];
    scanf("%d",&playerAll);
    scanf("%d",&staffAll);
    int max=0;
    double value[2][140];

    for(i = 0; i<staffAll; i++)
    {
            char name[0];
            int poll;
          
            scanf("%s", &name);
            getchar();
            scanf("%d",&poll);

            
            
            stf[i].name = name[0];    
            
            stf[i].num = i;
            if( poll < playerAll*5/100)
            {
                
                staffAll--;
                i--;
                continue;
            } 
            stf[i].score= 0;
            max +=14;
            for(j=0; j+max-14<max; j++)
            {
               value[0][j+max-14]= (double)i;
               value[1][j+max-14]= (double)poll/(j+1);  
            }
            
           
    }
    
    double temp;
    double num;
    
    for(i = 0; i<max ; i++)
    {     
          for(j= i; j<max;j++)
          {
                 if(value[1][i] < value[1][j])
                 {
         
                    temp= value[1][i];
                    value[1][i] = value[1][j];
                    value[1][j] = temp;
                    
                    num = value[0][i];
                    value[0][i] = value[0][j];
                    value[0][j] = num;

                 }
          }                
    }

    for(i = 0; i<14; i++)
    {
          for(j= 0; j<staffAll; j++)
          {
                 if(stf[j].num ==(int)value[0][i])
                 {
                    stf[j].score++;
                    break;
                 }      
          }
    }
    

    
    
    int min=0;
    for( i =0 ; i<staffAll; i++)
    {   
         for(j=0 ; j<staffAll; j++)
         {   
            char a = stf[min].name;
            char b= stf[j].name; 
            if(b <= a)
            {          
               min = j;
            }

         }    
         printf("%c %d\n", stf[min].name,stf[min].score);
         stf[min].name = 'z'+1;
         
    }
    
    return 0;
}
    
    
