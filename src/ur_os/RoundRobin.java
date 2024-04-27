/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ur_os;

/**
 *
 * @author prestamour
 */
public class RoundRobin extends Scheduler{

    int q;
    int cont;
    
    RoundRobin(OS os){
        super(os);
        q = 5;
        cont=0;
    }
    
    RoundRobin(OS os, int q){
        this(os);
        this.q = q;
    }
    

    
    void resetCounter(){
        cont=0;
    }
   
    @Override
    public void getNext(boolean cpuEmpty) {
        
        
    }
    
    
    @Override
    public void newProcess(boolean cpuEmpty) {} //Non-preemtive in this event

    @Override
    public void IOReturningProcess(boolean cpuEmpty) {} //Non-preemtive in this event
    
}
