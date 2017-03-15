package Arranger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;


public class Paper {
	
	private String TXT;
	public static String PATH;
	private String title;
	private String downloadDate;
	private String publishDate;
	private String referennces;
	private String BibtexString;
	
	//..............................................................................................
	public PDFParser parser;
	 public PDFTextStripper pdfStripper;
	   public PDDocument pdDoc ;
	   public COSDocument cosDoc ;
	   
	   
	   public String Text ;
	   public String filePath;
	   public String getFilePath() {
		return filePath;
	}
	public void c(String filePath) {
		this.filePath = filePath;
	}
	public File file;

	    public Paper() {
	        
	    }
	   public String ToText() throws IOException
	   {
	       this.pdfStripper = null;
	       this.pdDoc = null;
	       this.cosDoc = null;
	       
	       
	       file = new File(filePath);
	       parser = new PDFParser(new FileInputStream(file));
	       
	       parser.parse();
	       cosDoc = parser.getDocument();
	       pdfStripper = new PDFTextStripper();
	       pdDoc = new PDDocument(cosDoc);
	       pdDoc.getNumberOfPages();
	       pdfStripper.setStartPage(1);
	        pdfStripper.setEndPage(pdDoc.getNumberOfPages());
	       Text = pdfStripper.getText(pdDoc);
	       pdDoc.close();
	       return Text;
	   }
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		
	
		
	}
	public String getTXT() {
		return TXT;
	}
	public void setTXT(String tXT) {
		TXT = tXT;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDownloadDate() {
		return downloadDate;
	}
	public void setDownloadDate(String downloadDate) {
		this.downloadDate = downloadDate;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getReferennces() {
		return referennces;
	}
	public void setReferennces(String referennces) {
		this.referennces = referennces;
	}
	public String getBibtexString() {
		return BibtexString;
	}
	public  void setBibtexString(String bibtexString) {
		BibtexString = bibtexString;
	}
	
	
	
	
	    
}
