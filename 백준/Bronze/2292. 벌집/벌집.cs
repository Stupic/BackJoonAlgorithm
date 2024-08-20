using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P2292();
        }
    }
}


public class Solution
{
    public void P2292()
    {
        int N = Convert.ToInt32(Console.ReadLine())-1;
        int range = 1;
        
        
        while (N > 0)
        {
            N = N - range * 6;
            range++;
        }


        Console.WriteLine(range);
    }
}