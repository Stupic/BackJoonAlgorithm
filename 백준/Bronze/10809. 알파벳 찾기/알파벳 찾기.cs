using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P10809();
        }
    }

}
public class Solution
{
    public void P10809()
    {
        int[] site = new int[26] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                   -1, -1, -1, -1, -1, -1 };

        String args = Console.ReadLine();

        for (int i = 0; i < args.Length; i++)
        {
            int asc = Convert.ToInt32(args[i]) - 97;
            if (asc >= 0 && asc <= 26 && site[asc] == -1)
            {
                site[asc] = i;
            }
        }

        for (int i = 0; i < site.Length - 1; i++)
        {
            Console.Write(site[i] + " ");
        }
        Console.WriteLine(site[site.Length - 1]);
    }
}
