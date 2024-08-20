using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P3053()
    {
        int r = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("{0:F6}", (r * r *Math.PI));
        Console.WriteLine("{0:F6}",(r * r * 2));
        
    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P3053();
        }
    }
}