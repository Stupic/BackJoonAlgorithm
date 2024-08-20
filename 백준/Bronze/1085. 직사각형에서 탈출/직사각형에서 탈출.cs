using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P1085()
    {
        String arg = Console.ReadLine();
        String[] xywh = arg.Split(" ");
        int x = Convert.ToInt32(xywh[0]);
        int y = Convert.ToInt32(xywh[1]);
        int w = Convert.ToInt32(xywh[2]);
        int h = Convert.ToInt32(xywh[3]);

        if (x > w - x)
            x = w - x;

        if (y > h - y)
            y = h - y;

        if (x > y)
            Console.WriteLine(y);
        else
            Console.WriteLine(x);

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1085();
        }
    }
}
