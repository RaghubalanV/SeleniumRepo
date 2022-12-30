package week1.day1Assignment;

public class Mobile {
	public void makeCall() {
		String mobileModel="oneplus";
float mobileWeight = 155.03f;
System.out.println(mobileModel);
System.out.println(mobileWeight);
	}


public void sendmsg() {
	boolean isFullCharged =true;
			int mobilecost= 33000;
	System.out.println(isFullCharged);
	System.out.println(mobilecost);
}
public static void main(String[] args) {

	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendmsg();
System.out.println("This is my mobile");
}
}