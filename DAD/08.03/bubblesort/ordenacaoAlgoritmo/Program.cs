using System;

namespace ordenacaoAlgoritmo
{
    class Program
    {
        static void Main(string[] args)
        {
            int temp;
            int[] v = new int[5];
            bool trocou;

            int troca = 0, comp= 0;
            for(int i = 0; i < 5; i++)
            {
                Console.WriteLine("Escreva um número: ");
                v[i] = Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("Original: ");
            for (int i = 0; i < 5; i++)
            {
                Console.Write(v[i] + " ");
            }

            do
            {
                trocou = false;
                for(int i = 0; i < 4; i++)
                {
                    comp++;
                    if(v[i] > v[i + 1])
                    {
                        troca++;
                        temp = v[i];
                        v[i] = v[i + 1];
                        v[i + 1] = temp;
                        trocou = true;
                    }
                }
            } while (trocou);

            Console.WriteLine("\nOrdenado: ");
            for (int i = 0; i < 5; i++)
            {
                Console.Write(v[i] + " ");
            }

            Console.WriteLine("\ntroca: " + troca);
            Console.WriteLine("Comp: " + comp);
        }
    }
}
