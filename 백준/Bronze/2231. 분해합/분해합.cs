using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;
using System.Threading;
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P2231();
           
        }
    }
}
public class Solution
{
    public void P2231()
    {
        int N = Convert.ToInt32(Console.ReadLine());

        for(int i = 1; i<=N; i++)
        {
            int Sum = i;
            int j = i;
            while (j != 0)
            {
                Sum += j % 10;
                j /= 10;
            }
            if (Sum == N)
            {
                Console.WriteLine(i);
                break;
            }
            
            if(i == N)
            {
                Console.WriteLine("0");
            }
              
        }
       
    }
}