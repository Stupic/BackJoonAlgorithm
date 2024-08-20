using System;

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1011();
        }
    }
}

public class Solution
{
    public void P1011()
    {

        int T = Convert.ToInt32(Console.ReadLine());
        
        for(int j = 0 ; j<T; j++)
        {
            String arg = Console.ReadLine();
            String[] XY = arg.Split(" ");
            long X = Convert.ToInt64(XY[0]);
            long Y = Convert.ToInt64(XY[1]);
            int mod = 0; // 자리수 짝수= 0,홀수= 1  11 111 121 1211 1221 12121 12221 12321
            long add = 1;  // 증가값
            long move = 2;
            long i = 2;

            while (i < Y-X)
            {
                if (mod == 0)
                {
                    add++;
                    i = i + add;
                    mod = 1;
                    move++;
                }
                else if (mod == 1)
                {
                    i = i + add;
                    mod = 0;
                    move++;
                }
            }
            if (Y-X == 1)
                move = 1;

            Console.WriteLine(move);
        }
        
   

    }
}