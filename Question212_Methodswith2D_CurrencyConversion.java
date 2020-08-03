package week7_Array_2D_ArrayList;



public class Question212_Methodswith2D_CurrencyConversion {

	public static void main(String[] args) {
		// olcay // Jul 27, 2020
		
		  
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
//	     double res = Main.convertC(test_money,test_convert);
//	     System.out.print(res);
	     
	     System.out.println(convertC(test_money, test_convert));
	}
	
	public static  double convertC(String[][] money,String[][] convertionRate) {
		
		double[][] convert = new double[money.length][2];
		
		for(int i=0;i<money.length;i++) {
			convert[i][0]=Double.parseDouble(money[0][1]);
			convert[i][1]=Double.parseDouble(convertionRate[0][1]);
		}
		double sum=0;
		for(int i=0; i<convert.length; i++) {
			sum+=convert[i][0]*convert[i][1];
		}
		return sum;
		
	}

}
