public class DataType{
	//int 4个字节
	//long 长整型 8个字节
	//double 双精度浮点型 8个字节
	//float 单精度浮点型 4个字节
	//char 字符数据类型  2个字节
	//byte 字节类型  1个字节
	//short 短整型  2个字节
	//boolean 布尔类型  没有规定字节数
	public static void main1(String[] args){//main才是主函数，main1、main2等都不是，可以相当于注释
		long a=10L;//不加L是整形，加了L才是长整型
		System.out.println(a);
		System.out.println("最大值：" + Long.MAX_VALUE);// + 拼接
		System.out.println("最小值：" + Long.MIN_VALUE);
		int b=10;
		int c=20;
		System.out.println(b + c);//30
		System.out.println("hehe" + b + c);
		//任意类型的数据和字符串进行拼接，结果都是字符串
	}
	
	
	public static void main2(String[] args){//String[] args  运行时命令行参数
		for(int i=0;i<args.length;i++){//在运行时输入字符串，可以打印出来
			System.out.println(args[i]);
		}
		System.out.println("hhh");
	}
	
	
	
	//int     long   double  float  short   boolean  char       基本数据类型
	//Integer Long   Double  Float  Short   Boolean  Character  包装类  后期使用非常方便
	public static void main3(String[] args){
		//双精度浮点型
		
		/*double d = 12.5;//12.5默认时双精度类型
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		int a = 1;
		int b = 2;
		System.out.println(1 / 2);*/
		/*double a = 1.0;
		double b = 2.0;
		System.out.println(a / b);*/
		double num = 1.1;
		System.out.println(num * num);
	}
	public static void main4(String[] args){
		//单精度浮点型
		
		float f=12.3f;
		System.out.println(f);
	}
	public static void main5(String[] args){
		//字符数据类型 char 0-65535
		char ch='a';
		System.out.println(ch);
		char ch2='吴';//一个汉字就是2个字节
		System.out.println(ch2);
	}
	public static void main6(String[] args){
		//byte 字节类型 1个字节 
		byte b=12;
		byte c=21;
		System.out.println(Byte.MAX_VALUE);// 127
		System.out.println(Byte.MIN_VALUE);// -128
		System.out.println(b+" "+c);
	}
	public static void main7(String[] args){
		//短整型
		short sh=12;
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MIN_VALUE);//-32768
	}
	public static void main8(String[] args){
		//布尔类型
		//在Java当中，布尔类型没有明确的大小
		//在java当中，布尔类型只有两个取值 true和false
		//在Java当中，没有所谓的0是假，非0为真，true就是真，false就是假
		boolean flg=false;
		System.out.println(flg);
	}
	public static void main9(String[] args){
		//字符串数据类型
		//String
		String str="\"hello\"";//打印"hello",使用转义字符\	
		System.out.println(str);
		//字符串的+操作，表示字符串拼接
		//还可以用字符串和整形进行拼接
	}
	public static void main10(String[] args){
		//变量的命名规则
		//1.一个变量名只能包含数字，字母，下划线
		//2.数字不能开头
		//3.变量名是大小写敏感的.即num和Num是两个不同的变量
		//4.变量命名推荐小驼峰命名法，当一个变量名由多个名词构成的时候，除了第一个但此外，其他单词首字母大写
		
		//常量
		//1.字面常量10  “abc”  1.0
		
		//2.final修饰的变量  变量名要全部大写
	}
	public static void main(String[] args){
		//类型转换
		//1.隐式类型转换   把一个小类型数据给大类型
		//2.显式类型转换   把一个大类型数据给小类型，需要进行强制类型转换
		long a=10L;
		int b=(int)a;
		System.out.println(b);
		//int不能和boolean相互赋值
	}
}