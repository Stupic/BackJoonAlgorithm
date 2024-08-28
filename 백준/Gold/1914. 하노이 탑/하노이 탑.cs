using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using System.Numerics;

public class Solution
{
    int count = 0;
    StringBuilder arg = new StringBuilder { } ;
    void hanoi(int n, int start, int end, int middle)
        {
            if (n == 1)
            {
                string temp= start + " " + end ;
                arg.Append(temp + "\n");
                    count++;
                
            }
            else
            {
                ;
                hanoi(n - 1, start, middle, end);
                string temp= start + " " + end ;
                arg.Append(temp + "\n");
                    count++;
                hanoi(n - 1, middle, end, start);
            }
        }
    public void P11729()
    {

        int N = Convert.ToInt32(Console.ReadLine());

        if( N <= 20){
            hanoi(N, 1, 3, 2);
            Console.WriteLine(count);
            Console.WriteLine(arg);
        }else{
            BigInteger bigCount = new BigInteger(0);
            for( int i = 0; i < N ; i++){
                bigCount +=  new BigInteger(Math.Pow(2,i));
            }
            Console.WriteLine(bigCount);
        }
        


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
