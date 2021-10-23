package lab4exercise3;

abstract class Item {
	private int idn;
	private String title;
	private int noOfCopies;

	
	public Item(int idn, String title, int noOfCopies) {
		this.idn = idn;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	// getter and setter functions
	public int getIdn() {
		return idn;
	}

	public void setIdn(int idn) {
		this.idn = idn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void addItem() {
		
	}

	public void deleteItem() {

	}

	public void getAllItems() {

	}

	public void checkIn() {

	}

	public void checkOut() {

	}

}