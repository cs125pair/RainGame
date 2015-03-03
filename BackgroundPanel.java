import Panel 

class BackgroundPanel extends Panel
	{
	    // The Image to store the background image in.
	    Image img;
	    public BackgroundPanel()
	    {
	        // Loads the background image and stores in img object.
	        img = Toolkit.getDefaultToolkit().createImage("background.jpg");
	    }

	    public void paint(Graphics g)
	    {
	        // Draws the img to the BackgroundPanel.
	        g.drawImage(img, 0, 0, null);
	    }
	}
