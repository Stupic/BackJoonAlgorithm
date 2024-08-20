using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P7568()
    {
        int N = Convert.ToInt32(Console.ReadLine());
        List<int[]> humen = new List<int[]> { }; 
        for(int i = 0; i<N; i ++)
        {
            String n = Console.ReadLine();
            String[] wh = n.Split(' ');
            int[] temp = new int[2]  ;
            temp[0] = Convert.ToInt32(wh[0]);
            temp[1] = Convert.ToInt32(wh[1]);
            humen.Add(temp);
        }

        for(int i = 0; i< N; i++)
        {
            int site = 1;
            for(int j = 0; j< N; j++)
            {
                 if(humen[i][0] < humen[j][0])
                 {
                    if (humen[i][1] < humen[j][1])
                        site++;
                 }
            }
            Console.Write(site);
            if (i != N - 1)
                Console.Write(" ");
        }

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P7568();
           
        }
    }
}


