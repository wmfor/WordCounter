using System;

namespace WordCounter 
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int characterCount = 0;
            int wordCount = 0;

            string s = "";
            
            Console.WriteLine("Paste the paragraph/text you'd like to count.");
            
            s = Console.ReadLine();

            for (int i = 0; i < s.Length; i++)
            {
                if (i == 0 && s[0] != ' ')
                    wordCount = 1;
                
                characterCount++;
                if (s[i] == ' ')
                {
                    wordCount++;
                }
            }
            
            Console.WriteLine("\n Character Count is - " + characterCount + " / " + "Word Count is - " + wordCount);
        }
    }
}