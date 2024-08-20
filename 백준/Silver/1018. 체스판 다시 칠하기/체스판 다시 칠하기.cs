using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P1018()
    {
        String arg = Console.ReadLine();
        String[] xy = arg.Split(" ");
        int col = Convert.ToInt32(xy[0]);
        int row = Convert.ToInt32(xy[1]);
        String[] Board = new string[col];
        
        String[] WB = new string[] { "W", "B" };
        int first = 0;
        int second = 1;

        for(int i = 0; i<col; i++)
        {
            Board[i] = Console.ReadLine();
        }
        int Count1 = 0;
        int Count2 = 0;
        int Min = 32 ;
        

        for (int x = 0 ; x <=col-8; x++)
        {
            for(int y = 0; y<= row- 8; y++)
            {
                for (int i = x; i < x + 8; i++)
                {
                   
                    for(int j = y; j < y+8; j++)
                    {
                        if (WB[(first + i + j) % 2].Contains(Board[i][j]))
                            Count1++;
                        if (WB[(second + i + j) % 2].Contains(Board[i][j]))
                            Count2++;
                    }
                    

                }


                if (Min > Count1)
                    Min = Count1;

                if (Min > Count2)
                    Min = Count2;

                Count1 = 0;
                Count2 = 0;
            }
          
        }
        Console.WriteLine(Min);

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1018();
           
        }
    }
}
