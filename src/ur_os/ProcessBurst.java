/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ur_os;

/**
 *
 * @author super
 */
public class ProcessBurst {
    
    int cycles;
    int remainingCycles;
    ProcessBurstType type;
    boolean finished;

    public ProcessBurst(int cycles, ProcessBurstType type) {
        this.cycles = cycles;
        this.type = type;
        remainingCycles = cycles;
        finished =  false;
    }
    
    public ProcessBurst(ProcessBurst p) {
        this.cycles = p.cycles;
        this.type = p.type;
        remainingCycles = p.remainingCycles;
        finished =  p.finished;
    }

    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    public ProcessBurstType getType() {
        return type;
    }

    public void setType(ProcessBurstType type) {
        this.type = type;
    }
    
    public boolean advanceBurst(){
        if(remainingCycles > 0){
            this.remainingCycles--;
            if(remainingCycles == 0){
                finished = true;
            }
        }else{
            System.out.println("Error in burst!");
        }
        
        return finished;
    }

    public int getRemainingCycles() {
        return remainingCycles;
    }
    
    public boolean isFinishes(){
        return finished;
    }
    
    public String toString(){
        return "C: "+cycles+" RC: "+this.remainingCycles+" T: "+this.type+" F: "+this.finished;
    }
    
}
