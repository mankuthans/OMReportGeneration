package com.rajesh.test;

import java.lang.reflect.Field;

import com.allcorp.premium.common.dto.policy.PersonalUmbrellaPolicyDTO;
import com.allcorp.premium.common.dto.policy.PolicyDTO;
import com.allcorp.premium.common.dto.policy.auto.AutoPolicyDTO;
import com.allcorp.premium.common.dto.policy.property.PropertyPolicyDTO;

public class XpathGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("Starting....");
			Field[] myFields = PersonalUmbrellaPolicyDTO.class.getDeclaredFields();
			for(Field myField : myFields) {
				String nodeType = myField.getType().getName().startsWith("com.allcorp.premium")? "COMPLEX":"SIMPLE";
				System.out.println(myField.getDeclaringClass().getSimpleName() + "/" + myField.getName() /*+ "," + nodeType*/);
			}
			
		}
		catch(Exception myException) {
			myException.printStackTrace();
		}

	}

}
