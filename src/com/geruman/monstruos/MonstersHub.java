package com.geruman.monstruos;

import java.util.ArrayList;
import java.util.List;

public class MonstersHub {

	private int vampiros;
	private int momias;
	private int lobos;
	private List<MonsterObserver> observers;
	public MonstersHub() {
		observers = new ArrayList<MonsterObserver>();
	}
	public int getVampiros() {
		return vampiros;
	}
	public void setVampiros(int vampiros) {
		this.vampiros = vampiros;
		updateObservers();
	}
	public int getMomias() {
		return momias;
	}
	public void setMomias(int momias) {
		this.momias = momias;
		updateObservers();
	}
	public int getLobos() {
		return lobos;
	}
	public void setLobos(int lobos) {
		this.lobos = lobos;
		updateObservers();
	}
	private void updateObservers() {
		for(MonsterObserver observer: observers) {
			observer.update();
		}
	}
	public void addObserver(MonsterObserver observer) {
		observers.add(observer);
	}
	

}
