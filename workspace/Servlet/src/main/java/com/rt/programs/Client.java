package com.rt.programs;


import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.spi.CalendarDataProvider;

import com.rt.programs.dao.OwnerDAO;

public class Client {

	public static void main(String[] args) {
		/*Pet p=new Pet();
		p.setId(1);
		p.setName("sly");
		p.setOwner_id(3);
		

		PetDAO pet=new PetDAO();
		pet.findAll();
		pet.findbyID(p);
		pet.findbyName(p);
		pet.UpdatePet(p);
		
		Pet petSave=new Pet();
		petSave.setId(14);
		petSave.setName("sly");
		petSave.setOwner_id(10);
		petSave.setBirth_date(new Date(2016/23/9));
		petSave.setType_id(10);
		*/
		//pet.InsertPet(petSave);
		Owner ow= new Owner();
		ow.setId(1);
		ow.setFirst_name("George");
		
		OwnerDAO owner=new OwnerDAO();
		//owner.findAll();
		//owner.findByID(ow);
		//owner.findByName(ow);
	
		Owner ownsave= new Owner();
		//ownsave.setId(12);
		ownsave.setFirst_name("caroline");
		ownsave.setLast_name("kadhukuri");
		ownsave.setAddress("chicago");
		ownsave.setCity("un");
		ownsave.setTelephone("12345678");
		owner.insertOwner(ownsave);
		//owner.deleteOwner(ow);
		
		/*Vet v= new Vet();
		v.setId(1);
		v.setFirst_name("james");
		
		VetDAO vet= new VetDAO();
		vet.findAll();
		vet.findByID(v);
		vet.findByName(v);
		
		Vet vetSave= new Vet();
		vetSave.setId(13);
		vetSave.setFirst_name("jimmy");
		//System.out.println(v.getFirst_name());
		vetSave.setLast_name("janny");
		
		vet.InsertVets(vetSave);
	*/	
	}

}
