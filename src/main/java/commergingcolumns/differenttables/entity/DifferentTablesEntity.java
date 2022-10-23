package commergingcolumns.differenttables.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vegetables")

public class DifferentTablesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vegetable_id")
    int vegetable_id;
	
	protected DifferentTablesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected DifferentTablesEntity(int vegetable_id, String vegetable_name, int vegetable_price,
			int vegetable_quantity, String vegetable_location) {
		super();
		this.vegetable_id = vegetable_id;
		this.vegetable_name = vegetable_name;
		this.vegetable_price = vegetable_price;
		this.vegetable_quantity = vegetable_quantity;
		this.vegetable_location = vegetable_location;
	}

	@Override
	public String toString() {
		return "DifferentTablesEntity [vegetable_id=" + vegetable_id + ", vegetable_name=" + vegetable_name
				+ ", vegetable_price=" + vegetable_price + ", vegetable_quantity=" + vegetable_quantity
				+ ", vegetable_location=" + vegetable_location + "]";
	}

	public int getVegetable_id() {
		return vegetable_id;
	}

	public void setVegetable_id(int vegetable_id) {
		this.vegetable_id = vegetable_id;
	}

	public String getVegetable_name() {
		return vegetable_name;
	}

	public void setVegetable_name(String vegetable_name) {
		this.vegetable_name = vegetable_name;
	}

	public int getVegetable_price() {
		return vegetable_price;
	}

	public void setVegetable_price(int vegetable_price) {
		this.vegetable_price = vegetable_price;
	}

	public int getVegetable_quantity() {
		return vegetable_quantity;
	}

	public void setVegetable_quantity(int vegetable_quantity) {
		this.vegetable_quantity = vegetable_quantity;
	}

	public String getVegetable_location() {
		return vegetable_location;
	}

	public void setVegetable_location(String vegetable_location) {
		this.vegetable_location = vegetable_location;
	}

	@Column(name = "vegetable_name")
    String vegetable_name;
	
	@Column(name = "vegetable_price")
    int vegetable_price;
	
	@Column(name = "vegetable_quantity")
    int vegetable_quantity;
	
	@Column(name = "vegetable_location")
    String vegetable_location;

}
