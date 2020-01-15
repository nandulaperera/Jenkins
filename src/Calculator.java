public class Calculator{
	public static void main(String args[]){
		int number1=Integer.valueOf(args[0]);
		int number2=Integer.valueOf(args[1]);
		int result=number1-number2;
		System.out.println(number1+" - "+number2+" = "+result);
	}
}