package com.springiocinternals;

public class SingletonScope {

	private Integer sSId;

	private PrototypeScope prototypeScope;
	
	public SingletonScope() {
	}

	public Integer getsSId() {
		return sSId;
	}

	public void setsSId(Integer sSId) {
		this.sSId = sSId;
	}

	public PrototypeScope getPrototypeScope() {
		return prototypeScope;
	}

	public void setPrototypeScope(PrototypeScope prototypeScope) {
		this.prototypeScope = prototypeScope;
	}

	@Override
	public String toString() {
		return "SingletonScope [sSId=" + sSId + ", prototypeScope=" + getPrototypeScope() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
