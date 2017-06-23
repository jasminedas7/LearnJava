class PrimeFactor {
	public static void main(String args[]) {
		int i,num=24;
		while(num!=1) { 
			for(i=2;i<=num;i++) {
	            if(num%i==0) {
					System.out.println(i);
					num=num/i;
					break;
		        }
        	}
		}
	}
}