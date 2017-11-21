
public class Person implements Comparable<Person>{

	private String fName;
	private String lName;
	private int index;

	Person(String fullName){

		char[] cArr = fullName.toCharArray();

		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] == ' ') {
				index = i;
			}
		}
		
		this.fName = fullName.substring(index+1);
		this.lName = fullName.substring(0, index);
	}
	
	public String getFullName() {
		return lName + " " + fName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public int compareTo(Person o) {

		String str1 = fName.substring(0, 2);
		String str2 = lName.substring(0, 2);
		
		if(str2.compareTo(o.getlName()) == 0) {
			return str1.compareTo(o.getfName());
		}
		else {
			return str2.compareTo(o.getlName());
		}
	}
}
