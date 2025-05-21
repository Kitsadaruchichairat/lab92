package exchange;
import java.io.*;
import java.util.Scanner;

public class Command {
	public static void main(String[] args) {
		String coinname,output; 
		double amount=0,coin=0,result=0.0,sum=0.0;
		 Exchange ex = new Exchange();

		try {
		FileWriter outfile = new FileWriter("C:/java/ThaiBaht.txt");
		FileReader infile = new FileReader("C:/java/ExchangeList.txt");
		Scanner input = new Scanner(infile);
		
		while(input.hasNext()) {
			coin = input.nextDouble();
			coinname = input.next();
		
		
	
		 

		if(coinname.equals("USD"))
			result= ex.exchangeUSD(coin);
		else if(coinname.equals("EURO"))
			result= ex.exchangEURO(coin);
		else if (coinname.equals("YEN"))
			result=	ex.exchangeYEN(coin);
		else if ( coinname.equals("POUND"))
			result= ex.exchangePOUND(coin);
		
		sum= sum += result;
		output = String.format(" %.2f  %s = %.2f  ",coin,coinname, result);
		
		outfile.write(output + "Bath \n" );
		
		} //end of while
		outfile.write(String.format(">>> Summation = %.2f Bath\n\n", sum));
		infile.close();
		outfile.close();
		} catch (IOException error) {
		error.printStackTrace();
		 }
		 }//end of main()

}
