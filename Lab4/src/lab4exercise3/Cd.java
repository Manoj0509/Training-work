package lab4exercise3;

class Cd extends MediaItem {
	private String cd_artist;
	private String cd_genre;
	
	
	public Cd(int idn, String title, int noOfCopies, int data, String cd_artist, String cd_genre) {
		super(idn, title, noOfCopies, data);
		this.cd_artist = cd_artist;
		this.cd_genre = cd_genre;
	}


	/**
	 * @return the cd_artist
	 */
	public String getCd_artist() {
		return cd_artist;
	}

	/**
	 * @param cd_artist
	 *            the cd_artist to set
	 */
	public void setCd_artist(String cd_artist) {
		this.cd_artist = cd_artist;
	}

	/**
	 * @return the cd_genre
	 */
	public String getCd_genre() {
		return cd_genre;
	}

	/**
	 * @param cd_genre
	 *            the cd_genre to set
	 */
	public void setCd_genre(String cd_genre) {
		this.cd_genre = cd_genre;
	}

}