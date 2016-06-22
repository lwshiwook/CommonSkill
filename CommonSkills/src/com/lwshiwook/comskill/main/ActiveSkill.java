package com.lwshiwook.comskill.main;


import java.util.List;

import com.lwshiwook.comskill.battle.IBattleAgent;
import com.lwshiwook.comskill.battle.IGameUnit;
import com.lwshiwook.comskill.effect.IEffect;
import com.lwshiwook.comskill.support.SkillConfig;

public class ActiveSkill extends Skill {
	
	private ActiveSkill(){}

	public void cast(){
		effects.forEach(c -> {
			c.doEffect(aimTarget(c));
		});
	}

	@Override
	public void updatePulse() {
		
	}

	@Override
	public void build(SkillConfig config, Object... param) {
		
	}

	@Override
	public List<IGameUnit> findEffected(long effectUid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IGameUnit> aimTarget(IEffect effect) {
		// TODO Auto-generated method stub
		return null;
	}
}
