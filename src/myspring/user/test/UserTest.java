package myspring.user.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.user.service.UserService;
import myspring.user.vo.DeptVO;
import myspring.user.vo.StudentVO;
import myspring.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:configuration/springbeans.xml")
public class UserTest {
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	UserService userService;
	
	
	@Test
	public void studentSelect() {
		StudentVO student = 
				new StudentVO(100, "학생1",20, "1학년", "야간", new DeptVO(40));
		
		int cnt = sqlSession.insert("studentNS.insertStudent",student);
		System.out.println("등록건수 " + cnt);
		
		List<StudentVO> list = sqlSession.selectList("studentNS.selectStudentDeptById");
		for (StudentVO studentVO : list) {
			System.out.println(studentVO);
		}
	}
	
	@Test @Ignore
	public void service() {
		UserVO user = userService.getUser("vega2k");
		System.out.println(user);
	}
	
	
	@Test @Ignore
	public void list() {
		List<UserVO> userList = sqlSession.selectList("userNS.selectUserList");
		for (UserVO userVO : userList) {
			System.out.println(userVO);
		}
	}
	
	@Test @Ignore
	public void insert() {
		UserVO user = new UserVO("vega2k", "백명숙", "여", "서울");
		int cnt = sqlSession.insert("userNS.insertUser", user);
		System.out.println("등록된 건수 " + cnt);
	}
	
	@Test @Ignore
	public void select() {
		UserVO user = sqlSession.selectOne("userNS.selectUserById", "gildong");
		System.out.println(user);
	}
}
