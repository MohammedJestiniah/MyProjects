package Arranger;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
















import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.TextPage;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import javax.swing.JFileChooser;
import javax.swing.JLabel;

import org.apache.commons.io.IOUtils;


public class Main {
	
	// ........................................... 4 bit Counter variables.
	  static int[] count = new int[4];   // an array that intilizes 4 integers to make the counter in form of [0001,0002,...] 
	  
	  static int counter =0001 ;     // we have to start the counting from 0001 because we will set the first counter value as "0001"
	  
      static String counter4bits= "0001" ;     // we set the 4 bit counter to 0001 because if it is not set it will have value of null at first file .
      public static String theString;
	//.................................................................................................... Array of Papers Objects
      
	  public static ArrayList<Paper> papers = new ArrayList<Paper>();
	  public static ArrayList<IndexCard> IndexCards = new ArrayList<IndexCard>();
	  public static File path ;
	  
	//....................................................................................................
	  
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) throws IOException {
		
		
		theString = IOUtils.toString(new FileInputStream(new File("Index cards.txt")), "UTF-8");
		theString=	theString.toString();
			
		String text ="";
		
		int fileCount = (countLines("Index cards.txt")/3);
		
		
		if(!theString.isEmpty()){
			for(int i = 0 ; i < fileCount;i++){
				int x = i;
				theString = theString+"\r\n";
				theString = theString.replaceAll("(\\r|\\n)", "");
				text = theString.substring(theString.indexOf("$"+x+"$"), theString.indexOf(x+"}")+2); 
				
			    String dummyNoteTitle = text.substring(text.indexOf("$"+x+"$")+3,text.indexOf("%"));
				String dummyNotECat = text.substring(text.indexOf("*"+x+"*")+3,text.indexOf("+"));
				String dummyNoteString = text.substring(text.indexOf("{"+x+"{")+3,text.indexOf(x+"}"));
				IndexCards.add(new IndexCard(dummyNotECat, dummyNoteTitle,dummyNoteString));
			}
			
			
		}
		
			
		
		  
		//...................GUI institntuation
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheArrangerGUI window = new TheArrangerGUI();
					window.frmThearranger.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
				
	}
	//......................................................................................................................... 
	
	/* this method set the Path and gather other info like download date and publish date and Referennces from other methods
	also it create a text file called DataBase which contains the new title and the parsed Referennces .*/
	
	public static void paperManager(JLabel lblFd , JFileChooser fc) throws IOException{
		//........................................................................ 
				FileOutputStream fileOutputStrem2;
				PrintWriter printWriter2;
				
		    		fileOutputStrem2 = new FileOutputStream("pdfSource.txt"); 
		    		printWriter2 = new PrintWriter(fileOutputStrem2, true);	
		    	    printWriter2.println(fc.getSelectedFile().toString());	
		    		printWriter2.close();
		    		fileOutputStrem2.close();
		  	
				//...................................................................
		    lblFd.setText(fc.getSelectedFile().toString());      // this call set the text box to the selected path ."for the user to check"
		    Paper.PATH = (fc.getSelectedFile().toString()).replace('\\', '/');   // it is important to replace the \ in the path with \\ for java to recognize.
		    
//........................................................................................
		    
		 //here we go over all the Files in the Path (even if not PDF ) then we add it array .   
		    path = new File(Paper.PATH); 
			File [] Files =  path.listFiles();
//.....................................................
			//we need the FileOutputStream and PrintWriter for creating the database text and write in it.
			FileOutputStream fileOutputStrem;
			PrintWriter printWriter;
			
//.................................................................................
			
		    for (int i = 0; i < Files.length; i++){
		    	
		    	//the next 'if' statment go over the files list and any file ends with pdf will be added as paper object
		        if (Files[i].isFile()&&Files[i].getPath().endsWith(".PDF")||Files[i].getPath().endsWith(".pdf")){ 
		        	
		        	Paper dummyPaper = new Paper();		// we make a dummy object of the paper which wait for			        	
		        	dummyPaper.setFilePath(Files[i]+"");	    		           
		           
		            try {
		            	
						dummyPaper.setTXT(dummyPaper.ToText());   // the method ToText convert the PDF to a Text file.
						Scanner PDFs = new Scanner(dummyPaper.getTXT());   // here we open the converted PDF .
						String firstLine = PDFs.nextLine();   // we take the first line as title
						while(firstLine == null){    // we enters this loop only if first line was empty
							firstLine = PDFs.nextLine();
						}
						dummyPaper.setTitle(firstLine); // setting the title (The first line) *NOTE : we will replace this title by the full title later
						PDFs.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		            
		            //the next 3 lines is to get the 4 bits counter and DownloadDate and the title and PublishDate then put them all in one string.
		            dummyPaper.setDownloadDate(getDownloadDate(Paper.PATH));
		           
		           // dummyPaper.setPublishDate(bibtexDownloader(dummyPaper.getTitle())); 
		            dummyPaper.setBibtexString(bibtexDownloader(dummyPaper.getTitle()));  
		           
		          // dummyPaper.setPublishDate(dummyPaper.getBibtexString().substring(dummyPaper.getBibtexString().indexOf("year")+6,dummyPaper.getBibtexString().indexOf("year")+10)); 
		            
		            if(dummyPaper.getBibtexString() != null){
		            dummyPaper.setPublishDate(dummyPaper.getBibtexString().substring(dummyPaper.getBibtexString().indexOf("year")+6,dummyPaper.getBibtexString().indexOf("year")+10)); 
		            }else{
		            	dummyPaper.setPublishDate("");
		            }
		            	
			          
		            dummyPaper.setTitle(counter4bits+"     "+dummyPaper.getDownloadDate()+" "+dummyPaper.getTitle()+dummyPaper.getPublishDate().replace("?", "").replace("<", "").replace(":", "").replace("*", "").replace(">", "").replace("—", ""));
		          //  dummyPaper.setTitle(counter4bits+"     "+dummyPaper.getDownloadDate()+" "+dummyPaper.getTitle()+dummyPaper.getPublishDate().replace(?, "").replace(<, "").replace(:, "").replace(*, "").replace(>, ""));
		          
		            
		            //here we rename the PDF file using the format we made before and the path of the PDF file. 
		            Files[i].renameTo(new File(path +"/"+dummyPaper.getTitle()+".pdf"));
		            
		            
		            papers.add(dummyPaper);// here we add the object to the array of objects 
		           
		           //........ after getting the renaming info we have to extract the refrences using the method (refGetter) and set it to a variable called referennces in paper object.
		            dummyPaper.setReferennces(refGetter(dummyPaper.getTXT()));
		            
		           //............................................. here we want to create the Database.txt and give it the title and referennces for each object "PaperDiagram logic".
		            FileOutputStream fileOutputStrem22 = new FileOutputStream(path+"\\BibFile.txt");
	               	PrintWriter	printWriter22 = new PrintWriter(fileOutputStrem22, true);
	               	for(int y =0; y<papers.size();y++){
	    			printWriter22.println(papers.get(y).getBibtexString()+"\r\n ");
	               	}
	    			printWriter22.close();
	        		fileOutputStrem22.close();
	               	
		            	try{
		            		fileOutputStrem = new FileOutputStream(path+"\\Database.txt"); // creating the txt file
		            		printWriter = new PrintWriter(fileOutputStrem, true);
		            		
		            		for(int k =0; k<papers.size();k++){// this loop go over each Paper object and get the title and referennces.
		            			
		            			printWriter.println(papers.get(k).getTitle());
		            			printWriter.println(papers.get(k).getReferennces());
		            			
		            			}
		            		printWriter.close();
		            		fileOutputStrem.close();
		          		}catch(Exception e){
		          			System.out.println("Exception founded !");
		          		}
		            	
		            	countUp(); // this call is for increasing the counter by 1 because the object is added now to the paper array of objects.
		        }
		        }
		 
	}  // end of the big for loop which do the creation of the paper objects and add them in one array .
	public static void  paperManager() throws IOException{
		//........................................................................ 
		try {
			theString = IOUtils.toString(new FileInputStream(new File("pdfSource.txt")), "UTF-8");
			theString=	theString.toString().replace('\\', '/');
			theString = theString+"\r\n";
			theString = theString.replaceAll("(\\r|\\n)", "");	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				//...................................................................
	

		    Paper.PATH = theString;   // it is important to replace the \ in the path with \\ for java to recognize.
		    
//........................................................................................
		    
		 //here we go over all the Files in the Path (even if not PDF ) then we add it array .   
		    File path = new File(Paper.PATH); 
			File [] Files =  path.listFiles();
//.....................................................
			//we need the FileOutputStream and PrintWriter for creating the database text and write in it.
			FileOutputStream fileOutputStrem;
			PrintWriter printWriter;
			
//.................................................................................
			
		    for (int i = 0; i < Files.length; i++){
		    	
		    	//the next 'if' statment go over the files list and any file ends with pdf will be added as paper object
		        if (Files[i].isFile()&&Files[i].getPath().endsWith(".PDF")||Files[i].getPath().endsWith(".pdf")){ 
		        	
		        	Paper dummyPaper = new Paper();		// we make a dummy object of the paper which wait for			        	
		        	dummyPaper.setFilePath(Files[i]+"");	    		           
		           
		            try {
		            	
						dummyPaper.setTXT(dummyPaper.ToText());   // the method ToText convert the PDF to a Text file.
						Scanner PDFs = new Scanner(dummyPaper.getTXT());   // here we open the converted PDF .
						String firstLine = PDFs.nextLine();   // we take the first line as title
						while(firstLine == null){    // we enters this loop only if first line was empty
							firstLine = PDFs.nextLine();
						}
						dummyPaper.setTitle(firstLine); // setting the title (The first line) *NOTE : we will replace this title by the full title later
						PDFs.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		            
		            //the next 3 lines is to get the 4 bits counter and DownloadDate and the title and PublishDate then put them all in one string.
		            dummyPaper.setDownloadDate(getDownloadDate(Paper.PATH));
		           
		           // dummyPaper.setPublishDate(bibtexDownloader(dummyPaper.getTitle())); 
		            dummyPaper.setBibtexString(bibtexDownloader(dummyPaper.getTitle()));  
		           
		          // dummyPaper.setPublishDate(dummyPaper.getBibtexString().substring(dummyPaper.getBibtexString().indexOf("year")+6,dummyPaper.getBibtexString().indexOf("year")+10)); 
		            
		            if(dummyPaper.getBibtexString() != null){
		            dummyPaper.setPublishDate(dummyPaper.getBibtexString().substring(dummyPaper.getBibtexString().indexOf("year")+6,dummyPaper.getBibtexString().indexOf("year")+10)); 
		            }else{
		            	dummyPaper.setPublishDate("");
		            }
		            	
			          
		            dummyPaper.setTitle(counter4bits+"     "+dummyPaper.getDownloadDate()+" "+dummyPaper.getTitle()+dummyPaper.getPublishDate().replace("?", "").replace("<", "").replace(":", "").replace("*", "").replace(">", "").replace("—", ""));
		          //  dummyPaper.setTitle(counter4bits+"     "+dummyPaper.getDownloadDate()+" "+dummyPaper.getTitle()+dummyPaper.getPublishDate().replace(?, "").replace(<, "").replace(:, "").replace(*, "").replace(>, ""));
		          
		            
		            //here we rename the PDF file using the format we made before and the path of the PDF file. 
		            Files[i].renameTo(new File(path +"/"+dummyPaper.getTitle()+".pdf"));
		            
		            
		            papers.add(dummyPaper);// here we add the object to the array of objects 
		           
		           //........ after getting the renaming info we have to extract the refrences using the method (refGetter) and set it to a variable called referennces in paper object.
		            dummyPaper.setReferennces(refGetter(dummyPaper.getTXT()));
		            
		           //............................................. here we want to create the Database.txt and give it the title and referennces for each object "PaperDiagram logic".
		            FileOutputStream fileOutputStrem2 = new FileOutputStream(path+"\\BibFile.txt");
	               	PrintWriter	printWriter2 = new PrintWriter(fileOutputStrem2, true);
	               	for(int y =0; y<papers.size();y++){
	    			printWriter2.println(papers.get(y).getBibtexString()+"\r\n ");
	               	}
	    			printWriter2.close();
	        		fileOutputStrem2.close();
	               	
		            	try{
		            		fileOutputStrem = new FileOutputStream(path+"\\Database.txt"); // creating the txt file
		            		printWriter = new PrintWriter(fileOutputStrem, true);
		            		
		            		for(int k =0; k<papers.size();k++){// this loop go over each Paper object and get the title and referennces.
		            			
		            			printWriter.println(papers.get(k).getTitle());
		            			printWriter.println(papers.get(k).getReferennces());
		            			
		            			}
		            		printWriter.close();
		            		fileOutputStrem.close();
		          		}catch(Exception e){
		          			System.out.println("Exception founded !");
		          		}
		            	
		            	countUp(); // this call is for increasing the counter by 1 because the object is added now to the paper array of objects.
		        }
		        }
		 
	}  // end of the big for loop which do the creation of the paper objects and add them in one array .
		
		
		
//..........................................................................................<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Disable later		
		    
		// enable this if you want to see the titles results in java.
		
	//.....................................................................................................................................
	
	public static String getDownloadDate(String path) throws IOException{
		Path filePath = Paths.get(path); 
// the file attributes takes the file path and get its properties like the download date
	 	BasicFileAttributes fileAttribute = Files.readAttributes(filePath, BasicFileAttributes.class);
		
		String downloadDate = ""+fileAttribute.creationTime();
		downloadDate = downloadDate.substring(0, downloadDate.indexOf('T')); // using fileAttribute will get the dates in this form "2015-12-05T08:53:53.861823Z" so we need to parse it .
		
		return downloadDate;
		
	 }
	
	//.....................................................................................................................................
	
	public static String bibtexDownloader(String title) throws IOException{
		
		String BibTex = null; // we will set it letar when we get the bibtex text page

		boolean isFound = false ;
      //initilizing the client which will link the software with the browser.
	  @SuppressWarnings("resource")
	final WebClient webClient = new WebClient(BrowserVersion.CHROME);
	  
	  // pagebib will be assign later when the BibTex appears in web text page.
	  TextPage pageBib = null;
	  
      // turn off htmlunit warnings
      java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
      java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
      
      // ............................................................................
      
      //First statement is to get in the website page .
      HtmlPage homePage = webClient.getPage("https://scholar.google.com/");
      HtmlInput searchBox = homePage.getElementByName("q");       // name q is the textbox name in https://scholar.google.com/  
      searchBox.setValueAttribute(title);               // set the title of the PDF <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      HtmlButton  searchButton = homePage.getElementByName("btnG");      // btnG is the search button name in https://scholar.google.com/
      HtmlPage resultPage = searchButton.click();        //this will switch to the result page after clicking the search button
      
      //.................................................................
      
      //the next loop will go over elements called (Dom) which is specified by a tagName and a class and a text value .
      //since we need the first button which called Cite.
      final List<DomElement> a = resultPage.getElementsByTagName("a");
      for (DomElement element : a) {
    	  if (element.getAttribute("class").equals("gs_nph")) {
        	 if(element.asText().equalsIgnoreCase("Cite")){ 
        		  element.click();
        		  webClient.waitForBackgroundJavaScriptStartingBefore(2000); 
        		  isFound = true;
        		  break;
        	        }
        		 }
          } 
      if(!isFound){ //  this loop will be entered only if the previous 2 loops faild their condition.
      System.out.println("BibTeX is not found for title :" + title);//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      String BibtexString = null;

  	

  	
  	return BibtexString;
      }
      
      //...............................................................
      
      //After clicking the button Cite another list of Dom elements will appear so we need to loop again on this list 
      //to get the element button called BibTeX.
      final List<DomElement> B = resultPage.getElementsByTagName("a");
      for (DomElement element : B) {
          if (element.getAttribute("class").equals("gs_citi")) {	
        	 if(element.asText().equalsIgnoreCase("BibTeX")){
            	pageBib = element.click();
            	BibTex = pageBib.getContent();
            	String BibtexString = BibTex.toString();
            	
            			  
            			
            	
            
            	// To make the bibfile.txt
            	

            	
            	return BibtexString;
        		
        		
        	 }
          }
      }
      
       // if any errors appeared  we need to close all the windows by using this method
      webClient.closeAllWindows(); 
		
		return title;
		
	}
	
	//.....................................................................................................................................
	
	//this method parse the refrences from the converted pdf to text.
	public static String refGetter(String txt){
		try {
		String references = txt.substring(txt.indexOf("REFERENCES")); // sometimes the word References might be all upper case so we have to handle this.
		return references;
		}catch(Exception e){
			try {
				String references = txt.substring(txt.indexOf("References"));
				return references;
				}catch(Exception ie){
					return "";
				}
		}
		
		
		
	}
	
	//.....................................................................................................................................
	
	 public static void countUp(){ // this counter up method is to implement the 4 bits counter
		 counter++; 
		  count[0] = counter %10;
		  count[1] = counter /10 % 10;
		  count[2] = counter /100 % 10;
		  count[3] = counter /1000 % 10;
		  counter4bits = count[3]+""+count[2]+""+count[1]+""+count[0];
	}
	 
	 
	 public static void addNotes(String noteCatagory, String noteTitle, String StringNote){
		 
		 IndexCard dummyIndexCard = new IndexCard(noteCatagory, noteTitle, StringNote);
		 IndexCards.add(dummyIndexCard);
		
		 
		 
	 }
	 
	 public static int countLines(String filename) throws IOException {
		    InputStream is = new BufferedInputStream(new FileInputStream(filename));
		    try {
		        byte[] c = new byte[1024];
		        int count = 0;
		        int readChars = 0;
		        boolean empty = true;
		        while ((readChars = is.read(c)) != -1) {
		            empty = false;
		            for (int i = 0; i < readChars; ++i) {
		                if (c[i] == '\n') {
		                    ++count;
		                }
		            }
		        }
		        return (count == 0 && !empty) ? 1 : count;
		    } finally {
		        is.close();
		    }
		}

	 public static void bubble_srt() {
		 
		
		 
		 
		 
	        int n = papers.size();
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (papers.get(i).getPublishDate().compareTo(papers.get(k).getPublishDate()) > 0) {
	                	Paper dummyP = papers.get(i);
	                	papers.set(i, papers.get(k));
	                	papers.set(k, dummyP);
	                }
	            }
	            
	        }
	        
	    }
	 
	
	
}
