package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 部门表的实体类
 * 
 * @author caipch
 * @date 2018年12月12日
 */
@Entity
@Table(name = "dept")
public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "DEPTNO")
	private Integer deptno;
	@Column(name = "DNAME")
	private String dname;
	@Column(name = "LOC")
	private String loc;

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "部门 [部门编号=" + deptno + ", 部门名称=" + dname + ", 位置=" + loc + "]";
	}

}
