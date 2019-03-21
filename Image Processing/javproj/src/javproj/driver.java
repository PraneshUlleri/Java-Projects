package javproj;

public class driver {
public static void main(String [] args)
{JavaImageProcessing  jip= new JavaImageProcessing();
//jip.opening();
java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		new JavaImageProcessing().setVisible(true);
	}
});
	
	}}
