package com.geruman;

import com.geruman.monstruos.LobosObserver;
import com.geruman.monstruos.MomiasObserver;
import com.geruman.monstruos.MonstersHub;
import com.geruman.monstruos.VampirosObserver;

public class ObserverDemoMain {

	public static void main(String[] args) {
		MonstersHub monstruos = new MonstersHub();
		new VampirosObserver(monstruos);
		new MomiasObserver(monstruos);
		new LobosObserver(monstruos);
		System.out.println("Update Lobos");
		monstruos.setLobos(4);
		System.out.println("Update Momias");
		monstruos.setMomias(8);
		System.out.println("Update Vampiros");
		monstruos.setVampiros(10);
		System.out.println("Update Vampiros");
		monstruos.setVampiros(5);
		System.out.println("Update Lobos");
		monstruos.setLobos(7);
		System.out.println("Update Momias");
		monstruos.setMomias(3);
		System.out.println("Update Momias");
		monstruos.setMomias(9);
		System.out.println("Update Vampiros");
		monstruos.setVampiros(5);
		System.out.println("Update Lobos");
		monstruos.setLobos(7);
	}
}
