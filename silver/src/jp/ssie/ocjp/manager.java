package jp.ssie.ocjp;

public class manager extends Staff0v{
	int salary=50000;

	public int getSalary() {
		return salary;
	}

	@Override
	public String getName() {
		return "[マネージャー]"+name;
	}
	
	
}
