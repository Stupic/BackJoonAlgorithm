using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;

public class Solution
{
     public void P2751()
    {
        int size = Convert.ToInt32(Console.ReadLine());
         StringBuilder args = new StringBuilder();
        int temp;
        int[] list = new int[size];
        for (int i = 0; i < size; i++)
        {
            list[i] = Convert.ToInt32(Console.ReadLine());
        }

        
        for (int i = 1; i < size; i++)
        {
            int child = i;   //자식

            do
            {
                int root = (child - 1) / 2;
                if (list[child] > list[root])
                {
                    temp = list[child];
                    list[child] = list[root];
                    list[root] = temp;
                }
                child = root;
            }
            while (child > 0);

        }

        for (int i = size - 1; i > 0; i--)
        {
            int root = 0;
            temp = list[i];
            list[i] = list[root];
            list[root] = temp;

            int child;

            do
            {
                child = root * 2 + 1;

                if (child < i - 1 && list[child] < list[child + 1])  // 자식 왼쪽, 오른쪽
                    child++;

                if (child < i && list[root] < list[child])  // 부모  자식,작은 자식 교환
                {
                    temp = list[child];
                    list[child] = list[root];
                    list[root] = temp;
                }
                root = child;
            }
            while (child < i);

        }


        /*for(int i = 0; i<N; i++)
        {
            int son = i;

            while (son >=1)
            {
                int root = (son - 1) / 2;

                if(ary[root] < ary[son])
                {
                    temp = ary[root];
                    ary[root] = ary[son];
                    ary[son] = temp;
                }
                son = root;
            }
        }

        for(int i = N-1; i>0; i--)
        {
            int root = 0;
            temp = ary[root];
            ary[root] = ary[i];
            ary[i] = temp;
            
            while(root<i)
            {
                int son = root * 2 + 1;

                if (son < i - 1 && ary[son] < ary[son + 1])
                    son++;
                if (son < i &&ary[son] > ary[root]  )
                {
                    temp = ary[root];
                    ary[root] = ary[son];
                    ary[son] = temp;
                }
                root = son;
            }
        }*/


        for (int i = 0; i < size; i++)
        {
            args.Append(list[i] + "\n");
            
        }

        Console.Write(args);

    }
}
namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P2751();
           
        }
    }
}
