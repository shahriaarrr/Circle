using System;

namespace Circle
{
    class Program
    {
        static void Main(string[] args)
        {
            // PI number
            const double PI = 3.14;

            //variables
            int a;
            double b, c;
            
            //change foreground color to Green
            Console.ForegroundColor = ConsoleColor.Green;

            //welcom message and get radius from user
            Console.Write("Hi, welcom to Circle program\nGive me the radius of the circle: ");
            b = Convert.ToDouble(Console.ReadLine());

            //choice bitween circumference and area of this circle
            Console.WriteLine("1 --> Calculate the circumference of circle\n2 --> Calculate the area of circle");
            Console.Write("your choice: ");
            a = Convert.ToInt32(Console.ReadLine());

            if(a == 1)
            {
                //circumference
                b *= 2;
                c = b * PI;

                Console.WriteLine("Result = " + c);
            }
            else if (a == 2)
            {
                //area
                c = Math.Pow(b, 2) * PI;

                Console.WriteLine("Result = " + c);
            }
            else
            {
                Console.WriteLine("Error!!");
            }

            
            //reset color
            Console.ResetColor();
        }
    }
}
