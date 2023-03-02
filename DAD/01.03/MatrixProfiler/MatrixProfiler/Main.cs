using System;

namespace MatrixProfiler
{
	class numProfile
	{
		private int num;
		private int appearances = 0;

		public void setNum(int num)
		{
			this.num = num;
		}

		public int getNum()
		{
			return this.num;
		}

		public void setApperances(int appearances)
		{
			this.appearances = appearances;
		}

		public int getApperances()
		{
			return this.appearances;
		}
	}

	class matrixProfile
	{
		private numProfile[] numProfiles = new numProfile[16];
		private int lastNumProfilePos = 0;

		public void addNumProfile(int num, int appearances)
		{
			numProfiles[lastNumProfilePos].setNum(num);
			numProfiles[lastNumProfilePos].setApperances(appearances);
			lastNumProfilePos++;
		}

		public void printNumProfiles()
		{
			for(int i = 0; i < lastNumProfilePos; i++)
			{
				Console.WriteLine("Num: " + numProfiles[i].getNum() + " Appear.: " + numProfiles[i].getApperances());
			}
		}
	}


	public class Program
	{

		static void Main(string[] args)
		{
            matrixProfile matrixProfile = new matrixProfile();
            int[,] matrix = new int[4, 4];
			int maxNum;
			int minNum;

			matrixProfile.printNumProfiles();
			
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 0; j++)
				{
					Console.Write("[" + i + "," + j + "]: ");
					matrix[i,j] =  Convert.ToInt32(Console.ReadLine());
				}
			}

		}
	}


}

