package app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import app.pojo.Dept;
import app.pojo.Emp;
import app.service.EmpService;

@Controller
public class EmpWeb {

	@Resource
	private EmpService empservice;
	@RequestMapping("/login")
	public String name(ModelMap map,Emp emp) {
		List<Emp> login = empservice.login(emp);
		List<Dept> dept= empservice.deptAll();
		map.put("empAll", login);
		map.put("dept", dept);
		return "login";
		
	}
	
	@RequestMapping("/todelete")
	public String name(String check) {
		empservice.todelete(check);
		return "redirect:login";
	}
}
