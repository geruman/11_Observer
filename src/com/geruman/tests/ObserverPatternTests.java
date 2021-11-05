package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.monstruos.LobosObserver;
import com.geruman.monstruos.MomiasObserver;
import com.geruman.monstruos.MonstersHub;
import com.geruman.monstruos.VampirosObserver;

class ObserverPatternTests {

	@Test
	void MonstersHubTest() {
		MonstersHub monstruos = new MonstersHub();
		monstruos.setVampiros(10);
		assertEquals(10, monstruos.getVampiros());
		monstruos.setMomias(5);
		assertEquals(5,monstruos.getMomias());
		monstruos.setLobos(7);
		assertEquals(7,monstruos.getLobos());
	}
	@Test
	void vampirosObserverTest() {
		MonstersHub monstruos = new MonstersHub();
		VampirosObserver vampirosView = new VampirosObserver(monstruos);
		assertNotNull(vampirosView);
	}
	@Test
	void momiasObserverTest() {
		MonstersHub monstruos = new MonstersHub();
		MomiasObserver momiasView = new MomiasObserver(monstruos);
		assertNotNull(momiasView);
	}
	@Test
	void lobosObserverTest() {
		MonstersHub monstruos = new MonstersHub();
		LobosObserver lobosView = new LobosObserver(monstruos);
		assertNotNull(lobosView);
	}
	

}
