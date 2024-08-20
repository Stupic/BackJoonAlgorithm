using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P1712();
        }
    }
}

public class Solution
{
    public void P1712()
    {
        String[] ABC = new String[3];
        ABC = Console.ReadLine().Split(" ");
        int A = Convert.ToInt32(ABC[0]);
        int BC = Convert.ToInt32(ABC[2]) - Convert.ToInt32(ABC[1]); //이윤
        int count = 1 ;

        if (BC <= 0)
        {
            Console.WriteLine("-1");
            return;
        }

        count = A / BC + 1;

        Console.WriteLine(count);
        
    }
}