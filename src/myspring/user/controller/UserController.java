package myspring.user.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/insertUser.do")
	public String insertUser(@ModelAttribute UserVO user) {
		userService.insertUser(user);
		return "redirect:/getUserList.do";
	}
	
	
	@RequestMapping("/insertUserForm.do")
	public ModelAndView insertUserForm() {
		List<String> genderList = new ArrayList<String>();
		genderList.add("��");
		genderList.add("��");

		List<String> cityList = new ArrayList<String>();
		cityList.add("����");
		cityList.add("�λ�");
		cityList.add("�뱸");
		cityList.add("����");

		Map<String, List<String>> map = new HashMap<>();
		map.put("genderList", genderList);
		map.put("cityList", cityList);

		return new ModelAndView("userInsert.jsp", "map", map);
	}
	
	@RequestMapping("/getUserList.do")
	public String getUserList(Model model) {
		List<UserVO> userList = userService.getUserList();
		model.addAttribute("userListKey", userList);
		return "userList.jsp";
	}
	
	@RequestMapping("/getUser.do")
	public ModelAndView getUser(@RequestParam String userid) {
		UserVO user = userService.getUser(userid);
		return new ModelAndView("userDetail.jsp", "userKey", user);
	}
}
