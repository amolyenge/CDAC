package SetCollection.dao;

import java.util.List;
import java.util.Set;

import SetCollection.beans.Employee;


public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String nm);

	boolean removeBySal(double sal);

	boolean removeById(int id);

	boolean updateBySal(int id, double sal);

	Set<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySal();

	Set<Employee> findBySal(double sal);

}
