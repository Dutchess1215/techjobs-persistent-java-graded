package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String description;

    public Skill (){};

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    @ManyToMany(mappedBy="skills")
    List<Job> jobs = new ArrayList<Job>();

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Job> getJobs(){
        return jobs;
    }

}