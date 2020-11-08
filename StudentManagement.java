package experiment3;

public interface StudentManagement {//作为学生身份的“行为标准”
	int buzhu = 60;    //补贴
	void payTuition(double tuition);//缴纳学费
	void showTuition(double tuition);//查询学费

}
