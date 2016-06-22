package com.lwshiwook.comskill.main;


import com.lwshiwook.comskill.battle.IBattleAgent;
import com.lwshiwook.comskill.support.SkillConfig;

public class ActiveSkill extends Skill {
	
	private ActiveSkill(){}

	public void cast(IBattleAgent ba){
		getEffects().forEach(c -> {
			c.doEffectToTarget(ba);
		});
	}

	@Override
	public void updatePulse() {
		
	}

	@Override
	public void build(SkillConfig config, Object... param) {
		
	}
}
