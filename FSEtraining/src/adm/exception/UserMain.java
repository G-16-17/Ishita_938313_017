package adm.exception;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter userid,name,age");
		String str= sc.nextLine();
		//User user=new User(10,"Tom",10);
		
		try {
			User user=User.createUser(str);
			System.out.println("User Created Successfully");
			System.out.println(user);
			
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		
		}

	}

}
