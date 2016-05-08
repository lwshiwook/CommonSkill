package com.lwshiwook.comskill.support;

public enum SkillType {
	
	主动技能("ACT_SKILL"),被动技能("PASSIVE_SKILL");
	
	private String type;
	
	public String getType() {
		return type;
	}

	private SkillType(String type) {
		this.type = type;
	}

}
