using System.Globalization;

namespace SaddlePoint
{
    internal class Program
    {
        static bool isLineMin(int num, int line, int lineLenght, int[,] matrix)
        {
            int minNum = num;

            for(int i = 0; i < lineLenght; i++)
            {
                if (matrix[line, i] < minNum)
                {
                    return false;
                }
            }

            return true;
        }

        static bool isColMax(int num, int col, int numOfLines, int[,] matrix)
        {
            int maxNum = num;

            for(int i = 0; i < numOfLines; i ++)
            {
                if (matrix[i, col] > maxNum)
                {
                    return false;
                }
            }

            return true;
        }

        static void Main(string[] args)
        {
            int[,] matrix = new int[3, 4];
            int saddleLine = 0;
            int saddleCol = 0;
            int saddleNum = 0;
            bool saddlePointExists = false;

            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    Console.Write("[" + i + "," + j + "]: ");
                    matrix[i,j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    if (isLineMin(matrix[i,j], i, 4, matrix))
                    {
                        if (isColMax(matrix[i, j], j, 3, matrix))
                        {
                            saddleNum = matrix[i,j];
                            saddleLine = i;
                            saddleCol = j;
                            saddlePointExists = true;
                            break;
                        }
                    }
                }
            }

            if(saddlePointExists)
            {
                Console.WriteLine("Saddle: " + saddleNum);
                Console.WriteLine("Saddle Position: " + "[" + saddleLine + "," + saddleCol + "]");
            } else
            {
                Console.WriteLine("No saddle point exists");
            }
        }
    }
}