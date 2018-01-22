package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.TrTasks;

public interface TaskService {
	/**
	 * 获取所有的任务.
	 * @return 所有任务信息.
	 */
	public List<TrTasks> findAll();
}
