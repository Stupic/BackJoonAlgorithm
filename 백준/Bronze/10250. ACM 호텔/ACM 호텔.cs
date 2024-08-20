using System;

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P10250();
        }
    }
}

public class Solution
{
    public void P10250()
    {
        int n = Convert.ToInt32(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            String arg = Console.ReadLine();
            String result = "";
            String[] HWN = arg.Split(" ");
            int Ho = (Convert.ToInt32(HWN[2]) - 1) / Convert.ToInt32(HWN[0]);
            int Floor = Convert.ToInt32(HWN[2]) - Convert.ToInt32(HWN[0]) * Ho;

            result = Convert.ToString(Floor);

            if ((Ho+1) < 10)
                result += "0";
            result += Convert.ToString(Ho + 1);

            Console.WriteLine(result);
        }
    }
}