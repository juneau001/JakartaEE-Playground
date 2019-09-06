
package com.acme.acmepools.event;

import com.acme.acmepools.entity.Job;
import javax.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Utilized to indicate when a job is created.
 * 
 * @author Juneau
 */
@NoArgsConstructor
@Named
public class JobEvent {
    private String message;
    private Job job;
    
    public JobEvent(String message, Job job){
        this.message = message;
        this.job = job;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the job
     */
    public Job getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Job job) {
        this.job = job;
    }
    
    
}
