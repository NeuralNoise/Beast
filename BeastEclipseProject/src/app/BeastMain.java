package app;


import java.util.logging.Level;
import java.util.logging.Logger;

import model.Model;
import utils.LogUtil;
import view.ViewPanel;

public class BeastMain {

	public static void main(String[] args) throws Exception {

		Logger.getLogger("").setLevel(Level.INFO);
		LogUtil.init();
		
		Model model = new Model(400, 400);
		
		final MainFrame frame = new MainFrame();
		frame.init(model);
		
		ViewPanel view = frame.getViewPanel();
	}
	
}