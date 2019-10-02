import javax.swing.JFrame;

public class MiThread extends Thread {
	private JPanelGrafico2 panel;
	private int time;
	
	public MiThread(JPanelGrafico2 panel, int time) {
		this.panel = panel;
		this.time = time;
	}
	
	public void run() {
		while(true) {
			panel.mover();
			try {
				sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
