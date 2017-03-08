package com.rt.programs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.rt.programs.ConnectionFactory;
import com.rt.programs.Vet;

public class VetDAO {
	Connection con = ConnectionFactory.getConnection();
	ResultSet rs = null;
	

	public void findAll() 
	{
		String query = "Select * from Vets";
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				System.out.println("ID ="+rs.getInt(1)+ "first_name=" +rs.getString(2) +"last_name="+ rs.getString(3));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void findByID(Vet v) 
	{
		String query = "Select * from Vets where ID="+v.getId();
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			rs.next();
			
			System.out.println("ID ="+rs.getInt(1)+ "first_name=" +rs.getString(2) +"last_name="+ rs.getString(3));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void findByName(Vet v) 
	{
		String query = "Select * from Vets where first_name='"+v.getFirst_name()+"'";
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			rs.next();
			
			System.out.println("ID ="+rs.getInt(1)+ "first_name=" +rs.getString(2) +"last_name="+ rs.getString(3));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void InsertVets(Vet v)
	{
		System.out.println(v.getId());
		System.out.println(v.getFirst_name());
		System.out.println(v.getLast_name());
		String query ="INSERT INTO Vets VALUES ('"+ v.getId()+"','"+v.getFirst_name()+"','"+v.getLast_name()+"')";
		try {
			Statement stm = con.createStatement();
			int count=stm.executeUpdate(query);
			System.out.println("No Of rows inserted ="+count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public void deleteVet(Vet v)
	{
		
		String query ="Delete From Vets where id ="+v.getId();
		try {
			Statement stm = con.createStatement();
			int count=stm.executeUpdate(query);
			System.out.println("No Of rows Deleted ="+count);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
