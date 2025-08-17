import controller.SimulationManager;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimulationManager manager = new SimulationManager(25, 25);
            manager.init();
        });
    }
}
