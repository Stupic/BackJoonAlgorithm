using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
    public void P4153()
    {
        String arg = Console.ReadLine();

        while(!arg.Equals("0 0 0"))
        {
            String[] ABC = arg.Split(" ");
            List<int> sort = new List<int> { };
            sort.Add(Convert.ToInt32(ABC[0]));
            sort.Add(Convert.ToInt32(ABC[1]));
            sort.Add(Convert.ToInt32(ABC[2]));
            sort.Sort();

            int A = sort[0];
            int B = sort[1];
            int C = sort[2];

            if (A * A + B * B == C * C)
                Console.WriteLine("right");
            else
                Console.WriteLine("wrong");

            arg = Console.ReadLine();

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
            s.P4153();
        }
    }
}

