package com.example.JobApp.controller;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.repository.JobPostRepository;
import com.example.JobApp.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobPostController {
    @Autowired
    JobPostService jobPostService;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("viewalljobs")
    public ModelAndView viewAllJobs(ModelAndView modelAndView){
        List<JobPost> lp = jobPostService.getAllJobs();
        modelAndView.addObject("jobPosts",lp);
        modelAndView.setViewName("viewalljobs");
        return modelAndView;
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost job, ModelAndView modelAndView){
        jobPostService.addJob(job);
        modelAndView.addObject("jobPost",job);
        modelAndView.setViewName("success");
        return "success";
    }
}
