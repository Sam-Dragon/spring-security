package learn.spring.jdbc.security.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dept")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "deptno")
	private Long departmentNumber;
	@Column(name = "dname")
	private String departmentName;
	@Column(name = "loc")
	private String location;
}
