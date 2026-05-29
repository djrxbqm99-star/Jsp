package util;

public class SQL {

	// User1
	public static final String INSERT_USER1 = "INSERT INTO User1 VALUES (?,?,?,?)";
	public static final String SELECT_USER1 = "SELECT * FROM User1 WHERE userid=?";
	public static final String SELECT_ALL_USER1 = "SELECT * FROM User1";
	public static final String UPDATE_USER1 = "UPDATE User1 SET "
												+ "name = ?,"
												+ "hp = ?,"
												+ "age = ? "
												+ "WHERE userid = ?";
	public static final String DELETE_USER1 = "DELETE FROM User1 WHERE userid=?";
	
	
	
	// User2
		public static final String INSERT_USER2 = "INSERT INTO User2 VALUES (?,?,?,?)";
		public static final String SELECT_USER2 = "SELECT * FROM User2 WHERE userid=?";
		public static final String SELECT_ALL_USER2 = "SELECT * FROM User2";
		public static final String UPDATE_USER2 = "UPDATE User2 SET "
													+ "name = ?,"
													+ "birth = ?,"
													+ "addr = ? "
													+ "WHERE userid = ?";
		public static final String DELETE_USER2 = "DELETE FROM User2 WHERE userid=?";
	
	
}
