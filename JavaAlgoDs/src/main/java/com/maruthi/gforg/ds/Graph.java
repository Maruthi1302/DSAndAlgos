package com.maruthi.gforg.ds;

import java.util.LinkedList;

public class Graph<T> {

	private T data;
	private LinkedList<Graph<T>> neighbours = new LinkedList<Graph<T>>();

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedList<Graph<T>> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(LinkedList<Graph<T>> neighbours) {
		this.neighbours = neighbours;
	}

	public void addNeighbour(Graph<T> neighbour) {
		neighbours.add(neighbour);
	}

	public Graph<T> removeNeighbour() {
		return neighbours.removeLast();
	}

}
