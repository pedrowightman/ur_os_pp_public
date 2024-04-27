/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ur_os;

/**
 *
 * @author super
 */
public class CPU {
    
    Process p;
    OS os;
    
    public CPU(){
    }
    
    public CPU(OS os){
        this.os = os;
    }
    
    public void setOS(OS os){
        this.os = os;
    }
    
    public void addProcess(Process p){
        this.p = p;
        p.setState(ProcessState.CPU);
    }
    
    public Process getProcess(){
        return p;
    }
    
    public boolean isEmpty(){
        return p == null;
    }
    
    public void update(){
        if(!isEmpty())
            advanceBurst();
    }
    
    public void advanceBurst(){
        if(p.advanceBurst()){
            Process tempp = p;
            removeProcess();
            os.interrupt(InterruptType.CPU, tempp);
        }
    }
    
    public void removeProcess(){
        p = null;
    }
    
    public Process extractProcess(){
        Process temp = p;
        p = null;
        return temp;
    }
    
    public String toString(){
        if(!isEmpty())
            return "CPU: "+p.toString();
        else
            return "CPU: Empty";
    }
    
   
    
}
