package BibInserter;

import java.awt.AWTException;
import java.io.IOException;

public class Main {


	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		/*
		 * initialize bibReader to Start reading the bib file
		 */

		BibReader bibReader = new BibReader();

		/*
		 * initialize hotKey to run the BibInserter
		 */
		Hotkey hotkey = new Hotkey();
		hotkey.init_hotkey();
		Thread.sleep(100);


	}
}