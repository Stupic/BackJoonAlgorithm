using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P3009()
    {
        int[] XXX = new int[3];
        int[] YYY = new int[3];
        int x, y;
        int xcheck = 0;
        int ycheck = 0;
        for (int i = 0; i<3; i++)
        {
            String args = Console.ReadLine();
            String[] arg = args.Split();

            XXX[i] = Convert.ToInt32(arg[0]);
            YYY[i] = Convert.ToInt32(arg[1]);
        }

        for(int i = 1; i< 3; i++)
        {
            if (XXX[0] == XXX[i])
                xcheck = i;

            if (YYY[0] == YYY[i])
                ycheck = i;
        }

        if (xcheck != 0)
            Console.Write(XXX[3 - xcheck] + " ");
        else
            Console.Write(XXX[xcheck] + " ");

        if (ycheck != 0)
            Console.WriteLine(YYY[3 - ycheck]);
        else
            Console.WriteLine(YYY[ycheck]);
    }
}


namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P3009();
        }
    }
}
