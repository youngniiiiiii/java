package inherit.copy;

public class TaxCal {  //promotion개념 
	
		public double getTax(Employee e) {
			double result = 0.0;
			result = e.getAnnSalary() * 0.17;
			return result;
		}
	}
