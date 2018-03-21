package app.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import app.pojo.Dept;
import app.pojo.Emp;

@Repository
public class EmpDao {
	
    @Resource
	private SessionFactory sf;
    
    
	public List<Emp> login(String hql) {
		Session sess = sf.getCurrentSession();
		Query quer = sess.createQuery(hql);
		List li = quer.list();
		return li;
		
	}


	public List<Dept> deptAll(String hql) {
		Session sess = sf.getCurrentSession();
		Query quer = sess.createQuery(hql);
		List list = quer.list();
		return list;
	}


	public void todelete(Integer st) {
		Session sess = sf.getCurrentSession();
		Emp object = (Emp) sess.get(Emp.class, st);
		sess.delete(object);
	}

}
