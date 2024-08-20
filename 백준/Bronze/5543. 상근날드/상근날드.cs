using System;

namespace Backjoon
{


    class P5543
    {
        static void Main(string[] args)
        {
            int[] buger = new int[3];
            int[] drink = new int[2];
            string sarg;
            int i = 0;
            int set = 99999;

            while ((sarg = Console.ReadLine()) != null)
            {
                if (i < 3)
                    buger[i] = Convert.ToInt32(sarg);
                else
                    drink[i - 3] = Convert.ToInt32(sarg);


                i++;

                if (i == 5)
                    break;
            }
            
            for(i=0; i<3; i++)
            {
                if (set > buger[i])
                    set = buger[i];
            }

            if (drink[0] > drink[1])
                set += drink[1];
            else
                set += drink[0];

            Console.WriteLine(set-50);




        }

    }
}