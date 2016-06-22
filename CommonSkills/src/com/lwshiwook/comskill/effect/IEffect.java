package com.lwshiwook.comskill.effect;

import java.util.List;

import com.lwshiwook.comskill.battle.IGameUnit;

public interface IEffect {
	
	void doEffect(List<IGameUnit> targets);
	
	void recover(List<IGameUnit> targets);
	
	long getUid();
	
	int getPriority();

}
