package com.rt.programs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rt.programs.ConnectionFactory;
import com.rt.programs.Owner;




public class OwnerDAO  {
	
	Connection con=ConnectionFactory.getConnection();
	
	ResultSet rs = null;
	ResultSet rsMax = null;
	
	int ID;
	int count;
	

	public  ResultSet findAll() 
	{
		String query = "Select * from Owners";
		try {
			Statement stm = con.createStatement();
			 rs=stm.executeQuery(query);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return(rs);
	}
	
	public void findByID(Owner ow) 
	{
		String query = "Select * from Owners where ID="+ow.getId();
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			
			/*rs.next();
			
				System.out.println("ID ="+rs.getInt(1)+ "first_name=" +rs.getString(2) +"last_name="+ rs.getString(3)+"address=" +rs.getString(4)	+"city=" +rs.getString(5)+" telephone="+ rs.getString(6));*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet findByName(String name) 
	{
		String query = "Select * from Owners where first_name='"+name+"'";
		try {
			Statement stm = con.createStatement();
			rs = stm.executeQuery(query);
			/*rs.next();
			
			System.out.println("ID ="+rs.getInt(1)+ "first_name=" +rs.getString(2) +"last_name="+ rs.getString(3)+"address=" +rs.getString(4)	+"city=" +rs.getString(5)+" telephone="+ rs.getString(6));*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return(rs);
	}
	public int insertOwner(Owner ow)
	{
		
		String maxIDQuery = "Select Max(ID) from Owners";
		Statement stmMaxID,stm;
		try {
			stmMaxID = con.createStatement();
			
			rsMax = stmMaxID.executeQuery(maxIDQuery);
			rsMax.next();
			 ID=rsMax.getInt(1);
			
				System.out.println("ID ="+rsMax.getInt(1));
		
			//.out.println(maxID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String query ="INSERT INTO Owners VALUES ('"+( ID+1)+"','"+ow.getFirst_name()+"','"+ow.getLast_name()+"','"+ow.getAddress()+"','"+ow.getCity()+"','"+ow.getTelephone()+"')";
		try {
			 stm = con.createStatement();
			 count=stm.executeUpdate(query);
			System.out.println("No Of rows inserted ="+count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
		

	}
	
	public void deleteOwner(Owner ow)
	{
		
		String query ="Delete From Owners where id ="+ow.getId();
		try {
			Statement stm = con.createStatement();
			int count=stm.executeUpdate(query);
			System.out.println("No Of rows Deleted ="+count);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	public void  updateOwner(Owner ow)
	{
		int count;
		String UpdateQuery="UPDATE Owners SET first_name = ? , last_name = ?,address = ?,city = ?,telephone = ? WHERE ID = ?";
		try {
			PreparedStatement preStm=con.prepareStatement(UpdateQuery);
			System.out.println( ow.getFirst_name());
			preStm.setString(1, ow.getFirst_name());
			preStm.setString(2,ow.getLast_name());
			preStm.setString(3,ow.getAddress());
			preStm.setString(4,ow.getCity());
			preStm.setString(5,ow.getTelephone());
			preStm.setInt(6, ow.getId());
			count= preStm.executeUpdate();
			System.out.println(preStm);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
