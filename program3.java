class Employee {
	int basic;
	int total_sal;
	Employee()
	{
	basic = 50000;
	}
	}
	class Programmer extends Employee //single-level inheritance
	{
	// Programmer class inherits from Employee class
	int p_bonus;
	Programmer()
	{
	p_bonus = 10000;
	}
	void salary() {
	total_sal = basic + p_bonus;
	System.out.println("The programmer's salary is "+ total_sal);
	}
	}
	class techlead extends Programmer //multilevel inheritance
	{
	int t_bonus;
	techlead()
	{
	t_bonus = 20000;
	}
	void salary() {
	total_sal = basic + p_bonus + t_bonus;
	System.out.println("The techlead's salary is "+ total_sal);
	}
	}
	class program3	{
	public static void main(String ar[])
	{
	Programmer p = new Programmer();
	p.salary();
	techlead t = new techlead();
	t.salary();
	}
	}