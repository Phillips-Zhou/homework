class z12{
  public static void main(String[] args){
	int i,j,t,a[]={6,9,7,4,3};
	System.out.println("原序列为:");
	for(i=0;i<a.length;i++){
	  System.out.print(a[i]+"\t");
	}
	for(i=0;i<a.length-1;i++){
	  for(j=0;j<a.length-i-1;j++){
	    if(a[j]>a[j+1]){
		t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
		}	
	     }
	  }
	  System.out.println("\n排序后序列为:");
	  for(i=0;i<a.length;i++){
	    System.out.print(a[i]+"\t");
	}
     }
}