/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class WorkQueue {
    // Initializing the work queue variable
    private ArrayList<WorkRequest> workQueue;
    
    // This initiates anemptry directory
    public WorkQueue() {
        this.workQueue = new ArrayList<WorkRequest>();
    }
    
    // Getter to get the workQueue
    public ArrayList<WorkRequest> getWorkQueue() {
        return this.workQueue;
    }
}
