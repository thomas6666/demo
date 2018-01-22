package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.TrTasks;

@Mapper
public interface TaskMapper {
	/**
	 * 获取所有的任务.
	 * @return 所有的任务集合.
	 */
   List<TrTasks> findAll();
}
