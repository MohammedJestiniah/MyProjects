package BibInserter;

import java.awt.EventQueue;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

public class Hotkey
{
	/*
	 * Class recognize specific inputs from user and activate GUI
	 */
	public void init_hotkey()
	{

		JIntellitype.getInstance();
		JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_SHIFT + JIntellitype.MOD_CONTROL, (int)'B');//Recognized input
		JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {

			@Override
			public void onHotKey(int arg0) {
				// TODO Auto-generated method stub
				if (arg0 == 1)

					EventQueue.invokeLater(new Runnable() {
						/*
						 * Activate GUI
						 * @see java.lang.Runnable#run()
						 */
						public void run() {
							try {
								GUI frame = new GUI();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}


					});

			}




		});


	}
}