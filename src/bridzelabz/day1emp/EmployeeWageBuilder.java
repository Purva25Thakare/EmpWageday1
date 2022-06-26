package bridzelabz.day1emp;

public class EmployeeWageBuilder {
public static void main(String[] args)
{
	System.out.println("Hello Welcome to Employee wage Calculator");
	
	int ISPRESENT = 1;
	int Wagephour = 20;
	int hours = 8;
	int workingdays = 20;
	/*int parthrs=4;*/
	double empcheck=Math.floor(Math.random() * 10 % 2);
	/*int empwage = Wagephour * hours ;*/
	/*int wagepartime = parthrs * Wagephour ;*/
	int monthwage= workingdays * hours * Wagephour ;
	if(empcheck == ISPRESENT) {
	System.out.println("Employee is Present");
	/*System.out.println ("Wage of Employee" + empwage);
	System.out.println ("Wage of Part time Employee" + wagepartime);*/
	System.out.println (" Monthly Wage of Employee" + monthwage);
	}
		else {
			
		
			System.out.println("Employee is Absent");
	
		}
	
}

}
