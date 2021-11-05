package com.geruman.monstruos;

public class VampirosObserver extends MonsterObserver {
	
	public VampirosObserver(MonstersHub monstruos) {
		super(monstruos);
	}

	@Override
	public void update() {
		System.out.println("Ahora hay "+monstruos.getVampiros()+" vampiros");
	}

}
