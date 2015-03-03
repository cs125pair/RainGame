	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingUtilities;

	public class TestGif {

	    private JFrame frame;
	    private URL url = null;

	    public TestGif() {
	        frame = new JFrame("teste");
	        try {
	            url = new URL("http://sadpanda.us/images/872436-4CD65DA.gif");
	        } catch (MalformedURLException ex) {
	            Logger.getLogger(TestGif.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        ImageIcon icon = new ImageIcon(url);
	        JLabel label = new JLabel(icon);
	        icon.setImageObserver(label);
	        frame.getContentPane().add(label);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) throws Exception {
	        SwingUtilities.invokeLater(new Runnable() {

	            public void run() {
	                new TestGif();
	            }
	        });
	    }
	}

