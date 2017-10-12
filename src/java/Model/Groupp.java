package Model;
// Generated 01-oct-2017 16:14:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Groupp generated by hbm2java
 */
public class Groupp  implements java.io.Serializable {


     private long idGroup;
     private Areasena areasena;
     private State state;
     private Trainingprogram trainingprogram;
     private Typegroup typegroup;
     private long apprenticesNumber;
     private Set<Programming> programmings = new HashSet<Programming>(0);

    public Groupp() {
    }

	
    public Groupp(long idGroup, Areasena areasena, State state, Trainingprogram trainingprogram, Typegroup typegroup, long apprenticesNumber) {
        this.idGroup = idGroup;
        this.areasena = areasena;
        this.state = state;
        this.trainingprogram = trainingprogram;
        this.typegroup = typegroup;
        this.apprenticesNumber = apprenticesNumber;
    }
    public Groupp(long idGroup, Areasena areasena, State state, Trainingprogram trainingprogram, Typegroup typegroup, long apprenticesNumber, Set<Programming> programmings) {
       this.idGroup = idGroup;
       this.areasena = areasena;
       this.state = state;
       this.trainingprogram = trainingprogram;
       this.typegroup = typegroup;
       this.apprenticesNumber = apprenticesNumber;
       this.programmings = programmings;
    }
   
    public long getIdGroup() {
        return this.idGroup;
    }
    
    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }
    public Areasena getAreasena() {
        return this.areasena;
    }
    
    public void setAreasena(Areasena areasena) {
        this.areasena = areasena;
    }
    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    public Trainingprogram getTrainingprogram() {
        return this.trainingprogram;
    }
    
    public void setTrainingprogram(Trainingprogram trainingprogram) {
        this.trainingprogram = trainingprogram;
    }
    public Typegroup getTypegroup() {
        return this.typegroup;
    }
    
    public void setTypegroup(Typegroup typegroup) {
        this.typegroup = typegroup;
    }
    public long getApprenticesNumber() {
        return this.apprenticesNumber;
    }
    
    public void setApprenticesNumber(long apprenticesNumber) {
        this.apprenticesNumber = apprenticesNumber;
    }
    public Set<Programming> getProgrammings() {
        return this.programmings;
    }
    
    public void setProgrammings(Set<Programming> programmings) {
        this.programmings = programmings;
    }




}

