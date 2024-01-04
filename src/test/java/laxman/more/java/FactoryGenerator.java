package laxman.more.java;

import org.testng.annotations.Factory;

import runclasstests.jenkinstest;
public class FactoryGenerator {

	@Factory
	public Object[] generateFactory() {
		
		 return new Object[] {new jenkinstest(),
				                   new jenkinstest(),
				                   new jenkinstest(),
				                   new jenkinstest(),
				                   new jenkinstest()
				                   };
	
		
	}
}
