package com.mibs.asterisk;

public class Utils {

	public static String dbhost;
	public static  String dbname;
	public static  String dbuser;
	public static  String dbpassword;

	public static String dsURL( ) {
		return "jdbc:mysql://" + dbhost + ":3306/" + dbname + "?useUnicode=yes&characterEncoding=UTF-8";
	}

}
