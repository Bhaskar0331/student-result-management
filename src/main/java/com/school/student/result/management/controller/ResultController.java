package com.school.student.result.management.controller;

import com.school.student.result.management.repos.ResultRepository;
import com.school.student.result.management.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class ResultController {

    @Autowired
    ResultRepository resultRepository;

    @RequestMapping(value="/results", method=RequestMethod.GET)
    @ResponseBody
    public List<Result> getAll() {
        return resultRepository.findAll();
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody Result result) {
        return resultRepository.save(result);
    }

    @RequestMapping(value="/result/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result find(@PathVariable("id") int resultId) {
        return resultRepository.findById(resultId);
    }

    @RequestMapping(value= "/result", method = RequestMethod.PUT)
    @ResponseBody
    public Result update(@RequestBody Result result){
        return resultRepository.save(result);
    }

    @RequestMapping(value="/result/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable("id") int resultId) {
        resultRepository.deleteById(resultId);
        return resultId;
    }
}
