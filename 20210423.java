public  class Test{

   public static void main(String[] arge){

       System.out.print("请输入年份");

   int year;    //定义输入的年份名字为“year”

   Scanner scanner = new Scanner(System.in);

   year = scanner.nextInt();

   if (year<0){

       System.out.println("年份有误，程序退出！");

       System.exit(0);

       }

   if ((year%4==0)&&(year%100!=0)||(year%400==0))

       System.out.println(year+" 是闰年");

   else

       System.out.println(year+"不 是闰年 ");

    }

}
