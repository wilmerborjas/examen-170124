package com.wbg.examen.app;

import com.wbg.examen.app.animales.Gato;
import com.wbg.examen.app.animales.Perro;
import com.wbg.examen.app.articulos.Computador;
import com.wbg.examen.app.articulos.Escritorio;

public class Miapp {

	public static void main(String[] args) {

		Perro perro = new Perro();
		perro.setRaza("chauchau");
		perro.setColor("cafe");
		perro.setPeso(10.50);

		Computador computador = new Computador();
		computador.setColor("negro");
		computador.setMarca("Acer");
		computador.setPantalla(1);

		Gato gato = new Gato();
		gato.setCantidadPatas(4);
		gato.setPeso(11.2);
		gato.setRaza("miau");

		Escritorio escritorio = new Escritorio();

		System.out.println("hola mundo");
	}

}