package week3;

public class quiz2 {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		quiz2 showname = new quiz2();
		showname.name = "한아림";
		String anw = showname.showName(showname.name);
		System.out.println("나는 " + anw + "입니다.");
	}
	
	public static String showName(String name)
	{
		String NAME = name;
		return NAME;
	}

}
