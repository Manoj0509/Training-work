package lab4exercise3;

class JournalPaper extends WrittenItem {
	private int yearpub;

	public JournalPaper(int idn, String title, int noOfCopies, String author, int yearpub) {
		super(idn, title, noOfCopies, author);
		this.yearpub = yearpub;
	}

	/**
	 * @return the yearpub
	 */
	public int getYearpub() {
		return yearpub;
	}

	/**
	 * @param yearpub
	 *            the yearpub to set
	 */
	public void setYearpub(int yearpub) {
		this.yearpub = yearpub;
	}

}
