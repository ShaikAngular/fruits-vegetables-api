package commergingcolumns.differenttables.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;

@Entity
//@Table(name="fruits")
//@SecondaryTable(name="vegetables")
@Subselect("select * from fruits " + "union select * from vegetables")
@Synchronize({"fruits", "vegetables"})
@Immutable
public class FruitsAndVegetablesEntity {
	
	 @Id
	 private int id;
	 private String tablename;
	 
	 
	 protected FruitsAndVegetablesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected FruitsAndVegetablesEntity(int id, String tablename) {
		super();
		this.id = id;
		this.tablename = tablename;
	}
	@Override
	public String toString() {
		return "FruitsAndVegetablesEntity [id=" + id + ", tablename=" + tablename + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	
	

//	@Id
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "fruit_id")
//    int fruit_id;
//	
//	@Column(name = "fruit_name")
//    String fruit_name;
//	
//	@Column(name = "fruit_price")
//    int fruit_price;
//	
//	@Column(name = "fruit_quantity")
//    int fruit_quantity;
//	
//	@Column(name = "fruit_location")
//    String fruit_location;
//	
////	<--vegetables-->
//	
//    @Column(name = "vegetable_id", table = "vegetables")
//    int vegetable_id;
//    
//    @Column(name = "vegetable_name", table = "vegetables")
//    String vegetable_name;
//	
//	@Column(name = "vegetable_price", table = "vegetables")
//    int vegetable_price;
//	
//	@Column(name = "vegetable_quantity",table = "vegetables")
//    int vegetable_quantity;
//	
//	@Column(name = "vegetable_location", table = "vegetables")
//    String vegetable_location;
//	
//	protected FruitsAndVegetablesEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	protected FruitsAndVegetablesEntity(int fruit_id, String fruit_name, int fruit_price, int fruit_quantity,
//		String fruit_location, int vegetable_id, String vegetable_name, int vegetable_price, int vegetable_quantity,
//		String vegetable_location) {
//	super();
//	this.fruit_id = fruit_id;
//	this.fruit_name = fruit_name;
//	this.fruit_price = fruit_price;
//	this.fruit_quantity = fruit_quantity;
//	this.fruit_location = fruit_location;
//	this.vegetable_id = vegetable_id;
//	this.vegetable_name = vegetable_name;
//	this.vegetable_price = vegetable_price;
//	this.vegetable_quantity = vegetable_quantity;
//	this.vegetable_location = vegetable_location;
//}
//
//	@Override
//	public String toString() {
//		return "FruitsAndVegetablesEntity [fruit_id=" + fruit_id + ", fruit_name=" + fruit_name + ", fruit_price="
//				+ fruit_price + ", fruit_quantity=" + fruit_quantity + ", fruit_location=" + fruit_location
//				+ ", vegetable_id=" + vegetable_id + ", vegetable_name=" + vegetable_name + ", vegetable_price="
//				+ vegetable_price + ", vegetable_quantity=" + vegetable_quantity + ", vegetable_location="
//				+ vegetable_location + "]";
//	}
//
//	public int getFruit_id() {
//		return fruit_id;
//	}
//
//	public void setFruit_id(int fruit_id) {
//		this.fruit_id = fruit_id;
//	}
//
//	public String getFruit_name() {
//		return fruit_name;
//	}
//
//	public void setFruit_name(String fruit_name) {
//		this.fruit_name = fruit_name;
//	}
//
//	public int getFruit_price() {
//		return fruit_price;
//	}
//
//	public void setFruit_price(int fruit_price) {
//		this.fruit_price = fruit_price;
//	}
//
//	public int getFruit_quantity() {
//		return fruit_quantity;
//	}
//
//	public void setFruit_quantity(int fruit_quantity) {
//		this.fruit_quantity = fruit_quantity;
//	}
//
//	public String getFruit_location() {
//		return fruit_location;
//	}
//
//	public void setFruit_location(String fruit_location) {
//		this.fruit_location = fruit_location;
//	}
//
//	public int getVegetable_id() {
//		return vegetable_id;
//	}
//
//	public void setVegetable_id(int vegetable_id) {
//		this.vegetable_id = vegetable_id;
//	}
//
//	public String getVegetable_name() {
//		return vegetable_name;
//	}
//
//	public void setVegetable_name(String vegetable_name) {
//		this.vegetable_name = vegetable_name;
//	}
//
//	public int getVegetable_price() {
//		return vegetable_price;
//	}
//
//	public void setVegetable_price(int vegetable_price) {
//		this.vegetable_price = vegetable_price;
//	}
//
//	public int getVegetable_quantity() {
//		return vegetable_quantity;
//	}
//
//	public void setVegetable_quantity(int vegetable_quantity) {
//		this.vegetable_quantity = vegetable_quantity;
//	}
//
//	public String getVegetable_location() {
//		return vegetable_location;
//	}
//
//	public void setVegetable_location(String vegetable_location) {
//		this.vegetable_location = vegetable_location;
//	}
//
//	
//	


}
