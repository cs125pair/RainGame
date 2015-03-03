//UIUC CS125 FALL 2014 MP. File: RainGame.java, CS125 Project: PairProgramming, Version: 2015-02-23T22:19:59-0600.193546899
/**
 * @author luh2,junyuli2
 */

public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		int i, dx=0, dy=0, score = 0, counter = 1;
		int[] x = new int [30];
		int[] y = new int [30];
		String[] text = new String[30];
		long startTime =System.currentTimeMillis();
		
		
		Zen.setFont("Helvetica-32");

		while (Zen.isRunning()) {
			Zen.drawImage("bg.jpg",0,0);
			Zen.setColor(255, 255, 255);
			Zen.drawText("Level: "+counter,10,50);
			Zen.drawText("Score: "+score,10,100);
			
	for(i = 0;i<counter;i++){
		y[i] = Zen.getZenHeight() / 2;

			if (text[i].length() == 0) {
			
				x[i] = (int) (Math.random() * 500);
				y[i] = Zen.getZenHeight() / 2;
			
				dx = 0;
				dy = (int) (Math.random() * 5);
				text[i]= "" + (int) (Math.random() * 999);

				long elapsed = System.currentTimeMillis() - startTime;
				startTime = System.currentTimeMillis();
				Zen.drawText(String.valueOf(startTime),0,0);
			}
			
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());	
			Zen.drawText(text[i], x[i], y[i]);
			
			x[i] += dx;
			y[i] += dy;
		
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
		
			if(user.equals(text[0])){
				score += 50;
				counter++;
			}
			
			for(int j=0;j < user.length();j++) {
				char c = user.charAt(j);
				if(c == text[0].charAt(0))
					text[0] = text[0].substring(1,text[1].length()); // all except first character
			}
			
			Zen.flipBuffer();
			Zen.sleep(50);// sleep for 90 milliseconds

		}
	}

		}
}