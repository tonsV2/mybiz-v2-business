package dk.fitfit.mybiz.business.domain;

// TODO: This is not a domain object and does therefor not belong in the package dk.fitfit.mybiz.business.domain
public interface Priceable {
	double getVat();
	double getPriceExVat();
	double getPrice();
}
