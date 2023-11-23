class ti4_19{
	public static void main(String[] args){
		int i,j;//定义两个变量 作为九九乘法表的内外循环变量
		for(i=1 ; i<=9 ; i++){
		for(j=1 ; j<=9 ; j++){
			System.out.print(j+"* "+i+"="+i* j"\t" );
				if(i==j){//i=j的时候就换行，终止本次循环
				break;//跳转到外层循环	
				}
			}
			System.out.println();
		}
	}
}