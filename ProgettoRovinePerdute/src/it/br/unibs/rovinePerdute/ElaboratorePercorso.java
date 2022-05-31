package it.br.unibs.rovinePerdute;

import java.util.ArrayList;

public class ElaboratorePercorso {

	private int[][] mappa;
	private LettoreDati lettore;
	private int nCitta;

	public ElaboratorePercorso() {
		lettore= new LettoreDati();
		nCitta=lettore.getLuoghi().size();
		mappa= new int[nCitta][nCitta];
	}
	
	public void inizializzaMappa() {
		for(int i=0; i<nCitta; i++) {
			for(int j=0; j<nCitta; j++) {
				mappa[i][j]=0;
			}
		}
	}
	
	public void CreaMappa() {
		inizializzaMappa();
		for(int i=0; i<nCitta; i++) {
			for(int j=0; j<lettore.getLuoghi().get(i).getCollegamenti().length; j++) {
				mappa[i][lettore.getLuoghi().get(i).getCollegamento(j)]=1;
			}
		}
	}
	
	public void calcoloPercorsi() {
		ArrayList<Citta> percorsoT=new ArrayList<Citta>(),percorsoM= new ArrayList<Citta>();
		int carbT,carbM;
		boolean fatto=false;
		carbT=calcoloTonatiuh(percorsoT);
		carbM=calcoloMetztli(percorsoM);
		controlloPareggio(percorsoT, percorsoM, carbT, carbM, fatto);
	}

	private void controlloPareggio(ArrayList<Citta> percorsoT, ArrayList<Citta> percorsoM, int carbT, int carbM,boolean fatto) {
		if(carbT==carbM) {
			if(percorsoT.size()<percorsoM.size()) {
				System.out.println("Ha il percorso con meno città a pari carburante il gruppo Tonatiuh!! \n");
			}
			else if(percorsoT.size()>percorsoM.size()) {
				System.out.println("Ha il percorso con meno città a pari carburante il gruppo Metztli!! \n");
			}
			else {
				for(int i=0; i<nCitta && fatto!=true; i++) {
					if(percorsoT.get(i).getId()>percorsoM.get(i).getId()) {
						fatto=true;
						System.out.println("Ha il percorso con id più grande a pari carburante e pari numero d citta il gruppo Tonatiuh!! \n");
					}
					else if(percorsoT.get(i).getId()<percorsoM.get(i).getId()) {
						fatto=true;
						System.out.println("Ha il percorso con id più grande a pari carburante e pari numero d citta il gruppo Metztli!! \n");
					}
				}
			}
		}
	}

	private int calcoloMetztli(ArrayList<Citta> percorsoM) {
		
	}

	private int calcoloTonatiuh(ArrayList<Citta> percorsoT) {
		
	}
}
