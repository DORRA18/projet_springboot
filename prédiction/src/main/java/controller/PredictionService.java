package controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

import ressourceshumaines.InputData;

@Service
public class PredictionService {
    private static final String MODEL_PATH = "model_stacked.pkl";

    public static double predictSalary(InputData inputData) {
        try {
            // Charger le modèle à partir du fichier .pkl
            Resource resource = new ClassPathResource(MODEL_PATH);

            PythonInterpreter interpreter = new PythonInterpreter();
            interpreter.exec("import joblib");
            interpreter.exec("model = joblib.load(getClass().getResourceAsStream('/" + MODEL_PATH + "'))");


            String predictionScript = String.format("prediction = model.predict([[ %d, %d, %d, %d ]])",
                    inputData.getAnnée(), inputData.getNombreDeRecrutements(), inputData.getNombreDeDeparts(),
                    inputData.getEffectifDébut());
            interpreter.exec(predictionScript);

            double prediction = (double) interpreter.get("prediction").asDouble();
            return prediction;
        } catch (Exception e) {
            e.printStackTrace();
            // Gérer les erreurs de prédiction
            return -1; // Valeur de retour par défaut en cas d'erreur
        }
    }
}
