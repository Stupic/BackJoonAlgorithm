using System;
using System.Collections.Generic;
using System.Text;

public class Solution
{
int star(int X , int Y,int K)
        {

            if (K == 0)
            {
               return 0;
            }

            if (X / K == 1 && Y / K == 1)
            {
                return 1;
            }


            if (star(X, Y, K / 3) == 1)
            {
                return 1;
            }
            else if(star(X%K, Y%K, K / 3) == 1)
            {
                return 1;
            }

            return 0;


        }
    
    public void P2447()
    {
        
        
        
        int N = Convert.ToInt32(Console.ReadLine());
        var result = new StringBuilder();
         for(int i = 0; i<N; i++)
         {
            for(int j = 0; j<N; j++)
            {
                int k = star(i, j, N / 3);

                if (k == 1)
                    result.Append(" ");
                else
                    result.Append("*");
            }
            result.Append("\n");
         }
        Console.Write(result);

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P2447();
           
        }
    }
}
