import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Date: ");
		String a = "Stop";
		a = in.nextLine();
		
		System.out.print("Time Started: ");
		String b = "what";
		b = in.nextLine();
		
		System.out.print("Time Finished: ");
		String c = "hello";
		c = in.nextLine();
		
		System.out.print("What You Worked on: ");
		String d = "go away";
		d = in.nextLine();

		System.out.print("What you learned: ");
		String f = "Go";
		f = in.nextLine();

		System.out.print("What's Next: ");
		String g = "Hello World!";
		g = in.nextLine();
		
		String string = a;
		String stringone = b;
		String stringtwo = c;
		String stringthree = d;
		String stringfour = f;
		String stringfive = g;
	
		try{
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter("/home/nathan/Desktop/Java Projects/Data Entry/FIRST FILE.txt"));

			writer.write(("\n") + ("Date: ") + ("\n                    ") + (string) + ("\n\n"));

			writer.write(("\n") + ("Time Started: ") + ("\n                    ") + (stringone) + ("\n\n"));
			
			writer.write(("\n") + ("Time Finished: ") + ("\n                    ") + (stringtwo) + ("\n\n"));
			
			writer.write(("\n") + ("What You Worked on: ") + ("\n                    ") + (stringthree) + ("\n\n"));
			
			writer.write(("\n") + ("What You Learned: ") + ("\n                    ") + (stringfour) + ("\n\n"));

			writer.write(("\n") + ("What's Next: ") + ("\n                    ") + (stringfive) + ("\n\n"));

			writer.close();

			} catch (IOException e) {
			e.printStackTrace();
			return;
			}
		
		}
	}

