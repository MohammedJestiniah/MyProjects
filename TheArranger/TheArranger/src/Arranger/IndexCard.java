package Arranger;


public class IndexCard {
	private String category;
	private String noteTitle;
	private String stringNote;
	
	// Constructor:
	public IndexCard(){
		System.out.println("Warning: an empty Note object is created !!!\n");			
	}
	
	public IndexCard(String category, String noteTitle, String stringNote){
		this.category = category;
		this.noteTitle = noteTitle;
		this.stringNote = stringNote;
		
	}
				
	// Methods and Functions:
				
				
	// Getters and Setters:
		
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getStringNote() {
		return stringNote;
	}
	public void setStringNote(String stringNote) {
		this.stringNote = stringNote;
	}
	
}