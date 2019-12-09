#Perceptron.
#created by Isaí vargas Chávez-Age 19 All rigths reserved @
# Compilador Clang 6.0 (clang-600.0.57)] on darwin.
# version 1.0.
# 03/02/2018 in Mexico City.
import math
import random
import artificialNeuron
from artificialNeuron import Neuron

if __name__ == "__main__":
    neuron = Neuron ( ) #New neuron born with 1 inicialization in bias as default.
    iterathion = 0
    numberinputs=int(input("Introduce el numero de entradas deseadas para el set de entrenamiento:"))
    numberinputs = numberinputs + 1
for i in range(numberinputs):
    inputTrainSet=int(input("Introduce el set de entrenamiento:"))
    neuron.add_trainingVector(inputTrainSet )


numberinputs=int(input("Introduce el numero de entradas deseadas:"))
for i in range(numberinputs):
#   inputvector.append ( int(input( ) ))
     inputsignal=int(input("Introduce la entrada:"))
     inputsignal = float(inputsignal)
     neuron.add_inputVector(  inputsignal )  #Pass the input data to the Neuron  Class

numberinputs = numberinputs + 1
neuron.add_weightsVector(numberinputs )
k=0       
while(neuron.y !=neuron.trainingVector[ iterathion] ):
       iterathion = iterathion + 1
       k = k+1
       neuron.v=neuron.Synapsis( iterathion,numberinputs,inputsignal)
       neuron.y=neuron.Signum( )
       inputweight=neuron.Learn(neuron.y,iterathion,inputsignal,inputweight,inputTrainSet,k)
      
if ( neuron.inputsVector == neuron.trainingVector ):
   print("Aprendizaje completado:",neuron.inputsVector,neuron.trainingVector)  
   print("Las Entradas introducidas son : " ,neuron.inputsVector)
   print ("Los pesos sinapticos introducidos son:",neuron.weightsVector)
