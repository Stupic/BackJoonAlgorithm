using System;

namespace Backjoon
{

    class P2884
    {
        static void Main(string[] arg)
        {

            int a, b;
            string sarg;

            sarg = Console.ReadLine();
            string[] spstring = sarg.Split(" ");

            a = Convert.ToInt32(spstring[0]);
            b = Convert.ToInt32(spstring[1]);

            if (b >= 45)
                b = b - 45;
            else
            {
                b = b - 45 + 60;
                a = a - 1;
            }

            if (a < 0)
                a = 23;

            Console.WriteLine(a + " " + b);

        }

    }
}