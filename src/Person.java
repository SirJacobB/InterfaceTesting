
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
		
		return 0;
	}
}
