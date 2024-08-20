using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Threading;

public class Solution
{
    public void P2581()
    {
        int[] primecheck = new int[10001];
        primecheck[0] = 1;
        primecheck[1] = 1;
        primecheck[2] = 0;
        int M = Convert.ToInt32(Console.ReadLine());
        int N = Convert.ToInt32(Console.ReadLine());
        int sum = -1;
        int min = -1;
        List<int> n = new List<int> { };

        for (int i = 2; i <=N; i++)
        {

            if (primecheck[i] == 0)
            {

                for (int j = i; j <= N;)
                {
                    j += i;
                    if (j < 10001)
                        primecheck[j] = 1;

                }
            }
        }

        for(int i = M; i<=N  ; i++)
        {
            if(primecheck[i]== 0)
            {
                if (sum == -1) { 
                    min = i;
                    sum = i;
                }
                else
                {
                    sum += i;
                }
                
            }
        }



        Console.WriteLine(sum);
        if(sum != -1)
        {
            Console.WriteLine(min);
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
            s.P2581();
        }
    }
}
