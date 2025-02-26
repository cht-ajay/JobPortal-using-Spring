package com.jobportal.spring_boot_rest.repo;

import com.jobportal.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword1);

}

//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int i) {
//    for(JobPost job: jobs){
//        if(job.getPostId() == i){
//            return job;
//        }
//    }
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1 : jobs){
//        if(jobPost1.getPostId() == jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost job: jobs){
//        if(job.getPostId() == postId){
//            jobs.remove(job);
//        }
//    }
//}