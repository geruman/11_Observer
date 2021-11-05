package com.geruman.monstruos;

public abstract class MonsterObserver {
	protected MonstersHub monstruos;
	public MonsterObserver(MonstersHub monstruos) {
		this.monstruos = monstruos;
		monstruos.addObserver(this);
	}
	public abstract void update();
}
