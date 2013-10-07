package com.OMM.application.server.model;

import java.util.ArrayList;
public class Ceap {
	
public Ceap (int id, Parlamentar parlamentar ) {
		
		
		this.idCeap = id;  
		
		this.parlamentarCeap = parlamentar;
		
	}
	
	
	 private int idCeap;
	 
	 private double valorCeap;
	 
	 private Parlamentar parlamentarCeap;
	 
	 private ArrayList< Double > gastosMensaisCeap;

	public int getIdCeap() {
		return idCeap;
	}

	public void setIdCeap(int idCeap) {
		this.idCeap = idCeap;
	}

	public double getValorCeap() {
		return valorCeap;
	}

	public void setValorCeap(double valorCeap) {
		this.valorCeap = valorCeap;
	}

	public Parlamentar getParlamentarCeap() {
		return parlamentarCeap;
	}

	public void setParlamentarCeap(Parlamentar parlamentarCeap) {
		this.parlamentarCeap = parlamentarCeap;
	}

	public ArrayList<Double> getGastosMensaisCeap() {
		return gastosMensaisCeap;
	}

	public void setGastosMensaisCeap(ArrayList<Double> gastosMensaisCeap) {
		this.gastosMensaisCeap = gastosMensaisCeap;
	}
	
	

}
