package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosMexicanosDolares(double valor) {
		double monedaDolar = valor / 17.47;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesosMexicanosEuros(double valor) {
		double monedaEuro = valor / 18.49;
		monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesosMexicanosLibra(double valor) {
		double monedaLibra = valor / 21.32;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosMexicanosYen(double valor) {
		double monedaYen = valor / 0.12;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirPesosMexicanosWon(double valor) {
		double monedaWon = valor / 0.013;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	
	public void ConvertirDolaresPesosMexicanos(double valor) {
		double monedaDolar =  valor * 17.47;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertirEurosPesosMexicanos(double valor) {
		double monedaEuro = valor * 18.49;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	public void ConvertirLibraPesosMexicanos(double valor) {
		double monedaLibra = valor * 21.32;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	public void ConvertirYenPesosMexicanos(double valor) {
		double monedaYen = valor * 0.12;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}
	public void ConvertirWonPesosMexicanos(double valor) {
		double monedaWon = valor * 0.013;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
	}

}
