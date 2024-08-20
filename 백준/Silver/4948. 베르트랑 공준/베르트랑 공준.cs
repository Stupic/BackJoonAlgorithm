using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Threading;

public class Solution
{
    public void P4948()
    {
        int[] primecheck = new int[300001];
        primecheck[0] = 1;
        primecheck[1] = 1;
        primecheck[2] = 0;
        for (int i = 2; i <= 300000; i++)
        {

            if (primecheck[i] == 0)
            {

                for (int j = i; j <= 300000;)
                {
                    j += i;
                    if (j < 300001)
                        primecheck[j] = 1;

                }
            }
        }
        int n = 0;
        do
        {
            n = Convert.ToInt32(Console.ReadLine());
            int count = 0;
            for(int i = n+1; i<=2*n; i++)
            {
                if (primecheck[i] == 0) { 
                    
                    count++;
                }
            }
            if(count != 0)
                Console.WriteLine(count);
        } while (n > 0);
        
    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P4948();
        }
    }
}


