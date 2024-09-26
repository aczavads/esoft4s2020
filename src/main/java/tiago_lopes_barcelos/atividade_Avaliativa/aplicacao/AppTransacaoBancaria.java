package tiago_lopes_barcelos.atividade_Avaliativa.aplicacao;

import java.util.Scanner;

import tiago_lopes_barcelos.atividade_Avaliativa.entidades.ContaEmpresa;
import tiago_lopes_barcelos.atividade_Avaliativa.entidades.ContaPoupanca;
import tiago_lopes_barcelos.atividade_Avaliativa.entidades.ContaUnitaria;


public class AppTransacaoBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ContaUnitaria x = new ContaUnitaria(1020, "Tiago Barcelos", 550.50);
		ContaEmpresa y = new ContaEmpresa();
		ContaPoupanca c = new ContaPoupanca();
		
		System.out.println("Dados do cliente: \n" + 
							"Numero da conta: " + x.getNumeroDaConta() + "\n" +
							"Nome do Titular: " + x.getTitular());
		System.out.println("\n");
		System.out.println("Tiago Barcelos, o seu saldo atual é: R$" + x.getSaldo());
		
		x.saque(100.0);
		
		System.out.println("Saldo atual após o saque: R$" + x.getSaldo());
		
		
	}

}
