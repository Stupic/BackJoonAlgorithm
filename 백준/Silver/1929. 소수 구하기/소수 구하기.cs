using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P1929()
    {
        int[] primecheck = new int[1000001];
        primecheck[0] = 1;
        primecheck[1] = 1;
        primecheck[2] = 0;
        String arg = Console.ReadLine();
        String[] MN = arg.Split(" ");
        int M = Convert.ToInt32(MN[0]);
        int N = Convert.ToInt32(MN[1]);
        var result = new StringBuilder();
        String line = "\n";
        
        for (int i = 2; i <= N; i++)
        {

            if (primecheck[i] == 0)
            {

                if (i >= M)
                {
                    result.Append(i + "\n");
                }
                for (int j = i; j <= N;)
                {
                    j += i;
                    if (j < 1000001)
                        primecheck[j] = 1;

                }
            }
        }

       

     Console.WriteLine(result);

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1929();
        }
    }
}

