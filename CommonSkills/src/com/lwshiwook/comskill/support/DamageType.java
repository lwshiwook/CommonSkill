package com.lwshiwook.comskill.support;

public enum DamageType {
	
	PHY_DAMAGE("物理伤害"),
	SPL_DAMAGE("魔法伤害"),
	TRU_DAMAGE("真实伤害");
	
	private String tip;
	
	private DamageType(String tip) {
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}
}