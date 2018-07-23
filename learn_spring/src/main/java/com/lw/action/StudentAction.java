package com.lw.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lw.entity.Student;
import com.lw.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentAction {
	
	@Autowired
	private StudentService stuService;
	/**
	 * 添加学生信息
	 * @param stu
	 * @param map
	 * @return
	 */
	@RequestMapping("/add")
	public String addStudent(Student stu,Map<String,Object> map) {
		System.out.println(stu);
		stuService.addStudent(stu);
		return "redirect:stuList";
	}
	/**
	 * 修改学生信息
	 * @param stu
	 * @param map
	 * @return
	 */
	@RequestMapping("/update")
	public String updateStudent(Student stu,Map<String,Object> map) {
		System.out.println(stu);
		if(stuService.updateStudent(stu) > 0) {
			map.put("updateMSG", "修改成功");
		}else {
			map.put("updateMSG", "修改失败");
		}
		return "redirect:stuList";
	}
	/**
	 * 删除学生信息
	 * @param stuNo
	 * @param map
	 * @return
	 */
	@RequestMapping("/remove")
	public String removeStudent(String stuNo,Map<String,Object> map) {
		System.out.println(stuNo);
		if(stuService.removeStudent(stuNo) > 0) {
			map.put("removeMSG", "删除成功");
		}else {
			map.put("removeMSG", "删除失败");
		}
		return "redirect:stuList";
	}
	/**
	 * 查找学生信息
	 * @param stuNo
	 * @param map
	 * @return
	 */
	@RequestMapping("stuList")
	public String listStudent(String stuNo,String flag,Map<String,Object> map) {
		String url = "stuList";
		List<Student> stuList = stuService.queryStudent(stuNo);
		if("update".equals(flag)) {
			url = "updateStu";
			map.put("stu", stuList.get(0));
		}else {
			map.put("stuList", stuList);
		}
		return url;
	}
}
