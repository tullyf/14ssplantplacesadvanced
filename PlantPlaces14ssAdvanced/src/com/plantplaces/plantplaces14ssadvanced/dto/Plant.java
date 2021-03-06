package com.plantplaces.plantplaces14ssadvanced.dto;

public class Plant {

	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getCultivar() {
		return cultivar;
	}
	public void setCultivar(String cultivar) {
		this.cultivar = cultivar;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public int getMaxHeight() {
		return maxHeight;
	}
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}
	public boolean isEdible() {
		return edible;
	}
	public void setEdible(boolean edible) {
		this.edible = edible;
	}
	public boolean isRecommended() {
		return recommended;
	}
	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getGuid() {
		return guid;
	}
	public void setGuid(int guid) {
		this.guid = guid;
	}
	String genus;
	String species;
	String cultivar;
	String common;
	int maxHeight;
	boolean edible;
	boolean recommended;
	// local database ID
	long id;
	// Global Unique Identifier, from PlantPlaces.com
	int guid;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return genus + " " + species + " " + common;
	}
	
}
