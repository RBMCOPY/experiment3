package experiment3;

public class DoctoralCandidate implements StudentManagement,TeacherManagement {
	
	String name;     //����
	String sex;      //�Ա�
	int age;         //����
	double tuition;     //ÿѧ��ѧ��
	double salary;      //ÿ��нˮ
	double revenue;  //ʵ��˰�� 
    double account;  //�˻����
    void setTuition(int tuition) {
		this.tuition = tuition;	
	}
	double getTuition() {
		return tuition;	
	}
	void setSalary(int salary) {
		this.salary =salary;	
	}
	double getSalary() {
		return salary;	
	}
	
	public void payTuition(double tuition) {
		account=account-tuition;
		System.out.println("�����ɹ���");
		System.out.println("�˻���"+account);
	}

	public void showTuition(double tuition) {
		tuition=tuition-buzhu;
		System.out.println("��ѧ��ѧ�ѣ�"+tuition);
		System.out.println("��ѧ��ѧ�ѣ�"+2*tuition);
	}
	
	public void showSalary(double salary,double revenue) {                       //�����ڷ��Ź����Ժ������ʾ
		System.out.println("���ʣ�"+(salary-revenue));
		System.out.println("��ʵ�ʹ��ʣ�"+12*(salary-revenue));
	}
	
	public void giveSalary(double salary,double revenue) {
		account=account+(salary-revenue);
		System.out.println("�����ɹ���");
		System.out.println("�˻���"+account);
	}

}
