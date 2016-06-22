package com.lwshiwook.comskill.battle;

import com.lwshiwook.comskill.battle.pack.Damage;

public abstract class IGameUnit {
	
	private IBattleAgent agent;

	public IBattleAgent getAgent() {
		return agent;
	}

	public void setAgent(IBattleAgent agent) {
		this.agent = agent;
	}


	public void beingHit(Damage damage){
		agent.addPack(damage);
	}

}
