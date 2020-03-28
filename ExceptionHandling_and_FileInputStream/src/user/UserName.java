package user;
import beans.Employee;
public class UserName {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
         emp1.empid=1001;
         emp1.ename="pavan";
         emp1.salary =9999;
        
         emp1.empid=1002;
         emp1.ename="chandu";
         emp1.salary =9990;
         System.out.println(emp1.empid+" "+emp1.ename+" "+emp1.salary );
         //System.out.println(emp2.empid+" "+emp2.ename+" "+emp2.salary );
         
	}

}
