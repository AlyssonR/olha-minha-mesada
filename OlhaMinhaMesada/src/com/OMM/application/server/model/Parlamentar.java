package com.OMM.application.server.model;

import java.util.ArrayList;

public class Parlamentar {
	
		
		public Parlamentar(String nomeParlamentar ){
			
			this.nomeParlamentar  = nomeParlamentar;
		}
		
		
		private int idParlamentar;
		
		private String nomeParlamentar;
		
		private String partidoParlamentar;
		
		private String ufParlamentar;
		
		private double salarioParlamentar;
		
		private int tipoParlamentar;
		
		private ArrayList < Ceap > ceapsParlamentar;

		public int getIdParlamentar() {
			return idParlamentar;
		}

		public void setIdParlamentar(int idParlamentar) {
			this.idParlamentar = idParlamentar;
		}

		public String getNomeParlamentar() {
			return nomeParlamentar;
		}

		public void setNomeParlamentar(String nomeParlamentar) {
			this.nomeParlamentar = nomeParlamentar;
		}

		public String getPartidoParlamentar() {
			return partidoParlamentar;
		}

		public void setPartidoParlamentar(String partidoParlamentar) {
			this.partidoParlamentar = partidoParlamentar;
		}

		public String getUfParlamentar() {
			return ufParlamentar;
		}

		public void setUfParlamentar(String ufParlamentar) {
			this.ufParlamentar = ufParlamentar;
		}

		public double getSalarioParlamentar() {
			return salarioParlamentar;
		}

		public void setSalarioParlamentar(double salarioParlamentar) {
			this.salarioParlamentar = salarioParlamentar;
		}

		public int getTipoParlamentar() {
			return tipoParlamentar;
		}

		public void setTipoParlamentar(int tipoParlamentar) {
			this.tipoParlamentar = tipoParlamentar;
		}

		public ArrayList<Ceap> getCeapsParlamentar() {
			return ceapsParlamentar;
		}

		public void setCeapsParlamentar(ArrayList<Ceap> ceapsParlamentar) {
			this.ceapsParlamentar = ceapsParlamentar;
		}
	
	

}
