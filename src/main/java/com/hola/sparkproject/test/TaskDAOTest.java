package com.hola.sparkproject.test;

import com.hola.sparkproject.dao.ITaskDAO;
import com.hola.sparkproject.domain.Task;
import com.hola.sparkproject.dao.factory.DAOFactory;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}
