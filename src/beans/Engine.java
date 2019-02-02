package beans;

public class Engine {
	private String companyName;
	private String modelYear;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	@Override
	public String toString() {
		return "company name: "+companyName+"\nmodel year: "+modelYear;
	}
}
