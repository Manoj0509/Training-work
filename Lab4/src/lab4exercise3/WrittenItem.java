package lab4exercise3;

abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int idn, String title, int noOfCopies, String author) {
		super(idn, title, noOfCopies);
		this.author = author;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}