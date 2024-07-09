package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class JobPostService {
    @Autowired
    JobPostRepository jobPostRepository;

    public List<JobPost> getAllJobs(){
        return jobPostRepository.getAllJobs();
    }
    public void addJob(JobPost job){
        jobPostRepository.addJob(job);
    }

}
