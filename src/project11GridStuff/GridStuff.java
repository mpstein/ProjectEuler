package project11GridStuff;

import java.util.Arrays;

public class GridStuff {


	public static void main(String[] args) {
		
		int currentMax = 1;
		int internalTemp = 1;
		
		int[][] intArray = new int[20][20];
		//[row][column]
		
			intArray[0][0] = 8;
			intArray[0][1] = 2;
			intArray[0][2] = 22;
			intArray[0][3] = 97;
			intArray[0][4] = 38;
			intArray[0][5] = 15;
			intArray[0][6] = 0;
			intArray[0][7] = 40;
			intArray[0][8] = 0;
			intArray[0][9] = 75;
			intArray[0][10] = 4;
			intArray[0][11] = 5;
			intArray[0][12] = 7;
			intArray[0][13] = 78;
			intArray[0][14] = 52;
			intArray[0][15] = 12;
			intArray[0][16] = 50;
			intArray[0][17] = 77;
			intArray[0][18] = 91;
			intArray[0][19] = 8;
			
			//ROW 2
			intArray[1][0] = 49;
			intArray[1][1] = 49;
			intArray[1][2] = 99;
			intArray[1][3] = 40;
			intArray[1][4] = 17;
			intArray[1][5] = 81;
			intArray[1][6] = 18;
			intArray[1][7] = 57;
			intArray[1][8] = 60;
			intArray[1][9] = 87;
			intArray[1][10] = 17;
			intArray[1][11] = 40;
			intArray[1][12] = 98;
			intArray[1][13] = 43;
			intArray[1][14] = 69;
			intArray[1][15] = 48;
			intArray[1][16] = 4;
			intArray[1][17] = 56;
			intArray[1][18] = 62;
			intArray[1][19] = 0;
			//ROW 3
			intArray[2][0] = 81;
			intArray[2][1] = 49;
			intArray[2][2] = 31;
			intArray[2][3] = 73;
			intArray[2][4] = 55;
			intArray[2][5] = 79;
			intArray[2][6] = 14;
			intArray[2][7] = 29;
			intArray[2][8] = 93;
			intArray[2][9] = 71;
			intArray[2][10] = 40;
			intArray[2][11] = 67;
			intArray[2][12] = 53;
			intArray[2][13] = 88;
			intArray[2][14] = 30;
			intArray[2][15] = 03;
			intArray[2][16] = 49;
			intArray[2][17] = 13;
			intArray[2][18] = 36;
			intArray[2][19] = 65;

			//Row 4
			
			intArray[3][0] = 52;
			intArray[3][1] = 70;
			intArray[3][2] = 95;
			intArray[3][3] = 23;
			intArray[3][4] = 4;
			intArray[3][5] = 60;
			intArray[3][6] = 11;
			intArray[3][7] = 42;
			intArray[3][8] = 69;
			intArray[3][9] = 24;
			intArray[3][10] = 68;
			intArray[3][11] = 56;
			intArray[3][12] = 1;
			intArray[3][13] = 32;
			intArray[3][14] = 56;
			intArray[3][15] = 71;
			intArray[3][16] = 37;
			intArray[3][17] = 2;
			intArray[3][18] = 36;
			intArray[3][19] = 91;

			//Row 5
			
			intArray[4][0] = 22;
			intArray[4][1] = 31;
			intArray[4][2] = 16;
			intArray[4][3] = 71;
			intArray[4][4] = 51;
			intArray[4][5] = 67;
			intArray[4][6] = 63;
			intArray[4][7] = 89;
			intArray[4][8] = 41;
			intArray[4][9] = 92;
			intArray[4][10] = 36;
			intArray[4][11] = 54;
			intArray[4][12] = 22;
			intArray[4][13] = 40;
			intArray[4][14] = 40;
			intArray[4][15] = 28;
			intArray[4][16] = 66;
			intArray[4][17] = 33;
			intArray[4][18] = 13;
			intArray[4][19] = 80;
			
			//Row 6
			
			intArray[5][0] = 24;
			intArray[5][1] = 47;
			intArray[5][2] = 32;
			intArray[5][3] = 60;
			intArray[5][4] = 99;
			intArray[5][5] = 3;
			intArray[5][6] = 45;
			intArray[5][7] = 2;
			intArray[5][8] = 44;
			intArray[5][9] = 75;
			intArray[5][10] = 33;
			intArray[5][11] = 53;
			intArray[5][12] = 78;
			intArray[5][13] = 36;
			intArray[5][14] = 84;
			intArray[5][15] = 20;
			intArray[5][16] = 35;
			intArray[5][17] = 17;
			intArray[5][18] = 12;
			intArray[5][19] = 50;
			
			//Row 7
			
			intArray[6][0] = 32;
			intArray[6][1] = 98;
			intArray[6][2] = 81;
			intArray[6][3] = 28;
			intArray[6][4] = 64;
			intArray[6][5] = 23;
			intArray[6][6] = 67;
			intArray[6][7] = 10;
			intArray[6][8] = 26;
			intArray[6][9] = 38;
			intArray[6][10] = 40;
			intArray[6][11] = 67;
			intArray[6][12] = 59;
			intArray[6][13] = 54;
			intArray[6][14] = 70;
			intArray[6][15] = 66;
			intArray[6][16] = 18;
			intArray[6][17] = 38;
			intArray[6][18] = 64;
			intArray[6][19] = 70;
			
			//Row 8
			
			intArray[7][0] = 67;
			intArray[7][1] = 26;
			intArray[7][2] = 20;
			intArray[7][3] = 68;
			intArray[7][4] = 2;
			intArray[7][5] = 62;
			intArray[7][6] = 12;
			intArray[7][7] = 20;
			intArray[7][8] = 95;
			intArray[7][9] = 63;
			intArray[7][10] = 94;
			intArray[7][11] = 39;
			intArray[7][12] = 63;
			intArray[7][13] = 8;
			intArray[7][14] = 40;
			intArray[7][15] = 91;
			intArray[7][16] = 66;
			intArray[7][17] = 49;
			intArray[7][18] = 94;
			intArray[7][19] = 21;

			//Row 9 
			
			intArray[8][0] = 24;
			intArray[8][1] = 55;
			intArray[8][2] = 58;
			intArray[8][3] = 5;
			intArray[8][4] = 66;
			intArray[8][5] = 73;
			intArray[8][6] = 99;
			intArray[8][7] = 26;
			intArray[8][8] = 97;
			intArray[8][9] = 17;
			intArray[8][10] = 78;
			intArray[8][11] = 78;
			intArray[8][12] = 96;
			intArray[8][13] = 83;
			intArray[8][14] = 14;
			intArray[8][15] = 88;
			intArray[8][16] = 34;
			intArray[8][17] = 89;
			intArray[8][18] = 63;
			intArray[8][19] =72;

			//Row 10 Template 
			
			intArray[9][0] = 21;
			intArray[9][1] = 36;
			intArray[9][2] = 23;
			intArray[9][3] = 9;
			intArray[9][4] = 75;
			intArray[9][5] = 0;
			intArray[9][6] = 76;
			intArray[9][7] = 44;
			intArray[9][8] = 20;
			intArray[9][9] = 45;
			intArray[9][10] = 35;
			intArray[9][11] = 14;
			intArray[9][12] = 00;
			intArray[9][13] = 61;
			intArray[9][14] = 33;
			intArray[9][15] = 97;
			intArray[9][16] = 34;
			intArray[9][17] = 31;
			intArray[9][18] = 33;
			intArray[9][19] = 95;
			
			//Row 11 
			
			intArray[10][0] = 78;
			intArray[10][1] = 17;
			intArray[10][2] = 53;
			intArray[10][3] = 28;
			intArray[10][4] = 22;
			intArray[10][5] = 75;
			intArray[10][6] = 31;
			intArray[10][7] = 67;
			intArray[10][8] = 15;
			intArray[10][9] = 94;
			intArray[10][10] = 3;
			intArray[10][11] = 80;
			intArray[10][12] = 4;
			intArray[10][13] = 62;
			intArray[10][14] = 16;
			intArray[10][15] = 14;
			intArray[10][16] = 9;
			intArray[10][17] = 53;
			intArray[10][18] = 56;
			intArray[10][19] = 92;
			

			//Row 12 
			
			intArray[11][0] = 16;
			intArray[11][1] = 39;
			intArray[11][2] = 5;
			intArray[11][3] = 42;
			intArray[11][4] = 96;
			intArray[11][5] = 35;
			intArray[11][6] = 31;
			intArray[11][7] = 47;
			intArray[11][8] = 55;
			intArray[11][9] = 58;
			intArray[11][10] = 88;
			intArray[11][11] = 24;
			intArray[11][12] = 0;
			intArray[11][13] = 17;
			intArray[11][14] = 54;
			intArray[11][15] = 24;
			intArray[11][16] = 36;
			intArray[11][17] = 29;
			intArray[11][18] = 85;
			intArray[11][19] = 57;
			
			//Row 13
			
			intArray[12][0] = 86;
			intArray[12][1] = 56;
			intArray[12][2] = 0;
			intArray[12][3] = 48;
			intArray[12][4] = 35;
			intArray[12][5] = 71;
			intArray[12][6] = 89;
			intArray[12][7] = 7;
			intArray[12][8] = 5;
			intArray[12][9] = 44;
			intArray[12][10] = 44;
			intArray[12][11] = 37;
			intArray[12][12] = 44;
			intArray[12][13] = 60;
			intArray[12][14] = 21;
			intArray[12][15] = 58;
			intArray[12][16] = 51;
			intArray[12][17] = 54;
			intArray[12][18] = 17;
			intArray[12][19] = 58;
			
			//14 Template 
			
			intArray[13][0] = 19;
			intArray[13][1] = 80;
			intArray[13][2] = 81;
			intArray[13][3] = 68;
			intArray[13][4] = 5;
			intArray[13][5] = 94;
			intArray[13][6] = 47;
			intArray[13][7] = 69;
			intArray[13][8] = 28;
			intArray[13][9] = 73;
			intArray[13][10] = 92;
			intArray[13][11] = 13;
			intArray[13][12] = 86;
			intArray[13][13] = 52;
			intArray[13][14] = 17;
			intArray[13][15] = 77;
			intArray[13][16] = 4;
			intArray[13][17] = 89;
			intArray[13][18] = 55;
			intArray[13][19] = 40;
			
			//Row 15 
			
			intArray[14][0] = 4;
			intArray[14][1] = 52;
			intArray[14][2] = 8;
			intArray[14][3] = 83;
			intArray[14][4] = 97;
			intArray[14][5] = 35;
			intArray[14][6] = 99;
			intArray[14][7] = 16;
			intArray[14][8] = 7;
			intArray[14][9] = 97;
			intArray[14][10] = 57;
			intArray[14][11] = 32;
			intArray[14][12] = 16;
			intArray[14][13] = 26;
			intArray[14][14] = 26;
			intArray[14][15] = 79;
			intArray[14][16] = 33;
			intArray[14][17] = 27;
			intArray[14][18] = 98;
			intArray[14][19] = 66;
					
			//Row 16 
			
			intArray[15][0] = 88;
			intArray[15][1] = 36;
			intArray[15][2] = 68;
			intArray[15][3] = 87;
			intArray[15][4] = 57;
			intArray[15][5] = 62;
			intArray[15][6] = 20;
			intArray[15][7] = 72;
			intArray[15][8] = 3;
			intArray[15][9] = 46;
			intArray[15][10] = 44;
			intArray[15][11] = 67;
			intArray[15][12] = 46;
			intArray[15][13] = 55;
			intArray[15][14] = 12;
			intArray[15][15] = 32;
			intArray[15][16] = 63;
			intArray[15][17] = 93;
			intArray[15][18] = 53;
			intArray[15][19] = 69;
			
			//Row 17 
			
			intArray[16][0] = 4;
			intArray[16][1] = 42;
			intArray[16][2] = 16;
			intArray[16][3] = 73;
			intArray[16][4] = 38;
			intArray[16][5] = 25;
			intArray[16][6] = 39;
			intArray[16][7] = 11;
			intArray[16][8] = 24;
			intArray[16][9] = 94;
			intArray[16][10] = 72;
			intArray[16][11] = 18;
			intArray[16][12] = 8;
			intArray[16][13] = 46;
			intArray[16][14] = 29;
			intArray[16][15] = 32;
			intArray[16][16] = 40;
			intArray[16][17] = 62;
			intArray[16][18] = 76;
			intArray[16][19] = 36;
			
		
			//Row 18 
			
			intArray[17][0] = 20;
			intArray[17][1] = 69;
			intArray[17][2] = 36;
			intArray[17][3] = 41;
			intArray[17][4] = 72;
			intArray[17][5] = 30;
			intArray[17][6] = 23;
			intArray[17][7] = 88;
			intArray[17][8] = 24;
			intArray[17][9] = 62;
			intArray[17][10] = 99;
			intArray[17][11] = 69;
			intArray[17][12] = 82;
			intArray[17][13] = 67;
			intArray[17][14] = 59;
			intArray[17][15] = 85;
			intArray[17][16] = 74;
			intArray[17][17] = 4;
			intArray[17][18] = 36;
			intArray[17][19] = 16;
			
			//Row 19 
			
			intArray[18][0] = 20;
			intArray[18][1] = 73;
			intArray[18][2] = 35;
			intArray[18][3] = 29;
			intArray[18][4] = 78;
			intArray[18][5] = 31;
			intArray[18][6] = 90;
			intArray[18][7] = 1;
			intArray[18][8] = 74;
			intArray[18][9] = 31;
			intArray[18][10] = 49;
			intArray[18][11] = 71;
			intArray[18][12] = 48;
			intArray[18][13] = 86;
			intArray[18][14] = 81;
			intArray[18][15] = 16;
			intArray[18][16] = 23;
			intArray[18][17] = 57;
			intArray[18][18] = 5;
			intArray[18][19] = 54;
			
			//Row 20 
			
			intArray[19][0] = 1;
			intArray[19][1] = 70;
			intArray[19][2] = 54;
			intArray[19][3] = 71;
			intArray[19][4] = 83;
			intArray[19][5] = 51;
			intArray[19][6] = 54;
			intArray[19][7] = 69;
			intArray[19][8] = 16;
			intArray[19][9] = 92;
			intArray[19][10] = 33;
			intArray[19][11] = 48;
			intArray[19][12] = 61;
			intArray[19][13] = 34;
			intArray[19][14] = 52;
			intArray[19][15] = 1;
			intArray[19][16] = 89;
			intArray[19][17] = 19;
			intArray[19][18] = 67;
			intArray[19][19] = 48;
			
			for (int row = 0; row < 20; row ++ )
			{
				for (int column = 0; column < 20; column ++)
				{
					System.err.println("Checking " + row + " x " + column);
					
					internalTemp = 1;					
					//Check Right
					if (column <= 16)
					{
						System.err.println("Checking Right");
						for (int Offset = 0; Offset < 4; Offset ++)
						{
							internalTemp = internalTemp * intArray[row][column + Offset];
						}
						
						if (internalTemp > currentMax) currentMax = internalTemp;
					}
				
					internalTemp = 1;
					//Check Down
					if (row <= 16)
					{
						System.err.println("Checking Down");
						for (int Offset= 0; Offset < 4; Offset ++)
						{
							internalTemp = internalTemp * intArray[row + Offset][column];
						}
						
						if (internalTemp > currentMax) currentMax = internalTemp;
					}
					
					
					internalTemp = 1;
					// TODO Diagonal UP & LEFT: 
					if (row >= 3)
					{
						if (column >= 3)
						{
							System.err.println("Checking Up Left");
							//Move up!
							for (int Offset = 0; Offset < 4; Offset ++)
							{
								internalTemp = internalTemp * intArray[row - Offset][column - Offset];
							}
						}
					if (internalTemp > currentMax) currentMax = internalTemp;
					}
				
					internalTemp = 1;
					//Up & Right
					if (row >= 3)
					{
						if (column <= 16)
						{
							System.err.println("Checking Up Right");
							for (int Offset = 0; Offset < 4; Offset ++)
							{
								internalTemp = internalTemp * intArray[row - Offset][column + Offset];
							}
						}
					if (internalTemp > currentMax) currentMax = internalTemp;
					}
					
					// TODO Diagonal DOWN & LEFT:
					// if column < 4, continue
					// if row < 4, continue
					
					internalTemp = 1;
					if (row <= 16)
					{
						if (column >= 3)
						{
							System.err.println("Checking Down Left");
							for (int Offset = 0; Offset < 4; Offset ++)
							{
								internalTemp = internalTemp * intArray[row + Offset][column - Offset];
							}
						}
					if (internalTemp > currentMax) currentMax = internalTemp;
					}

					
					// TODO Diagonal DOWN & RIGHT:
					// if size - row < 4, continue
					// if size - column < 4, continue
					internalTemp = 1;
					if (column <= 16)
					{
						if (row <= 16)
						{
							System.err.println("Checking Down Right");
							for (int Offset = 0; Offset < 4; Offset ++)
							{
								internalTemp = internalTemp * intArray[row + Offset][column + Offset];
							}
						}
					if (internalTemp > currentMax) currentMax = internalTemp;
					}
					
				}
			}
			
			System.out.println("The Max is: " + currentMax);
	}

}
