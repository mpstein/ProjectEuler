package problem9PythagTriplet;

public class PythagoreanTriplet {

	// a^2 + b^2 = c^2
	//find abc where a + b + c = 1000
	//such that a < b < c
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 1000; i++)
		{
			for (int j = i; j < 1000; j++)
			{
				for (int k = j; k < 1000; k++ )
				{
					if (i + j + k == 1000)
						{
							if (((i*i) + (j*j)) == (k*k))
							{
								System.out.println("A: " + i + "; B: " + j + "; C: " + k);
								System.out.println("Yo mamma is: " + i*j*k);
							}
						}
				}
			}
		}

	}

}