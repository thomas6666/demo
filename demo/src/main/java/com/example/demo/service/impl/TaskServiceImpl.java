package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TrTasks;
import com.example.demo.mapper.TaskMapper;
import com.example.demo.service.TaskService;
@Service
public class TaskServiceImpl implements TaskService {

	/**
	 * 注入dao 
	 */
	@Autowired
	private TaskMapper taskMapper;
	
	/**
	 * 获取所有的任务.
	 */
	@Cacheable(value="findAll")
	@Override
	public List<TrTasks> findAll() {
		System.out.println("查找所有的任务信息。。。。");
		return taskMapper.findAll();
	}

}
