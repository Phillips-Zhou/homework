import java.util.Scanner;
class online{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\t\t\t��ӭʹ��˫ʮһ�ۿ���ʾϵͳ\n");
        System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1. �� �� ��\n");
        System.out.println("\t\t\t2. �� �� ��\n");
        System.out.println("\t\t\t3. ʳ Ʒ ��\n");
        System.out.println("\t\t\t4. �� �� ��\n");
        System.out.println("\t\t\t5. �� �� ��\n");
        System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("��������Ҫ��ѯ����Ʒ���ࣺ");
        int num=input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Ǧ��(20֧)����:20Ԫ��Ʒ�ƣ��л�,�Ż�:9��");
                System.out.println("���(һ��)����:4Ԫ��Ʒ�ƣ�,�Ż�:5��");
                break;
            case 2:
                System.out.println("iPhone15Pro(128G)����:7999Ԫ��Ʒ��:Apple,�Ż�:��6000Ԫ��1000Ԫ");
                System.out.println("MacbookPro 14-inch(8G+512G)����:12999Ԫ��Ʒ�ƣ�,�Ż�:��10000Ԫ��1500Ԫ");
                break;
            case 3:
                System.out.println("������Ȼ����ˮ(330ml*6ƿ)���ۣ�29.9Ԫ��Ʒ��:Evian,�Ż�:Ʒ������10Ԫ");
                System.out.println("ԭζ������(300gһ��)����:59Ԫ��Ʒ�ƣ���¡,�Ż�:������40Ԫ");
                break;
            case 4:
                System.out.println("�Կ��ż��ñ���(610L)���ۣ�2199Ԫ��Ʒ��:С��,�Ż�: ���ռٲ�����1999");
                System.out.println("ȫ��ɨ�ϻ�����2(1��)����:3499Ԫ��Ʒ�ƣ�С��,�Żݣ����ּ۲�����2699");
                break;
            case 5:
                System.out.println("FW23 M's 1996 Eco Nuptse Jacket(1��)���ۣ�1539Ԫ��Ʒ��:THE NORTH FACE,�Ż�: ��1000��100���ʱ���");
                System.out.println("Beatϵ�� Lt gore-tex����:3269Ԫ��Ʒ�ƣ�Arcteryx,�Ż�:����HELIAD 6L����");
                break;
            default:
                break;
        }

    }
}