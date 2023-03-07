using System;

namespace matrixMultiply
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] matrix1 = new int[3, 3];
            int[,] matrix2 = new int[3, 3];
            int[,] newMatrix = new int[3, 3];

            Console.WriteLine("Fill the matrixes");
            Console.WriteLine("Matrix 1: ");
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    Console.Write("[" + i + ", " + j + "]: ");
                    matrix1[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("Matrix 2: ");
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write("[" + i + ", " + j + "]: ");
                    matrix2[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }


            int sum;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    sum = 0;
                    for(int k = 0; k < 3; k++)
                    {
                        sum += matrix1[i, k] * matrix2[k, j];
                    }
                    newMatrix[i, j] = sum;
                }
            }

            Console.WriteLine("New Matrix: ");
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write("[" + i + ", " + j + "]: " + newMatrix[i, j]);
                }
            }

        }


    }
}
