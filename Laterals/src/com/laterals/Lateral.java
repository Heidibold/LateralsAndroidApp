package com.laterals;



public class Lateral {
	public int id;
	public String title;
	public String puzzle;
	public String solution;
	public String author;
	public String source;
	
	public Lateral(int id, String title, String puzzle, 
			String solution, String author, String source) {
		this.id = id;
		this.title = title;
		this.puzzle = puzzle;
		this.solution = solution;
		this.author = author;
		this.source = source;		
	}
}
