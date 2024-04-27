/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ur_os;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author prestamour
 */
public abstract class Scheduler {
    
    OS os;
    protected LinkedList<Process> processes;
    
    
    public Scheduler(OS os){
        this.os = os;
        processes = new LinkedList();
    }

    public void getNext(){
        getNext(false);
    }
    
    public abstract void getNext(boolean cpuEmpty);
    public abstract void newProcess(boolean cpuEmpty); //Implement for Preemtive schedulers
    public abstract void IOReturningProcess(boolean cpuEmpty); //Implement for Preemtive schedulers
    
    
    public boolean isEmpty(){
        return this.processes.isEmpty();
    }
    
    public void addProcess(Process p){
        
        if(p.getState() == ProcessState.NEW){
            newProcess(os.isCPUEmpty()); //If the process is NEW, let the scheduler defines what it will do to update the queue to select the next
        }else if(p.getState() == ProcessState.IO){
            IOReturningProcess(os.isCPUEmpty()); //If the process is returning from IO, let the scheduler defines what it will do to update the queue to select the next
        }
        
        p.setState(ProcessState.READY); //If the process comes from the CPU, just add it to the list
        processes.add(p);
    }
    
    public void update(){
        getNext(os.isCPUEmpty());
    }
    
    public Process removeProcess(Process p){
        Process temp = p;
        processes.remove(p);
        return temp;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        
        for (Process process : processes) {
            sb.append(process);
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
     
}
