public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();
        System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        int type = sc.nextInt();
        //定义变量用于接收结果
        double result = 0;
        switch(type) {
            case 0://做加法
                result = a + b;
                System.out.println(a+"+"+b+"="+result);
                break;
            case 1:
                result = a - b;
                System.out.println(a+"-"+b+"="+result);
                break;
            case 2:
                result = a * b;
                System.out.println(a+"*"+b+"="+result);
                break;
            case 3:
                result = a / (b + 0.0);
                System.out.println(a+"/"+b+"="+result);
                break;
            default:
                System.out.println("您输入有误");
        }
    }