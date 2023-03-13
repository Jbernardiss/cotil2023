namespace Ex2
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

                for (int j = (i + 1); j < 10; j++)
                {
                    if (numArr[j] < numArr[min])
                    {
                        min = j;
                    }

                    if (min != i)
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
            Random rand = new Random();
            int[] arr1K = new int[1000];
            //int[] arr10K = new int[10000];
            //int[] arr100K = new int[100000];

            int[] arrSorted1K = new int[1000];
            //int[] arrSorted10K = new int[10000];
            //int[] arrSorted100K = new int[100000];

            for (int i = 0; i < 1000; i++)
            {
                arr1K[i] = 1000 - i;
            }

            /* for (int i = 0; i < 10000; i++)
            {
                arr10K[i] = rand.Next(0, 101);
            }
            for (int i = 0; i < 100000; i++)
            {
                arr100K[i] = rand.Next(0, 101);
            } */

            arrSorted1K = bubbleSort(arr1K);
            /* arrSorted10K = selectionSort(arr10K);
            arrSorted100K = selectionSort(arr100K); */

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine($"{arr1K[i]}, ");
            }

            Console.WriteLine();
            Console.WriteLine();
            Console.WriteLine();

            for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine($"{arrSorted1K[i]}, ");
            }
        }
    }
}