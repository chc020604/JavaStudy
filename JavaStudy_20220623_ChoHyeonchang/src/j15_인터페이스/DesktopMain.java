package j15_인터페이스;

public class DesktopMain {

	public static void main(String[] args) {
		HDMI h = new Monitor();
				
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		Desktop desktop = new Desktop(monitor);
		
		desktop.showInfo();
	}

}
