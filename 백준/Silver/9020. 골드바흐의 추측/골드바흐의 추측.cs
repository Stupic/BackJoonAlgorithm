using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P9020()
    {
        int[] primecheck = new int[10001];
        primecheck[0] = 1;
        primecheck[1] = 1;
        primecheck[2] = 0;
        for (int i = 2; i <= 10000; i++)
        {

            if (primecheck[i] == 0)
            {

                for (int j = i; j <= 10000;)
                {
                    j += i;
                    if (j < 10001)
                        primecheck[j] = 1;

                }
            }
        }

        int T = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i<T; i++)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int bah=2;
            for(int j = 2; j<=n/2; j++)
            {
                if (primecheck[j] == 0 && primecheck[n - j] == 0)
                {
                    bah = j;
                }
            }
            Console.WriteLine(bah + " " + (n - bah));
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
            s.P9020();
        }
    }
}


