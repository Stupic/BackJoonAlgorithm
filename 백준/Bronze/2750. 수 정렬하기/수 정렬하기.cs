using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
public class Solution
{
    public void P2750()
    {
        int temp;
        int N = Convert.ToInt32(Console.ReadLine());
        int[] ary = new int[N];
        for(int i = 0; i<N; i++)
        {
            ary[i] = Convert.ToInt32(Console.ReadLine());
        }

        for(int i = 0; i<N; i++)
        {
            for(int j = i; j<N; j++)
            {
                if (ary[i] > ary[j])
                {
                    temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }


        for(int i = 0; i<N; i++)
        {
            Console.WriteLine(ary[i]);
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
            s.P2750();
           
        }
    }
}


