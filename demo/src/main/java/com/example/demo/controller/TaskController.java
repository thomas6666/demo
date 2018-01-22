package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TrTasks;
import com.example.demo.service.TaskService;

@RestController
public class TaskController {
   
	/**
	 * 注入任务service.
	 */
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("task/getall")
	public List<TrTasks> getAllTasks(){
		return taskService.findAll();
	}
}
