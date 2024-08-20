using System;

namespace Backjoon
{

    class P1330
    {
        static void Main(string[] args)
        {
            int a, b;
            string arg;
            arg = Console.ReadLine();
            string[] spstring = arg.Split(" ");
            a = Convert.ToInt32(spstring[0]);
            b = Convert.ToInt32(spstring[1]);

            if (a > b)
                Console.WriteLine(">");
            if (a < b)
                Console.WriteLine("<");
            if (a == b)
                Console.WriteLine("==");
        }
    }
}