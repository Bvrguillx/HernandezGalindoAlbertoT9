package models;

import java.util.*;

import exceptions.ColaExceededSizeException;
import exceptions.ElementNotAllowedException;
import exceptions.LaListaSeQuedaraVaciaException;
import exceptions.ListSizeOverflownException;

public class ListaOrdenada<B> extends ArrayList<B> {

	private final int MAX_TAM = 100;
	private final int MIN_TAM = 0;
	private Comparator<B> miComparador;

	public ListaOrdenada(Comparator<B> miComparador) {
		super();
		this.miComparador = miComparador;
	}

	@Override
	public boolean add(B elemento) {
		if (elemento != null) {
			if (this.size() < MAX_TAM) {
				return super.add(elemento);
			} else {
				throw new ListSizeOverflownException("NO QUEREMOS MAS");
			}
		} else {
			throw new ElementNotAllowedException("JAMAS ACEPTARE VALORES NULLS");
		}
	}

	@Override
	public boolean addAll(Collection<? extends B> coleccion) {
		if (coleccion.size() + this.size() < MAX_TAM) {
			return super.addAll(coleccion);
		} else {
			throw new ColaExceededSizeException("SOMOS DEMASIADOS ¡¡ NO CABEMOS !!");
		}
	}

	@Override
	public void add(int indice, B elemento) {
		if (elemento != null) {
			if (this.size() != MAX_TAM) {
				if (indice < MAX_TAM) {
					super.add(indice, elemento);
				} else {
					throw new ColaExceededSizeException("SOMOS DEMASIADOS INDICES");
				}
			} else {
				throw new ColaExceededSizeException("NO HAY ESPACIO PARA MAS ELEMENTOS");
			}
		} else {
			throw new ElementNotAllowedException("JAMAS ACEPTARE VALORES NULLS");
		}
	}

	// NUEVO METODO IMPLEMENTADO -- REVERSE

	public void reverse(Collection<? extends B> coleccion) {
		System.out.println("AQUI DEBO DE IMPRIMIR EL ORDEN INVERSO");
		System.out.println(coleccion.iterator());
	}

	@Override
	public B remove(int indice) {
		if (indice >= MIN_TAM) {
			return super.remove(indice);
		} else {
			throw new LaListaSeQuedaraVaciaException("LISTA VACIA");
		}
	}

	@Override
	public boolean remove(Object B) {
		if (this.size() >= MIN_TAM) {
			return super.remove(B);
		} else {
			throw new LaListaSeQuedaraVaciaException("LISTA VACIA");
		}
	}

	@Override
	public boolean addAll(int indice, Collection<? extends B> coleccion) throws ColaExceededSizeException {
		if (indice < MAX_TAM) {
			if (coleccion.size() + indice < MAX_TAM) {
				return super.addAll(indice, coleccion);
			} else {
				throw new ColaExceededSizeException("NO HAY ESPACIO PARA MAS");
			}
		} else {
			throw new ColaExceededSizeException("NO HAY ESPACIO PARA MAS");
		}
	}

	@Override
	public boolean removeAll(Collection<?> coleccion) {
		if (coleccion.size() <= this.size()) {
			return super.removeAll(coleccion);
		} else {
			throw new LaListaSeQuedaraVaciaException("LISTA VACIA");
		}
	}
	
	// INTENTO DEL METODO MIN PERO NADA AL FINAL ):
	
	// public B min(Collection<? extends B> coleccion, Comparator<B>
	// miComparador){
	// if (coleccion.size() > MIN_TAM){
	// return super.get(MIN_TAM);
	// } else {
	// throw new LaListaSeQuedaraVaciaException("LISTA VACIA");
	// }
	// }
}
