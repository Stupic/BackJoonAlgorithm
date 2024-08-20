using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

public class Solution
{
    void hanoi(int n, int start, int end, int middle, List<int[]> history)
        {
            if (n == 1)
            {
                int[] temp= new int[2] ;
                temp[0] = start;
                temp[1] = end;
                history.Add(temp);
                
            }
            else
            {
                ;
                hanoi(n - 1, start, middle, end, history);
                int[] temp = new int[2];
                temp[0] = start;
                temp[1] = end;
                history.Add(temp);
                hanoi(n - 1, middle, end, start, history);
            }
        }
    public void P11729()
    {

        int N = Convert.ToInt32(Console.ReadLine());
        List<int[]> history = new List<int[]> { }; 
        var arg = new StringBuilder { } ;

        

        hanoi(N, 1, 3, 2, history);


        Console.WriteLine(history.Count);
        foreach(int[] item in history)
        {
            arg.Append(item[0] + " " + item[1] + "\n");
        }

        Console.WriteLine(arg);



    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P11729();
           
        }
    }
}
