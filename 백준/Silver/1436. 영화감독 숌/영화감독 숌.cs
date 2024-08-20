using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P1436()
    {
        int i = 665;
        int N = Convert.ToInt32(Console.ReadLine());
        int Count = 0;
        String Dend = "666";

        while (N != Count)
        {
            i++;
            String temp = i.ToString();
            if (temp.Contains(Dend))
                Count++;


            
        }

        Console.WriteLine(i);
        
    }
}

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1436();
           
        }
    }
}