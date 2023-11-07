import java.util.Scanner;
class online{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\t\t\t欢迎使用双十一折扣显示系统\n");
        System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1. 文 具 类\n");
        System.out.println("\t\t\t2. 数 码 类\n");
        System.out.println("\t\t\t3. 食 品 类\n");
        System.out.println("\t\t\t4. 家 电 类\n");
        System.out.println("\t\t\t5. 服 饰 类\n");
        System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("请输入需要查询的商品种类：");
        int num=input.nextInt();
        switch (num) {
            case 1:
                System.out.println("铅笔(20支)单价:20元，品牌：中华,优惠:9折");
                System.out.println("格尺(一个)单价:4元，品牌：,优惠:5折");
                break;
            case 2:
                System.out.println("iPhone15Pro(128G)单价:7999元，品牌:Apple,优惠:满6000元减1000元");
                System.out.println("MacbookPro 14-inch(8G+512G)单价:12999元，品牌：,优惠:满10000元减1500元");
                break;
            case 3:
                System.out.println("依云天然饮用水(330ml*6瓶)单价：29.9元，品牌:Evian,优惠:品牌立减10元");
                System.out.println("原味扁桃仁(300g一件)单价:59元，品牌：沃隆,优惠:两件减40元");
                break;
            case 4:
                System.out.println("对开门家用冰箱(610L)单价：2199元，品牌:小米,优惠: 节日假不高于1999");
                System.out.println("全能扫拖机器人2(1件)单价:3499元，品牌：小米,优惠：到手价不高于2699");
                break;
            case 5:
                System.out.println("FW23 M's 1996 Eco Nuptse Jacket(1件)单价：1539元，品牌:THE NORTH FACE,优惠: 满1000减100包邮保价");
                System.out.println("Beat系列 Lt gore-tex单价:3269元，品牌：Arcteryx,优惠:赠送HELIAD 6L背包");
                break;
            default:
                break;
        }

    }
}