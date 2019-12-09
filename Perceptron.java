package NeuronalNetworks;
import java.util.Scanner;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Perceptron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArtificialNeuron neuron = new ArtificialNeuron();
        Frame frame = new Frame();
		
		
		
		
		
	
		
		System.out.print("Introduce el numero de entradas que deseas:");
		int numinputs = sc.nextInt();
		numinputs= numinputs+1;
		int [ ] inputVector = new int [numinputs];
		inputVector[0]= neuron.getBias();
		
		for (int i=1; i<numinputs; i++) {
		      System.out.print("Introduce la entrada:");
		      inputVector[i] = sc.nextInt();
		}
		
		neuron.setInputVector(inputVector);
		
		System.out.print("\n");
		
		float [ ] inputWeight = new float [numinputs];
		for (int i=0; i<numinputs; i++) {
		      inputWeight[i]  =(float)Math.random();
		      System.out.println("El peso correspondiente"+i+":"+ inputWeight[i]);
		}
		
		neuron.setWeightsVector(inputWeight);
		
		
		System.out.print("Introduce el set de entrenamiento que deseas:\n");
		int numTrain = sc.nextInt();
		int [ ] trainSet  = new int[ numTrain];
		for (int i=0; i<numTrain; i++) {
		      System.out.print("Introduce la entrada de entrenamiento:");
		      trainSet[i] = sc.nextInt();
		}
		
		neuron.setTrainningVector(trainSet);
		
		System.out.print("\n");
	    neuron.setSynapsis();
	    neuron.setStepFunction();
	    
	    int [ ] S = new int [numinputs];
	    for (int i=0; i<1; i++) {
		      S[i] = neuron.getSetFunction();
		}
	    
	    neuron.setOutputVector(S);
	   
	    neuron.setLearning();
		
		
		
		
	}

}
