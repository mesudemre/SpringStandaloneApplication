package com.mesutemre.susa.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	@Autowired
	private DataSource ds;

	public void writeMessage(String msg){
		System.out.println("--------MESAJINIZ--------");
		System.out.println(msg);
		System.out.println("-------------------------");
		
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
