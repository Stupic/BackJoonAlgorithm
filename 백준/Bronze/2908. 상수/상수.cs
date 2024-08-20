using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            
            String asb = Console.ReadLine();
            String[] arg = asb.Split(" ");

            int a = int.Parse(arg[0]);
            int b = int.Parse(arg[1]);
            
            int n = 0;
            int before = a;
            do
            {
               n = n + before % 10;
               before = before / 10;
               n = n * 10;
            } while (before / 10 > 0);
            n = n + before; 
            a= n;
            
            n = 0;
            before = b;
            do
            {
               n = n + before % 10;
               before = before / 10;
               n = n * 10;
            } while (before / 10 > 0);
            n = n + before;         
            b= n;
            
            if(a>b)
                Console.WriteLine(a);
            
            else
                Console.WriteLine(b);
            

        }
    }
}

