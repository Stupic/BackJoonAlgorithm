using System;

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P2869();
        }
    }
}


public class Solution
{
    public void P2869()
    {
        String arg = Console.ReadLine();
        String[] ABV = arg.Split(" ");
        int day = 1;
        int A = Convert.ToInt32(ABV[0]);
        int B = Convert.ToInt32(ABV[1]);
        int V = Convert.ToInt32(ABV[2]);
        if (V <= A)
            Console.WriteLine("1");
        else
        {
            V = V - A - 1;
            day =day+ V / (A - B) + 1;
            Console.WriteLine(day);
        }

    }
}