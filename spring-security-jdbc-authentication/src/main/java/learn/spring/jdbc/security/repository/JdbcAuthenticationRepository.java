package learn.spring.jdbc.security.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.spring.jdbc.security.dao.Department;

@Repository
public interface JdbcAuthenticationRepository extends CrudRepository<Department, Long> {

	List<Department> findAll();
}
