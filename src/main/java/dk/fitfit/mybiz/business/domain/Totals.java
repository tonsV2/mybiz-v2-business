package dk.fitfit.mybiz.business.domain;

import java.util.List;

//TODO: Better name?
public class Totals<T extends Priceable> {
	private List<T> entities;

	public Totals(List<T> entities) {
		this.entities = entities;
	}

	public double getVat() {
		return entities
				.stream()
				.mapToDouble(Priceable::getVat)
				.sum();
	}

	public double getPriceExVat() {
		return entities
				.stream()
				.mapToDouble(Priceable::getPriceExVat)
				.sum();
	}

	public List<T> getEntities() {
		return entities;
	}
}
