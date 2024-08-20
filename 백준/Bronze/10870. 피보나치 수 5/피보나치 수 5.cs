using System;
using System.Collections.Generic;
using System.Text;

public class Solution
{
    public void P10870()
    {
        

        int n = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(Fivonaci(n));
        
    }
    int Fivonaci(int n)
        {
            if (n < 2)
            {
                return n;
            }
            return Fivonaci(n - 1) + Fivonaci(n - 2);
        }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P10870();
           
        }
    }
}

