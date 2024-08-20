using System;

namespace Backjoon
{

    class P10039
    {
        static void Main(string[] args)
        {
            string sarg;
            int avg=0;
            int count = 0;
            while ((sarg = Console.ReadLine()) != null)
            {

                if(Convert.ToInt32(sarg)>=40)
                 avg = avg + Convert.ToInt32(sarg);

                else
                    avg = avg + 40;
                count++;
                if (count >= 5)
                    break;
            }


            Console.WriteLine(avg / 5);
        }
    }
}