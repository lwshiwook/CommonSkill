package com.lwshiwook.comskill.main;

import java.util.List;

import com.lwshiwook.comskill.effect.IEffect;
import com.lwshiwook.comskill.support.SkillConfig;

public abstract class Skill {

	private List<IEffect> effects;
	
	public List<IEffect> getEffects() {
		return effects;
	}

	public void setEffects(List<IEffect> effects) {
		effects.sort((a,b) -> {
			return a.getPriority() - b.getPriority();
		});
		
		this.effects = effects;
	}

	protected SkillConfig config;
}
