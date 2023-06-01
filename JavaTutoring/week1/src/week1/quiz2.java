package week1;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=9;i++)
		{
			System.out.print("==== " + i + "단" + "====\n" );
			
			for(int k=1;k<=9;k++)
			{
				System.out.print(" " + i + " x " + k + " = " + (k*i) + "\n");
			}
			
			System.out.print("\n");
		}

	}

}
