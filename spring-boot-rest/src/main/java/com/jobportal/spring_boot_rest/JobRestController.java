package com.jobportal.spring_boot_rest;

import com.jobportal.spring_boot_rest.model.JobPost;
import com.jobportal.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")

    public List<JobPost> getAllJobs(){

        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId")int postId){
        service.deleteJob(postId);
        return "Deleted";
    }
    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
            return service.search(keyword);

    }
}
