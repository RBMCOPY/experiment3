package experiment3;

public class MoneyException extends Exception{
	
	String message;
	public MoneyException(double d,double e) {
		message = "����"+d+"�Ǹ���������ѧ�ѣ���ѧ��"+e+"�Ǹ�����";
	}
	public String warnMess() {
		return message;
	}
}
