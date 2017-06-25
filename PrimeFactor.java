class PrimeFactor {
	public static void main(String ar[]) {

		int i,num1=22,num2=36,index1=0;
		int factor[]=new int[100];
		int num=num1;
		while(num!=1) { 
			for(i=2;i<=num;i++) {
	            if(num%i==0) {
					factor[index1]=i;
					index1++;
					num=num/i;
					break;
		        }
        	}
		}
		int index2=0;
		int factorOf36[]=new int[200];
		num=num2;
		while(num!=1) { 
			for(i=2;i<=num;i++) {
	            if(num%i==0) {
					factorOf36[index2]=i;
					index2++;
					num=num/i;
					break;
		        }
        	}
		}
		printArray(num1, factor, index1);
		printArray(num2, factorOf36, index2);
    }

    public static void printArray(int num,int factor[],int length){
     	System.out.println("Primefactors of " + num);
    	for(int j=0;j<length;j++){
    		         	System.out.println(factor[j]);
		}
    }
}
