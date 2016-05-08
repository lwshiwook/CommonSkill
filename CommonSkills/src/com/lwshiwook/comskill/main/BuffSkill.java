package com.lwshiwook.comskill.main;

import com.lwshiwook.comskill.effect.IBattleAgent;
import com.lwshiwook.comskill.support.SkillConfig;

public class BuffSkill extends Skill {
	
	public BuffSkill(SkillConfig conf) {
		this.config = conf;
	}
	
	public void apply(IBattleAgent ba){
		effects.forEach(c -> {
			c.doEffectToTarget(ba);
		});
	}
	
	public void cancel(IBattleAgent ba){
		effects.forEach(c -> {
			c.recoverEffect(ba);
		});
	}

}
