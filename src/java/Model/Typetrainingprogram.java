package Model;
// Generated 01-oct-2017 16:14:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Typetrainingprogram generated by hbm2java
 */
public class Typetrainingprogram  implements java.io.Serializable {


     private Long idTypeTrainingProgram;
     private String nameTypeTrainingProgram;
     private Set<Trainingprogram> trainingprograms = new HashSet<Trainingprogram>(0);

    public Typetrainingprogram() {
    }

	
    public Typetrainingprogram(String nameTypeTrainingProgram) {
        this.nameTypeTrainingProgram = nameTypeTrainingProgram;
    }
    public Typetrainingprogram(String nameTypeTrainingProgram, Set<Trainingprogram> trainingprograms) {
       this.nameTypeTrainingProgram = nameTypeTrainingProgram;
       this.trainingprograms = trainingprograms;
    }
   
    public Long getIdTypeTrainingProgram() {
        return this.idTypeTrainingProgram;
    }
    
    public void setIdTypeTrainingProgram(Long idTypeTrainingProgram) {
        this.idTypeTrainingProgram = idTypeTrainingProgram;
    }
    public String getNameTypeTrainingProgram() {
        return this.nameTypeTrainingProgram;
    }
    
    public void setNameTypeTrainingProgram(String nameTypeTrainingProgram) {
        this.nameTypeTrainingProgram = nameTypeTrainingProgram;
    }
    public Set<Trainingprogram> getTrainingprograms() {
        return this.trainingprograms;
    }
    
    public void setTrainingprograms(Set<Trainingprogram> trainingprograms) {
        this.trainingprograms = trainingprograms;
    }




}

