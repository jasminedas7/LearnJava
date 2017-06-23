class PrimeFactor {
	public static void main(String args[]) {
		int i,num=24,index=0;
		int factor[]=new int[100];
		while(num!=1) { 
			for(i=2;i<=num;i++) {
	            if(num%i==0) {
					System.out.println(i);
					factor[index]=i;
					index++;
					num=num/i;
					break;
		        }
        	}
		}
		for(int j=0;j<index;j++){
			System.out.println(factor[j]);
		}
	}
}