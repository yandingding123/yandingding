package app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dept {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer did;
	private String dname;

	public Dept(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
