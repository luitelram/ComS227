package lab3;

import plotter.SimulationPlotter;

public class RabbitSimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimulationPlotter plotter = new SimulationPlotter();
		RabbitModel model = new RabbitModel();
		plotter.simulate(model);

	}

}
