package oops.overriding;

public class PlatinnumAccount extends GoldAccount {
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		System.out.println("Facilities with Gold Account");
		g.rateOfInterest();
		g.onLineService();
		g.chequeBooks();
		
		PlatinnumAccount p = new PlatinnumAccount();
		System.out.println("Facilities with Platinnum Account");
		p.rateOfInterest();
		p.onLineService();
		p.chequeBooks();
	}
	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest per year: 6%");
	}
	@Override 
	public void chequeBooks() {
		System.out.println("Number of cheque books limit per year: Unlimited");
	}
}
