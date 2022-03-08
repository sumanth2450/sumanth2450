package com.antra.sorting;

/**
 * @author Sivakanth
 */
public class ProductModel {

	public ProductModel(Integer pId, Double pCost, String vendor) {

		this.pId = pId;
		this.pCost = pCost;
		this.vendor = vendor;
	}

	private Integer pId;

	private Double pCost;

	private String vendor;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Double getpCost() {
		return pCost;
	}

	public void setpCost(Double pCost) {
		this.pCost = pCost;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "ProductModel [pId=" + pId + ", pCost=" + pCost + ", vendor=" + vendor + "]";
	}
}