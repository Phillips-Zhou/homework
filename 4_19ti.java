class ti4_19{
	public static void main(String[] args){
		int i,j;//������������ ��Ϊ�žų˷��������ѭ������
		for(i=1 ; i<=9 ; i++){
		for(j=1 ; j<=9 ; j++){
			System.out.print(j+"* "+i+"="+i* j"\t" );
				if(i==j){//i=j��ʱ��ͻ��У���ֹ����ѭ��
				break;//��ת�����ѭ��	
				}
			}
			System.out.println();
		}
	}
}