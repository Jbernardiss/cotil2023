using System;

namespace LetterSort
{
    class Program
    {
        static string letterSort(string word)
        {
            word = word.ToLower();
            char[] charArr = word.ToCharArray();

            bool changed = false;
            char temp;
            

            do
            {
                changed = false;

                for(int i = 0; i < (charArr.Length - 1); i++)
                {

                    if(charArr[i] > charArr[i + 1])
                    {
                        temp = charArr[i];
                        charArr[i] = charArr[i + 1];
                        charArr[i + 1] = temp;

                        changed = true;
                    }
                }
            } while (changed); 

            return new string(charArr);
        } 

        static void Main(string[] args)
        {
            string name = "Priscila";

            name = letterSort(name);

            Console.WriteLine(name);
        }
    }
}
