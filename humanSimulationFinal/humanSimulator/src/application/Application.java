package application;

import application.simulation.Simulation;

public interface Application {


    public static void main(String [] args){
        Simulation first = new Simulation();
        first.startSimulation();

    }
}
