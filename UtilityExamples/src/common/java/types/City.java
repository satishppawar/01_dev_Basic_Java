package common.java.types;

public enum City {

	Pune(1), MUMBAI(2), MANGALWEDHA(3), SOLAPUR(4),SATARA(5);
	private int cityId;

	private City(int cityId) {
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

}
