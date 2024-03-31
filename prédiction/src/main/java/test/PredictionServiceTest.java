package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import controller.PredictionService;
import ressourceshumaines.InputData;

public class PredictionServiceTest {
	@Autowired
    private PredictionService predictionService;

    @Test
    public void testPredictSalary() {
    	
        InputData inputData = new InputData();
        inputData.setAnnée(2022);  // Exemple de valeur pour l'année
        inputData.setNombreDeRecrutements(50);  // Exemple de nombre de recrutements
        inputData.setNombreDeDéparts(20);  // Exemple de nombre de départs
        inputData.setEffectifDébut(500);  // Exemple de taille de l'effectif   
        double predictedSalary = predictionService.predictSalary(inputData);
        System.out.println("Predicted salary: " + predictedSalary);
        // Vérifiez les prédictions en fonction des inputs donnés
    }
}
