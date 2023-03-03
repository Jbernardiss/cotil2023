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
		private int lastNumProfilePos = -1;

		public matrixProfile()
		{
			for(int i = 0; i < 16; i++)
			{
				numProfiles[i] = new numProfile();
				numProfiles[i].setNum(0);
			}
		}

		public void addNumProfile(int num, int appearances)
		{
            lastNumProfilePos++;
            numProfiles[lastNumProfilePos].setNum(num);
			numProfiles[lastNumProfilePos].setApperances(appearances);
		}

		public void printNumProfiles()
		{
			for(int i = 0; i <= lastNumProfilePos; i++)
			{
				Console.WriteLine("Num: " + numProfiles[i].getNum() + " Appears.: " + numProfiles[i].getApperances());
			}
		}

		public bool numProfileExists(int num)
		{
			for (int i = 0; i <= lastNumProfilePos; i++)
			{
				if (numProfiles[i].getNum() == num)
				{
					return true;
				}
			}
			return false;
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
			
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					Console.Write("[" + i + "," + j + "]: ");
					matrix[i,j] = Convert.ToInt32(Console.ReadLine());
				}
			}

			maxNum = matrix[0, 0];
			minNum = matrix[0, 0];
			
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
					if (matrix[i,j] > maxNum)
					{
						maxNum = matrix[i,j];
					}
					if (matrix[i,j] < minNum)
					{
						minNum = matrix[i,j];
					}

                    if (matrixProfile.numProfileExists(matrix[i,j])) 
                    {
						continue;
                    } else
					{
						int counter = 0;
                        for (int k = 0; k < 4; k++)
                        {
                            for (int l = 0; l < 4; l++)
                            {
								if (matrix[i,j] == matrix[k,l])
								{
									counter++;
								}
                            }
                        }
						matrixProfile.addNumProfile(matrix[i,j], counter);
                    }
                }
            }

			matrixProfile.printNumProfiles();
			Console.WriteLine("Max num: " + maxNum);
			Console.WriteLine("Min num: " + minNum);
        }
	}


}

