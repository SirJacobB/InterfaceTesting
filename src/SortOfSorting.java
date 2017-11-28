import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortOfSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Name> list = new ArrayList<Name>();
		
		while(!sc.hasNext("0")) {
			int n = sc.nextInt();sc.nextLine();
			for(int i = 0; i < n; i++) {
				Name name = new Name(sc.nextLine());
				list.add(name);
			}
			
			Collections.sort(list);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
			list.clear();
		}
		sc.close();
	}
}

class Name implements Comparable<Name>{

	private String name;

    public Name(String str){
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Name name) {
        
        String str1 = name.getName().substring(0,2);
        String str2 = this.getName().substring(0,2);
        
        return str2.compareTo(str1);

    }
}
