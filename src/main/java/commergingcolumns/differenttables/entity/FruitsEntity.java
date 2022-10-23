package commergingcolumns.differenttables.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fruits")
public class FruitsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fruit_id")
    int fruit_id;
	
	@Column(name = "fruit_name")
    String fruit_name;
	
	@Column(name = "fruit_price")
    int fruit_price;
	
	

	@Column(name = "fruit_quantity")
    int fruit_quantity;
	
	@Column(name = "fruit_location")
    String fruit_location;
	
	
	protected FruitsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected FruitsEntity(int fruit_id, String fruit_name, int fruit_price, int fruit_quantity,
			String fruit_location) {
		super();
		this.fruit_id = fruit_id;
		this.fruit_name = fruit_name;
		this.fruit_price = fruit_price;
		this.fruit_quantity = fruit_quantity;
		this.fruit_location = fruit_location;
	}

	@Override
	public String toString() {
		return "FruitsEntity [fruit_id=" + fruit_id + ", fruit_name=" + fruit_name + ", fruit_price=" + fruit_price
				+ ", fruit_quantity=" + fruit_quantity + ", fruit_location=" + fruit_location + "]";
	}

	public int getFruit_id() {
		return fruit_id;
	}

	public void setFruit_id(int fruit_id) {
		this.fruit_id = fruit_id;
	}

	public String getFruit_name() {
		return fruit_name;
	}

	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public int getFruit_price() {
		return fruit_price;
	}

	public void setFruit_price(int fruit_price) {
		this.fruit_price = fruit_price;
	}

	public int getFruit_quantity() {
		return fruit_quantity;
	}

	public void setFruit_quantity(int fruit_quantity) {
		this.fruit_quantity = fruit_quantity;
	}

	public String getFruit_location() {
		return fruit_location;
	}

	public void setFruit_location(String fruit_location) {
		this.fruit_location = fruit_location;
	}

	

}
