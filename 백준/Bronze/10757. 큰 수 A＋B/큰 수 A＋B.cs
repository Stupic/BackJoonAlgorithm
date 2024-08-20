using System;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
using System.Numerics;
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = 2;
            BigInteger[] ary = new BigInteger[N];
            String n = Console.ReadLine();
            String[] wh = n.Split(' ');
            ary[0] = BigInteger.Parse(wh[0]);
            ary[1] = BigInteger.Parse(wh[1]);


            Console.WriteLine(ary[0] + ary[1]);

        }
    }
}