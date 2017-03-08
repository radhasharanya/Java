package com.rt.programs.dao;

import java.sql.Connection;

import java.sql.Statement;
import java.util.Scanner;

import com.rt.programs.ConnectionFactory;
import com.rt.programs.Pet;

import java.sql.*;

public class PetDAO {
	
	Connection con = ConnectionFactory.getConnection();
	ResultSet rs = null;
	

	public void findAll() 
	{
		String query = "Select * from Pets";
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				int id = rs.getInt(1);
				String Name = rs.getString(2);
				Date DOB=rs.getDate(3);
				int type_id = rs.getInt(4);
				int owner_id= rs.getInt(5);
				System.out.println(id + " " + " " + Name+"" +DOB+""+type_id+""+owner_id);
			}

		} catch (Exception e) {

		}
	}
	public void findbyID(Pet p)
	{
		System.out.println("********************"+p.getId());
		//int pid=p.getId();
		String query = "Select * from Pets where id ="+p.getId();
		try {
			Statement stm1 = con.createStatement();
			rs = stm1.executeQuery(query);
			rs.next();
			System.out.println(rs.getInt(1) + " " + " " + rs.getString(2)+"" +rs.getDate(3)+""+rs.getInt(4)+""+rs.getInt(5));
		

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
	}
	public void findbyName(Pet p)
	{
		
		String query = "Select * from Pets where name='"+p.getName() +"'" ;
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			rs.next();
			System.out.println(rs.getInt(1) + " " + " " + rs.getString(2)+"" +rs.getDate(3)+""+rs.getInt(4)+""+rs.getInt(5));
		con.close();	
		}

		 catch (Exception e) {
			 e.printStackTrace();

		}
		
		
		
	}
	public void UpdatePet(Pet p)
	{
		
		String query = "UPDATE pets SET name='rodhy' where name='" +p.getName()+"'";
		try {
			Statement stm = con.createStatement();
			int count=stm.executeUpdate(query);
			System.out.println("No Of rows Updated ="+count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*public void InsertPet(Pet p)
	{
		
		String query = "INSERT INTO Pets VALUES ("+ p.getId()+",'"+p.getName()+"',"+p.getBirth_date()+","+p.getType_id()+","+p.getOwner_id()+")";
		try {
			Statement stm = con.createStatement();
			int count=stm.executeUpdate(query);
			System.out.println("No Of rows Updated ="+count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}*/
	
}
