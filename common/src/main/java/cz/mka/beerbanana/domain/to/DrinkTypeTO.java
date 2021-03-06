package cz.mka.beerbanana.domain.to;

import com.google.common.base.Objects;

import cz.mka.beerbanana.domain.enums.DrinkCategory;

public class DrinkTypeTO {

	private Long id;
	private String title;
	private DrinkCategory category;
	private Double volume;
	private Double percentage;
//	private List<ConsumerTO> drinkers; // todo mka

	public DrinkTypeTO() {
	}

	public DrinkTypeTO(Long id, String title, DrinkCategory category, double volume, double percentage) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.volume = volume;
		this.percentage = percentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DrinkCategory getCategory() {
		return category;
	}

	public void setCategory(DrinkCategory category) {
		this.category = category;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

/*	public List<ConsumerTO> getDrinkers() {
		return drinkers;
	}

	public void setDrinkers(List<ConsumerTO> drinkers) {
		this.drinkers = drinkers;
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DrinkTypeTO that = (DrinkTypeTO) o;
		return Objects.equal(id, that.id) &&
				Objects.equal(title, that.title) &&
				Objects.equal(category, that.category) &&
				Objects.equal(volume, that.volume) &&
				Objects.equal(percentage, that.percentage/*) &&
				Objects.equal(drinkers, that.drinkers*/); // todo mka
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, title, category, volume, percentage/*, drinkers*/);
	} // todo mka
}
