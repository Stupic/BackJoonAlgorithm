using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P2675();
        }
    }
}
public class Solution
{
    public void P2675()
    {
        int T = Convert.ToInt32(Console.ReadLine());

        for (int k = 0; k < T; k++)
        {
            String args = Console.ReadLine();
            String[] splitargs = args.Split(" ");
            int R = Convert.ToInt32(splitargs[0]);

            for (int i = 0; i < splitargs[1].Length; i++)
            {
                for (int j = 0; j < R; j++)
                {
                    Console.Write(splitargs[1][i]);
                }
            }
            Console.WriteLine();
        }
    }
}