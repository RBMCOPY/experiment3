package experiment3;

import java.util.Scanner;

public class Test_JavaProgram {
	static double revenue=10000;
    static String name;     //����
	static String sex;      //�Ա�
	static int age;         //����
	static int tuition;     //ÿѧ��ѧ��
	static int salary;      //ÿ��нˮ
	static int x;
	static DoctoralCandidate[] Doctor = new  DoctoralCandidate[10];
	static TeacherManagement[] tea= new  TeacherManagement[10];
	static StudentManagement[] stu= new  StudentManagement[10];
	public static void main(String[] args) {
		System.out.println("********�о�����ʿ��Ϣ¼��********");//8
		System.out.println("������¼��������");
		Scanner reader0 = new Scanner(System.in);
		try{
			x = reader0.nextInt();
		}
        catch(Exception e){
        	System.out.println("��������ȷ��ʽ��");
        
		}
		
		for(int i=0;i<x;) {
			Scanner reader = new Scanner(System.in);
			System.out.println("�����������������Ա����䡢ѧ��ѧ�ѡ��¹��ʣ�");			
			Doctor[i] = new DoctoralCandidate();
			name = reader.nextLine();
			Doctor[i].name=name;
			sex = reader.nextLine();
			Doctor[i].sex=sex;
			age = reader.nextInt();
			Doctor[i].age=age;
			tuition = reader.nextInt();
			Doctor[i].tuition=tuition;
			salary = reader.nextInt();
			Doctor[i].salary=salary;
			i++;
		}
		System.out.println("���  ����  �Ա�  ����   ѧ��ѧ��   �¹���");
		for(int i=0;i<x;) {
			giveRevenue(Doctor[i].salary,Doctor[i].revenue);	 
			try {
				giveSalary(Doctor[i].getSalary(),Doctor[i].getTuition());			
		}
			catch(MoneyException e) {
				System.out.println("��������ȷѧ�ѣ�");
				System.out.println(e.warnMess());
		    }
			
			System.out.println("  "+(i+1)+"     "+Doctor[i].name+"    "+Doctor[i].sex+"     "+Doctor[i].age+"      "+Doctor[i].tuition+"      "+Doctor[i].salary);
			i++;
			}
		a:for(;;) {
		System.out.println("\n1.���ʲ�ѯ����ȡ\n2.ѧ�Ѳ�ѯ������\n3.�˳�");
		System.out.println("������1~3��");
		try{
		Scanner reader1 = new Scanner(System.in);
		int y =reader1.nextInt();
		if(y==2) {
			for(int i=0;i<x;) {
				System.out.println(Doctor[i].name);
	        	stu[i] =  Doctor[i];
	        	stu[i].showTuition(Doctor[i].tuition);
				stu[i].payTuition(Doctor[i].tuition);
				i++;
			}
			}
			else if(y==1) {
				for(int i=0;i<x;) {
					System.out.println(Doctor[i].name);
					tea[i] =  Doctor[i];
					tea[i].showSalary(Doctor[i].salary,revenue);
					tea[i].giveSalary(Doctor[i].salary,revenue);
					i++;
			}
			}
			else if(y==3) {
				break a;
			
			}
		}
		catch(Exception e){
			System.out.println("��������ȷ����");
		}
		}		
	}
		
    public static void giveSalary(double d,double e) throws MoneyException{//�жϹ��ʺ�ѧ��¼����ȷ��С
		if(d<0||e<0||d<e) {
			throw new MoneyException(d,e);
		}
	}
	public final static double giveRevenue(double salary,double tuition) {
		tuition=tuition/6;                                                             //ƽ��ÿ��ѧ��
		revenue=StudentManagement.buzhu-tuition; //ʵ��˰�ս��
		if(revenue<=5000.00) {                           //3%
			return revenue*0.03;
		}
		else if(revenue>5000.00 && revenue<=12000.00) {  //10%
			return (revenue-5000)*0.1+150;
		}
		else if(revenue>12000.00 && revenue<=25000.00) { //20%
			return (revenue-12000)*0.2+850;
		}
		else if(revenue>25000.00 && revenue<=35000.00) { //25%
			return (revenue-25000)*0.25+3450;
		}
		else if(revenue>35000.00 && revenue<=55000.00) { //30%
			return (revenue-35000)*0.3+5950;
		}
		else if(revenue>55000.00 && revenue<=80000.00) { //35%
			return (revenue-55000)*0.35+11950;
		}
		else if(revenue>80000.00) {                      //45%
			return (revenue-80000)*0.45+20700;
		}
		return 0;
	}
}