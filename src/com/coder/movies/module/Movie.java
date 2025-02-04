package com.coder.movies.module;

public class Movie {
		
	private int id;
	private String tital;
	private int releaseDate;
	private float rating;
	private String category;
	private String cast;
	private String director;
	
	
	
	public Movie(int id, String tital, int releaseDate, float rating, String category, String cast, String director) {
		super();
		this.id = id;
		this.tital = tital;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.category = category;
		this.cast = cast;
		this.director = director;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", tital=" + tital + ", releaseDate=" + releaseDate + ", rating=" + rating
				+ ", category=" + category + ", cast=" + cast + ", director=" + director + "]";
	}
	
	
}
