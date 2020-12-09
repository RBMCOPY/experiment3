# 计192 2019310194 小头儿子

# JAVA实验三
# 阅读程序
## 实验目的
1.掌握Java中抽象类和抽象方法的定义；    
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法   
3.了解异常的使用方法，并在程序中根据输入情况做异常处理   
  
## 实验过程
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。   
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。   
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。   
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。   
  
## 实验要求
1.在”博士研究生类”中实现各个接口定义的抽象方法;   
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；   
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。   
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。   
5.根据输入情况，要在程序中做异常处理。   
  
## 实验步骤
1.根据要求设计接口  
2.添加类调用接口并重写接口方法  
3.添加主类并定义变量  
4.查阅税收规则编辑函数    
5.排版输出顺序  
6.测试程序 
7.撰写实验报告  
8.完成实验 

## 核心方法
1.根据过程学出两个接口  
public interface TeacherManagement {  
	void giveSalary(double salary,double revenue);  
	void showSalary(double salary,double revenue);  
}  
2.调用两个接口  
public class DoctoralCandidate implements StudentManagement,TeacherManagement{  
}  
3.重写接口方法  
public void payTuition(double tuition) {  
		account=account-tuition;  
		System.out.println("操作成功！");  
		System.out.println("账户余额："+account);  
	}   
	public void showTuition(double tuition) {  
		tuition=tuition-buzhu;  
		System.out.println("本学期学费："+tuition);  
		System.out.println("本学年学费："+2*tuition);  
	}   
	public void showSalary(double salary,double revenue) {    
		System.out.println("工资："+(salary-revenue));  
		System.out.println("年实际工资："+12*(salary-revenue));  
	}  
	public void giveSalary(double salary,double revenue) {  
		account=account+(salary-revenue);  
		System.out.println("操作成功！");  
		System.out.println("账户余额："+account);  
	}  
4.添加主类，进行定义变量，构造对象属性，构造主函数工作  
  public class Test_JavaProgram {  
	static double revenue=10000;  
    static String name;     //姓名  
	  static String sex;      //性别  
	  static int age;         //年龄  
	  static int tuition;     //每学期学费  
	  static int salary;      //每月薪水  
	  static int x;  
	  static DoctoralCandidate[] Doctor = new  DoctoralCandidate[10];  
	  static TeacherManagement[] tea= new  TeacherManagement[10];  
	  static StudentManagement[] stu= new  StudentManagement[10];   
    public static void main(String[] args){  
    }  
 5.错误判断函数  
  public class MoneyException extends Exception{  
	String message;  
	public MoneyException(double d,double e) {  
		message = "工资"+d+"是负数或少于学费，或学费"+e+"是负数，";  
	}  
	public String warnMess() {  
		return message;  
	}  
## 实验结果
![1](https://github.com/RBMCOPY/experiment3/blob/main/0178204122b1f57595860ac55a548f9.png)
![2](https://github.com/RBMCOPY/experiment3/blob/main/1fd2c8376f0c9b371359f3b885ec02e.png)
  
## 实验感想
对于这次实验，运用了之前所讲的知识之外，还运用了近期新讲的关于接口的相关知识。讲课时不明白的接口意义也更加清晰明了。这次实验也运用了错误判断的一些知识，让我了解了错误判断的必要性，主要的错误处理方式大概有两种：1. 遇错误方法立即结束并返回值；同时抛出异常对象。2.调用该方法程序也会继续执行下去而搜索处理该异常异常处理器并执行其代码。我们可以通过跑出错误代码或运行结果来判断错误类型，这可以大大减少修改程序时间。通过这次实验我又学到了一部分知识，我相信不断地学习一定可以让我攀登上JAVA的高峰。
