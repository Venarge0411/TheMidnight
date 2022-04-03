import javax.swing.*;

public class Overlays extends JFrame{
	private JLabel overlay1, overlay2, overlay3, overlay4;

	public Overlays(){
		setLayout(null);

		ImageIcon Dream = new ImageIcon("../../resources/Textures/Overlay/DreamOverlay.png");
		ImageIcon Infected = new ImageIcon("../../resources/Textures/Overlay/InfectedOverlay.png");
		ImageIcon Tension = new ImageIcon("../../resources/Textures/overlay/TensionOverlay.png");
		ImageIcon Nightmare = new ImageIcon("../../resources/Textures/Overlay/NightmareOverlay.png");

		overlay1 = new JLabel(Dream);
		overlay1.setBounds(0,0,925,530);
		add(overlay1);

		overlay2 = new JLabel(Infected);
		overlay2.setBounds(0,0,925,530);
		add(overlay2);

		overlay3 = new JLabel(Tension);
		overlay3.setBounds(0,0,925,530);
		add(overlay3);

		overlay4 = new JLabel(Nightmare);
		overlay4.setBounds(0,0,925,530);
		add(overlay4);
	}
}