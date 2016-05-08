package com.lwshiwook.comskill.main;


import com.lwshiwook.comskill.effect.IBattleAgent;
import com.lwshiwook.comskill.support.SkillConfig;

public class ActiveSkill extends Skill {

	public ActiveSkill(SkillConfig conf) {
		this.config = conf;
	}
	
	public void cast(IBattleAgent ba){
		effects.forEach(c -> {
			c.doEffectToTarget(ba);
		});
	}
}
