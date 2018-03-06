package com.dgit.ex00;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVO;
import com.dgit.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDaoTest {
	
	@Autowired
	private MemberDAO dao;

	//@Test
	public void testTime(){
		try {
			System.out.println(dao.getTime());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// @Test
	public void insert(){
		MemberVO vo = new MemberVO();
		vo.setUsername("재진");
		vo.setUserid("bjj");
		vo.setUserpw("1234");
		vo.setEmail("bjj@com");
		vo.setRegdate(new Date());
		vo.setUpdatedate(new Date());
				
		try {
			dao.insertMember(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// @Test
	public void read(){
				
		MemberVO vo;
		try {
			vo = dao.readMember("mosquito");
			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void readWithPw(){
		MemberVO vo;
		try {
			vo = dao.readWithPW("mosquito", "1234");
			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 @Test
	public void listAll(){
		
		try {
			List<MemberVO> list = dao.listAll();
			for(MemberVO m : list){
				System.out.println(m);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		// @Test
		public void update(){
			MemberVO vo = new MemberVO();
			vo.setUsername("재진");
			vo.setUserid("mosquito");
			vo.setUserpw("1234");
			vo.setEmail("재진@com");
			vo.setRegdate(new Date());
			vo.setUpdatedate(new Date());
					
			try {
				dao.update(vo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	// @Test
	public void delete(){
				
		MemberVO vo = new MemberVO();
		vo.setUserid("mosquito");
		try {
			dao.delete(vo);
			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
