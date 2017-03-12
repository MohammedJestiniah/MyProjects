package BibInserter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/*
 *BibReader is a class reads bib file and save bibItems in arraylist of BibObjects 
 */
public class BibReader {

	static ArrayList<BibObject> bibItemsArray = new ArrayList<BibObject>();//arraylist of BibObjects 
	static File bibFile = new File("library.bib");
	static int BibItemCounter = 0 ;

	//**********************************************************************************	

	public BibReader() throws FileNotFoundException, IOException{

		String TempBibKey = null  ;
		String TempAuthor = null ;
		String TempTitle = null   ;
		String TempYear = null  ;



		try(BufferedReader br = new BufferedReader(new FileReader(bibFile))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();



			//*********************************************************************************************************************	    
			/*
			 * While loop extracts the bibkey , title , author , year from every bibItem blooks until the end of the file 
			 */
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				String whole = "" ;

				String commentPattern = ".*@comment.*";
				String authorPattern = ".* author =.*";
				String titlePattern = ".* title =.*";
				String yearPattern = ".* year =.*";
				String titleTabPattern = ".*	title.*";


				if( line.startsWith("@")&& !Pattern.matches(commentPattern, line)){
					TempBibKey = line;

				}


				else if( Pattern.matches(authorPattern, line)){
					while(!line.endsWith(",")){
						whole = whole + line;
						line = br.readLine();

					}
					TempAuthor = whole + line;

				}



				else if( Pattern.matches(titlePattern, line)||Pattern.matches(titleTabPattern, line)){
					while(!line.endsWith(",")){ 
						whole = whole + line;
						line = br.readLine();

					}

					TempTitle=whole + line;
				}


				else if( Pattern.matches(yearPattern, line)){
					TempYear = line;
				}
				//****************************************************************************************************************************	        

				if(TempAuthor != null){
					TempAuthor = TempAuthor.replace("author =", "");
				}
				if(TempTitle != null){
					TempTitle = TempTitle.replace("title =", "");
				}
				if(TempYear != null){
					TempYear = TempYear.replace("year =", "");
				}

				//****************************************************************************************************************************	        
				/*
				 * detects end of bibItem
				 */
				if(line.startsWith("}")){
					BibObject bibItem = new BibObject(TempBibKey,TempAuthor, TempTitle, TempYear);
					BibItemCounter++;
					bibItemsArray.add(bibItem);
					TempBibKey = ""  ;
					TempAuthor = "" ;
					TempTitle = ""   ;
					TempYear = ""  ;
				}

				line = br.readLine();
			}


		}

		//****************************************************************************************************************************

	}
	public static ArrayList<BibObject> getList() { 
		return bibItemsArray; 
	}

	public static String getPath(){
		return bibFile.getAbsolutePath();
	}

	public static int getBibItemCounter(){
		return BibItemCounter-1 ;
	}
}