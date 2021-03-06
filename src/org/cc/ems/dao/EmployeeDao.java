package org.cc.ems.dao;

import java.util.List;

import org.cc.ems.entity.Employee;

/**
 * Emp dao
 * @author CC11001100
 *
 */
public interface EmployeeDao {

	/**
	 * 根据名称模糊查询
	 */
	public List<Employee> load(String name);
	
	/**
	 * 根据post id查询
	 */
	public List<Employee> load(int postId);
	
	/**
	 * 根据名称模糊和post id查询
	 */
	public List<Employee> load(String name,int postId);
	
	/**
	 * 列出所有
	 */
	public List<Employee> list();
}
