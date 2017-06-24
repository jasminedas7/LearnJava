class SumOf2Numbers {
	public static void main(String[] args) {
		int sumOf2And3 = add(2,3);
		System.out.println(sumOf2And3);
		System.out.println(add(4,3));
		System.out.println(add(4,8));
	}

	static int add(int num1, int num2){
		// Input of functions are called parameters
		return num1 + num2;
		// Output of functions are called return value
	}
}