package com.springiocinternals;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitDestroyBean {
	
	private String name;
	
	public void init() {
		System.out.println("InitDestroyBean.init() :: before :: "+getName());
		setName("raghuram");
		System.out.println("InitDestroyBean.init() :: after :: "+ getName());
	}
	
	public void destroy() {
		name = null;
		System.out.println("InitDestroyBean.destroy() - nullifying resources before GC :: " + getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("InitDestroyBean.postConstruct() :: before :: "+getName());
		setName("seetaram");
		System.out.println("InitDestroyBean.postConstruct() :: after :: "+ getName());
	}
	
	@PreDestroy
	public void preDestroy() {
		name = null;
		System.out.println("InitDestroyBean.preDestroy() - nullifying resources before GC :: " + getName());
	}
	

}
