using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;
using System.Threading;
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P2798();
           
        }
    }
}

public class Solution
{
    public void P2798()
    {
        int N, M;
        String arg = Console.ReadLine();
        String[] NM = arg.Split(" ");
        N = Convert.ToInt32(NM[0]);
        M = Convert.ToInt32(NM[1]);

        arg = Console.ReadLine();
        String[] Card = arg.Split(" ");
        
        int Approx= 0;
        for (int k = 0; k < N - 2; k++)
        {
            for (int i = k+1; i < N - 1; i++)
            {
                for (int j = i + 1; j < N; j++)
                {
                    int temp = Convert.ToInt32(Card[k]) + Convert.ToInt32(Card[i]) + Convert.ToInt32(Card[j]);

                    if (temp <= M && temp > Approx)
                        Approx = temp;
                }
            }
        }

        Console.WriteLine(Approx);
    }
}