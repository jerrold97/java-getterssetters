package davidOOP;

public class Student {
	private String name;
	private int age;
	private float allowance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
	    if(name.matches("[a-zA-Z]+")){ // only letters
			this.name = name;
	    }else{
	        this.name = "";
	    }

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 15 && age <= 65)
		{
			this.age = age;		
		}
		else
		{
			this.age = 0;
		}

	}
	public float getAllowance() {
		return allowance;
	}
	public void setAllowance(float allowance) {
		if(allowance >= 100 && allowance <= 500)
		{
			this.allowance = allowance;	
		}
		else
		{
			this.allowance = 0;
		}

	}

}
