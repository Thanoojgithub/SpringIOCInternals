package com.springiocinternals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			Employee employee  = (Employee)applicationContext.getBean("employee");
			System.out.println(employee);
			
			SingletonScope singletonScope1  = (SingletonScope)applicationContext.getBean("singletonScope");
			System.out.println(singletonScope1);
			SingletonScope singletonScope2  = (SingletonScope)applicationContext.getBean("singletonScope");
			System.out.println(singletonScope2);
			
			FactoryMethodBean factoryMethodBean1  = (FactoryMethodBean)applicationContext.getBean("factoryMethodBean");
			System.out.println(factoryMethodBean1);
			FactoryMethodBean factoryMethodBean2  = (FactoryMethodBean)applicationContext.getBean("factoryMethodBean");
			System.out.println(factoryMethodBean2);
			
			Object factoryBeanObject  = applicationContext.getBean("factoryBean");
			if(factoryBeanObject instanceof Circle){
				Circle circle = (Circle)factoryBeanObject;
				circle.draw();
			}
			InitDestroyBean initDestroyBean  = (InitDestroyBean)applicationContext.getBean("initDestroyBean");
			System.out.println("InitDestroyBean - name :: "+initDestroyBean.getName());
			
			PrimaryQualifier primaryQualifier  = (PrimaryQualifier)applicationContext.getBean("primaryQualifier");
			System.out.println("primaryQualifier  :: "+primaryQualifier);
			
		}
	}

}
