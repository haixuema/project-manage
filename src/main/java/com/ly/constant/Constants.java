package com.ly.constant;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	// 楠岃瘉鐮佺殑瀛椾綋搴�
	protected static Font[] codeFont = { new Font("Times New Roman", Font.PLAIN, 30),
			new Font("Times New Roman", Font.PLAIN, 30), new Font("Times New Roman", Font.PLAIN, 30),
			new Font("Times New Roman", Font.PLAIN, 30) };

	// 楠岃瘉鐮佹暟瀛楅鑹插簱
	protected static Color[] color = { Color.BLACK, Color.RED, Color.DARK_GRAY, Color.BLUE };

	// 楠岃瘉鐮佺殑瀛楃搴�
	protected static final String IMAGE_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	// 楠岃瘉鐮佺殑瀹藉害
	protected static final Integer IMAGE_WIDTH = 120;

	// 楠岃瘉鐮佺殑楂樺害
	protected static final Integer IMAGE_HEIGHT = 40;
	
	/**
	 * 楠岃瘉鐮�
	 */
	public static String CHECK_NUMBER_NAME = "identify_code";
	
	/**
	 * session涓殑鐢ㄦ埛id
	 */
	public static String USER_KEY = "user";
	/**
	 * session涓殑椤圭洰id
	 */
	public static String PROJECT_KEY = "project";
	/**
	 * session 鏂囦欢鍚�
	 */
	public static String FILE_NAME = "file";
}
