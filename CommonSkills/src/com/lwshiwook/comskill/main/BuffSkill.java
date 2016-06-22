package com.lwshiwook.comskill.main;

import com.lwshiwook.comskill.battle.IBattleAgent;
import com.lwshiwook.comskill.support.SkillConfig;

public class BuffSkill extends Skill {
	
	private long createTime; //buff创建时间
	private long timeDuring; //buff持续时间
	private int isDispelable; //是否可驱散
	
	private BuffSkill(){}
	
	public long getTimeLeft(long timeNow) {
		return timeDuring - (timeNow - createTime);
	}

	public int getIsDispelable() {
		return isDispelable;
	}

	public void setIsDispelable(int isDispelable) {
		this.isDispelable = isDispelable;
	}
	
	public void apply(IBattleAgent ba){
		effects.forEach(c -> {
			c.doEffectToTarget(ba);
		});
	}
	
	public void dispel(IBattleAgent ba){
		effects.forEach(c -> {
			c.recoverEffect(ba);
		});
	}

	@Override
	public void updatePulse() {
		
	}

	@Override
	public void build(SkillConfig config, Object... param) {
		
	}
	
	

}
