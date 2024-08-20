using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P5622();
        }
    }
}



public class Solution
{
    public void P5622()
    {
        String arg = Console.ReadLine();
        int sum = 0;
        for(int i = 0; i<arg.Length; i++)
        {

            int num = arg[i] - 65;
            
            if(num < 3)
            {
                sum += 3; 
            }
            else if (num < 6)
            {
                sum += 4;
            }
            else if (num < 9)
            {
                sum += 5;
            }
            else if (num < 12)
            {
                sum += 6;
            }
            else if (num < 15)
            {
                sum += 7;
            }
            else if (num < 19)
            {
                sum += 8;
            }
            else if (num < 22)
            {
                sum += 9;
            }
            else
            {
                sum += 10;
            }
        }
        Console.WriteLine(sum);
    }
}