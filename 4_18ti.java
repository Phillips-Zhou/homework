class ti4_18{
	public static void main(String[] args){
		for(int i=0 ; i<7 ; i++){//外层循环
			for(int j=0 ; j<=i ; j++){//内层循环，重点为外层循环的次数
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}