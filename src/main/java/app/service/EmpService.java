package app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dao.EmpDao;
import app.pojo.Dept;
import app.pojo.Emp;

@Service
@Transactional
public class EmpService {
	@Resource
	private EmpDao empdao;

	public List<Emp> login(Emp emp) {
		String hql="from Emp where 1=1";
		if (emp!=null&&emp.getEname()!=null&&!emp.getEname().equals("")) {
			hql+=" and ename like '%"+emp.getEname()+"%'";
		}
		if (emp!=null&&emp.getDept()!=null&&emp.getDept().getDid()!=null) {
			hql+=" and dept.did="+emp.getDept().getDid();
		}
		
		return empdao.login(hql);

	}

	public List<Dept> deptAll() {
		String hql="from Dept";
		return empdao.deptAll(hql);
	}

	public void todelete(String check) {
		String[] split = check.split(",");
		for (String string : split) {
			if (string!=null&&!"".equals(string)) {
				empdao.todelete(Integer.parseInt(string));
			}
		}
	}

}
