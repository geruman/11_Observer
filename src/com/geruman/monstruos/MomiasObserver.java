package com.geruman.monstruos;

public class MomiasObserver extends MonsterObserver {

	public MomiasObserver(MonstersHub monstruos) {
		super(monstruos);
	}

	@Override
	public void update() {
		System.out.println("Ahora hay "+monstruos.getMomias()+" momias");
	}

}
