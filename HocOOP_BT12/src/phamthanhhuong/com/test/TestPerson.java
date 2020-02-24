package phamthanhhuong.com.test;

import java.util.ArrayList;

import phamthanhhuong.com.model.Man;
import phamthanhhuong.com.model.Person;
import phamthanhhuong.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person>dsPerson=new ArrayList<Person>();
		Person an=new Man(); 
		an.setFirstName("An");
		Person hong=new Woman();
		hong.setFirstName("Hồng");
		((Woman)hong).setWearingMakeup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p: dsPerson)
		{
			if(p instanceof Man)
			{
				System.out.println(p.getFirstName()+" là nam");
			}
			else if(p instanceof Woman)
			{
				System.out.println(p.getFirstName()+" là nữ");
			}
	}
	}

}
