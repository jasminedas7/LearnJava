class Series{
	public static void main(String args[]){
		int i , j=0;
		int sum[]=new int[10];
		for(i=1;i<=10;i++){ 
		 	sum[i-1]=i*i;
		 	
		}
		for(j=0;j<sum.length;j++){
			System.out.println(sum[j]);
		}
	}
}
//print 1 once, 2 twice.....
//sum of every row in an array