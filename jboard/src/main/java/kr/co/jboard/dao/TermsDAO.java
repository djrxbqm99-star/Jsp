package kr.co.jboard.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.jboard.dto.UserDTO;
import kr.co.jboard.dto.UserDTO;
import kr.co.jboard.utill.DBHelper;
import kr.co.jboard.utill.SQL;

public class TermsDAO extends DBHelper {
	
	// 싱글톤
	private static TermsDAO instance = new TermsDAO();
	public static TermsDAO getInstance() {
		return instance;
	}
	private TermsDAO() {}
	
	// 기본 CRUD 메서드
	public UserDTO select(String userid) {
		
		UserDTO dto = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, userid);
			
			psmt.executeQuery();
			if(rs.next()) {
				dto = new UserDTO();
			}
			closeAll();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public List<UserDTO> selectAll() {
		
		// 반환용 List
		List<UserDTO> dtoList = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(SQL.SELECT_ALL_USER);
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto = new UserDTO();
				
				dtoList.add(dto);
			}
			
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return dtoList;
	}
	public void insert(UserDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.executeUpdate();
			
			closeAll();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void update(UserDTO dto) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.executeUpdate();
			
			closeAll();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void delete(String userid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, userid);
			psmt.executeUpdate();
			
			closeAll();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
