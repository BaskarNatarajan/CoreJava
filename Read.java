import java.util.*;
import java.io.*;

public class Read {
	
	private void ReadnDisplay()
	{
		System.out.println("Enter the String");
	Scanner scan=new Scanner(System.in);
	String str = scan.nextLine();
	scan.close();
	System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Read r=new Read();
		r.ReadnDisplay();

	}

}
