class PrimeFactor {
	public static void main(String args[]) {

		int i,num,num1=22,num2=36;
		int factorsOfNum1[], factorsOfNum2[];
		factorsOfNum1 = findFactors(num1);
		factorsOfNum2 = findFactors(num2);
		printArray(num1, factorsOfNum1);
		printArray(num2, factorsOfNum2);
		
    }


    public static int[] findFactors(int number){
    	int index = 0;
		int factors[] = new int[10];
		int num = number;
		while(num!=1) { 
			for(int i=2;i<=num;i++) {
	            if(num%i==0) {
					factors[index]=i;
					index++;
					num=num/i;
					break;
		        }
        	}
		}
		return factors;
    }

    //First line of function is called signature
    public static void printArray(int num,int factor[]){
    	
    	   	System.out.println("Primefactors of " + num);
    	for(int j=0;j<factor.length;j++){
         	System.out.println(factor[j]);
		}if(factors[index]==0)
    	{
          break;
    	}  
    }
}
