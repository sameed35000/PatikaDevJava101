public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	double salaryTax;
	double salaryBonus;
	double raise;
	double overTime;

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
	}

	double tax() {
		if (this.salary <= 1000) {
			this.salaryTax = 0;
			return 0.0;
		} else if (this.salary > 1000) {
			this.salaryTax = this.salary * 0.03;	
		}
		return this.salaryTax;
	}

	double bonus() {
		if (this.workHours > 40) {
			overTime = this.workHours - 40;
			this.salaryBonus = overTime * 30.0;
		}
		return this.salaryBonus;
	}

	double raiseSalary() {
		int currentYear = 2021;
		if (currentYear - this.hireYear < 10) {
			this.raise = this.salary * 0.05;
		} else if (9 < currentYear - this.hireYear && currentYear - this.hireYear < 20) {
			this.raise = this.salary * 0.10;
		} else if (currentYear - this.hireYear > 19) {
			this.raise = this.salary * 0.15;
		}
		return this.raise;
	}

	void printEmployee() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı: " + this.hireYear);
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maaş Artışı: " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile Maaş: " + ((this.salary+bonus()+raiseSalary())-tax()));
		System.out.println("Toplam Maaş: " + (this.salary+bonus()+raiseSalary()));

	}

}
