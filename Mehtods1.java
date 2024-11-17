class  MethodOverInstead
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
       m1(10,11,33,22);
	}
	public static void m1(int... A)
	{
		//How many variables entered into a method 
		int count = 0;
		for (int i : A )
		{
			++count;
			//printing all variables of it 
			//System.out.println();
			System.out.print(i);
		}

	}
}
