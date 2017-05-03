package tests;

import org.junit.Before;
import org.junit.Test;

import exceptions.*;
import models.*;

public class ListaOrdenadaTest {

	private ListaOrdenada<Integer> miLista;

	@Test
	public void AddSuccess() {
		assert (miLista.add(55));
	}

	@Before
	public void Setup() {
		miLista = new ListaOrdenada<Integer>((Integer a, Integer b) -> (b - a));
	}
}
