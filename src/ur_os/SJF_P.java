/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ur_os;

/**
 *
 * @author prestamour
 */
public class SJF_P extends Scheduler{

    
    SJF_P(OS os){
        super(os);
    }
    
    @Override
    public void newProcess(boolean cpuEmpty){// When a NEW process enters the queue, process in CPU, if any, is extracted to compete with the rest
        
    } 

    @Override
    public void IOReturningProcess(boolean cpuEmpty){// When a process return from IO and enters the queue, process in CPU, if any, is extracted to compete with the rest
                
    } 
    
   
    @Override
    public void getNext(boolean cpuEmpty) {
       
    }
    
}
