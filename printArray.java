class printArray {
	public static void main(String args[]){
		int arrayOfNumbers[] = new int[5];
		int sum = 0;
		arrayOfNumbers[0]=1;
		arrayOfNumbers[1]=2;
		arrayOfNumbers[2]=3;
		arrayOfNumbers[3]=4;
		arrayOfNumbers[4]=5;

		for (int i = 0;i < 5 ;i++) {
			sum = sum + arrayOfNumbers[i];
			// System.out.println(arrayOfNumbers[i]);
		}
		System.out.println(sum);
		
		for(int i = 0; i < 3;i = i + 1){
			// System.out.println("Jasmine");
		}

		// System.out.println(arrayOfNumbers[0]);
		// System.out.println(arrayOfNumbers[1]);
		// System.out.println(arrayOfNumbers[2]);
		// System.out.println(arrayOfNumbers[3]);
		// System.out.println(arrayOfNumbers[4]);
		
	}
}