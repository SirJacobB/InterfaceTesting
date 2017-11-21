import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		
		ArrayList<Person> persons = new ArrayList<>();
		
		Scanner sc = new Scanner(new File("Persons.txt"));
		
		while(sc.hasNextLine()) {
			Person p = new Person(sc.nextLine());
			
			persons.add(p);
		}
		
		System.out.println(persons);
		
		sc.close();
	}
}
