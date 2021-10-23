package lab4exercise3;

abstract class MediaItem extends Item {
	private int data;


	public MediaItem(int idn, String title, int noOfCopies, int data) {
		super(idn, title, noOfCopies);
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}