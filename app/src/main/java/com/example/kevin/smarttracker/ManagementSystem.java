package com.example.kevin.smarttracker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kevin on 19.07.2016.
 */
public class ManagementSystem {
    private static ManagementSystem ourInstance = new ManagementSystem();

    private List<FitnessExercise> _fitnessexercises = new ArrayList<FitnessExercise>();

    public static ManagementSystem getInstance() {
        return ourInstance;
    }

    private ManagementSystem() {
        initialize();
    }

    public List<FitnessExercise> getFitnessexercises(){
        return this._fitnessexercises;
    }

    public FitnessExercise getFitnessExercise(String name){
        if(name != null) {
            Iterator<FitnessExercise> iter = this._fitnessexercises.iterator();
            FitnessExercise exercise;
            while(iter.hasNext()){
                exercise = iter.next();
                if(exercise.getName().equals(name)){
                    return exercise;
                }
            }
        }
        return null;
    }

    private void initialize(){
        _fitnessexercises.add(new FitnessExercise("Gefangenen-Kniebeuge",
                " - Oberkörper minimal nach vorne neigen\n" +
                " - Füße schulterbreit voneinander entfernt und leicht nach außen gedreht aufstellen\n" +
                " - Knie leicht anwinkeln\n" +
                " - Hände hinter dem Kopf halten (Kopf aber nicht nach vorne drücken)\n" +
                " - Ellenbogen zeigen jetzt jeweils seitlich nach außen\n" +
                " - Brust herausstrecken und Schulterblätter zusammenziehen",
                " - strecke dein Gesäß nach hinten heraus und beuge langsam deine Kniegelenke\n" +
                " - lasse die Knie nicht über deine Zehenspitzen hinausragen, um die Gelenke zu schonen\n" +
                " - außerdem sollten sie immer in die gleiche Richtung wie deine Füße zeigen\n" +
                " - sind deine Oberschenkel parallel zum Boden, kannst du die Position für einen kurzen Moment halten, um das Beintraining ohne Geräte zu intensivieren\n" +
                " - anschließend bringst du dich über Druck auf den Fersen kontrolliert zurück nach oben in die Ausgangsposition\n" +
                " - halte auch dabei stets deinen Rücken gerade\n" +
                " - Ausführung wiederholen"));
        _fitnessexercises.add(new FitnessExercise("Liegestütz",
                " - gehe auf die Knie\n" +
                " - senkrecht unter deinen Schultern platzierst du deine Hände\n" +
                " - sie stützen deinen Oberkörper ab\n" +
                " - Finger zusammen und Fingerspitzen zeigen nach vorne\n" +
                " - Rücken gerade und den Kopf in Verlängerung der Wirbelsäule halten\n" +
                " - Beine nach hinten strecken\n" +
                " - du kannst sie zusammen lassen oder alternativ schulterbreit öffnen",
                " - beuge langsam deine Arme\n" +
                " - Ellenbogen zeigen dabei nach außen und etwas schräg nach hinten\n" +
                " - dein Körper sinkt so weit, bis deine Nase den Boden berührt\n" +
                " - er bleibt dabei vollständig in einer Linie\n" +
                " - vermeide ein Hohlkreuz oder ein Herausstrecken deines Gesäßes\n" +
                " - drücke dich anschließend wieder nach oben\n" +
                " - achte dann darauf, dass du deine Arme leicht gebeugt sind\n" +
                " - Ausführung der Liegestütze mehrmals hintereinander wiederholen"));
        _fitnessexercises.add(new FitnessExercise("Russische Drehung",
                " - setze dich mit deinem Po auf den Boden\n" +
                " - Beine zu 90 Grad anwinkeln und Fersen auf dem Boden absetzen\n" +
                " - Oberkörper etwa 45 Grad nach hinten lehnen und Rücken gerade halten\n" +
                " - Arme gerade vor dem Bauch ausstrecken und Handflächen zusammen\n" +
                " - Körper ausbalancieren und das Gleichgewicht halten",
                " - Körper nun vollständig anspannen und den Oberkörper so weit wie möglich zur Seite drehen\n" +
                " - die Bewegung findet im Rumpf statt\n" +
                " - Hüfte und Beine bleiben nahezu unbewegt\n" +
                " - nun drehst du dich kontrolliert zur entgegengesetzten Seite\n" +
                " - Kopf stets in Verlängerung der Wirbelsäule halten\n" +
                " - Ausführung der Bauchmuskelübung mehrmals wiederholen"));
    }
}
