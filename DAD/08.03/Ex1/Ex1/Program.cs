using System.Threading.Channels;
using System.Threading.Tasks.Dataflow;

namespace A
{
    internal class Program
    {

        static int[] bubbleSort(int[] numArr)
        {
            bool changed;
            int temp;

            do
            {
                changed = false;

                for (int i = 0; i < 9; i++)
                {
                    if (numArr[i] > numArr[i + 1])
                    {
                        temp = numArr[i];
                        numArr[i] = numArr[i + 1];
                        numArr[i + 1] = temp;
                        changed = true;
                    }
                }
            } while (changed);

            return numArr;
        }

        static int[] selectionSort(int[] numArr)
        {
            int temp;
            int min;

            for (int i = 0; i < 10; i++)
            {
                min = i;

                for(int j = (i + 1); j < 10; j++)
                {
                    if (numArr[j] < numArr[min])
                    {
                        min = j;
                    }

                    if(min != i)
                    {
                        temp = numArr[i];
                        numArr[i] = temp;
                        numArr[min] = temp;
                    }
                }
            }

            return numArr;
        }

        static void Main(string[] args)
        {
            Random rnd = new Random();
            int[] numArr = new int[10];
            int[] increasingNumArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] decreasingNumArr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
            int[] bubbleSorted, selectionSorted, bubbleSortedIncreasing, bubbleSortedDecreasing, selectionSortedIncreasing, selectionSortedDecreasing;
            

            for(int i = 0; i < 10; i++)
            {
                numArr[i] = rnd.Next(0, 101);
            }

            Console.WriteLine("Original:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{numArr[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Increasing Numbers:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{increasingNumArr[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Decreasing Numbers:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{decreasingNumArr[i]}, ");
            }
            Console.WriteLine();

            bubbleSorted = bubbleSort(numArr);
            bubbleSortedIncreasing = bubbleSort(increasingNumArr);
            bubbleSortedDecreasing = bubbleSort(decreasingNumArr);
            selectionSorted = selectionSort(numArr);
            selectionSortedIncreasing = selectionSort(increasingNumArr);
            selectionSortedDecreasing = selectionSort(decreasingNumArr);

            Console.WriteLine("Random Bubble Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{bubbleSorted[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Crescent Bubble Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{bubbleSortedIncreasing[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Decrescent Bubble Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{bubbleSortedDecreasing[i]}, ");
            }
            Console.WriteLine();



            Console.WriteLine("Random Selection Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{selectionSorted[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Increasing Selection Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{selectionSortedIncreasing[i]}, ");
            }
            Console.WriteLine();

            Console.WriteLine("Decreasing Bubble Sorted:");
            for (int i = 0; i < 10; i++)
            {
                Console.Write($"{selectionSortedDecreasing[i]}, ");
            }
            Console.WriteLine();
        }
    }
}