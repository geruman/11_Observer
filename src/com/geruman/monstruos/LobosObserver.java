package com.geruman.monstruos;

public class LobosObserver extends MonsterObserver {

	public LobosObserver(MonstersHub monstruos) {
		super(monstruos);
	}

	@Override
	public void update() {
		System.out.println("Ahora hay "+monstruos.getLobos()+" lobos");

	}

}
