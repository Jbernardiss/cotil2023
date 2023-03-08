using System;

namespace selectionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int min;
            int[] v = new int[5];

            for(int i = 0; i < 5; i++)
            {
                Console.Write($"Write number in pos {i}: ");
                v[i] = Convert.ToInt32(Console.ReadLine());
            }

            Console.WriteLine("Original: ");
            for(int i = 0; i < 5; i++)
            {
                Console.Write($"{v[i]} ");
            }

            for(int i = 0; i < 4; i++)
            {
                min = i;

                for(int j = (i + 1); j < 5; j++)
                {
                    if(v[j] < v[min])
                    {
                        min = j;
                    }
                }

                if(i != min)
                {
                    int temp = v[i];
                    v[i] = v[min];
                    v[min] = temp;
                }
            }

            Console.WriteLine("\nSorted: ");
            for(int i = 0; i < 5; i++)
            {
                Console.Write($"{v[i]} ");
            }
        }
    }
}
